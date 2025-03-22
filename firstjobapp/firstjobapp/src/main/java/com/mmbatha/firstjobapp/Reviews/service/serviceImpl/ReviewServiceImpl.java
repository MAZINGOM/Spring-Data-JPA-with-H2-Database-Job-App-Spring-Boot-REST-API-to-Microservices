package com.mmbatha.firstjobapp.Reviews.service.serviceImpl;

import com.mmbatha.firstjobapp.Reviews.Review;
import com.mmbatha.firstjobapp.Reviews.repository.ReviewRepository;
import com.mmbatha.firstjobapp.Reviews.service.ReviewService;
import com.mmbatha.firstjobapp.company.Company;
import com.mmbatha.firstjobapp.company.service.Impl.CompanyService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final CompanyService companyService;

    public ReviewServiceImpl(ReviewRepository reviewRepository, CompanyService companyService) {
        this.reviewRepository = reviewRepository;
        this.companyService = companyService;
    }

    @Override
    public List<Review> getAllReviews(Long companyId) {

        List<Review> reviews = reviewRepository.findByCompanyId(companyId);
        return reviews;
    }

    @Override
    public boolean addReview(Long companyId, Review review) {

        Company company = companyService.getCompany(companyId);

        if (company != null) {
            review.setCompany(company);
            reviewRepository.save(review);
            return true;
        } else {
            return false;
        }

    }


    @Override
    public Review getReview(Long companyId, Long reviewId) {

        List<Review> reviews = reviewRepository.findByCompanyId(companyId);

        return reviews.stream().filter(review -> review.getId().equals(reviewId))
                .findFirst()
                .orElse(null);
    }

    @Override
    public boolean updateReview(Long companyId, Long reviewId, Review updatedReview) {
        if(companyService.getCompany(companyId) != null) {

            updatedReview.setCompany(companyService.getCompany(reviewId));
            updatedReview.setId(reviewId);

            reviewRepository.save(updatedReview);
            return true;
        }else {
            return false;
        }
    }

    @Override
    public boolean deleteCompanyReview(Long companyId ,Long reviewedId) {
        if (companyService.deleteCompanyById(companyId)
        && reviewRepository.existsById(reviewedId)){
              Review review = reviewRepository.findById(reviewedId).orElse(null);

              Company company = review.getCompany();
              company.getReviews().remove(review);
              review.setCompany(null);
              companyService.updateCompany(company,companyId);

              reviewRepository.deleteById(reviewedId);

              return  true;
        }else {
            return  false;
        }

    }


}

package com.mmbatha.firstjobapp.Reviews.service;

import com.mmbatha.firstjobapp.Reviews.Review;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReviews(Long companyId);

    boolean addReview(Long companyId, Review review);

    Review getReview(Long companyId, Long review);

    boolean updateReview(Long companyId, Long reviewId,Review review);

    boolean deleteCompanyReview(Long companyId ,Long id);
}

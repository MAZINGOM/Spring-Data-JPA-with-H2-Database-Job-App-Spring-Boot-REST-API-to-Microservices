package com.mmbatha.firstjobapp.Reviews.repository;

import com.mmbatha.firstjobapp.Reviews.Review;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByCompanyId(Long companyId);

}

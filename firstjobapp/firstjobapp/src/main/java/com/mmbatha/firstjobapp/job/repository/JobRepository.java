package com.mmbatha.firstjobapp.job.repository;

import com.mmbatha.firstjobapp.job.Job;
import org.springframework.data.jpa.repository.JpaRepository;


public interface JobRepository extends JpaRepository<Job,Long> {
}

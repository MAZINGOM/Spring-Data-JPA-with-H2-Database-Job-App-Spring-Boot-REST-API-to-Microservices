package com.mmbatha.firstjobapp.company.repository;

import com.mmbatha.firstjobapp.company.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company,Long> {
}

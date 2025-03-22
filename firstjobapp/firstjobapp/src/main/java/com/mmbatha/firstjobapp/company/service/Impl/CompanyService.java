package com.mmbatha.firstjobapp.company.service.Impl;

import com.mmbatha.firstjobapp.company.Company;

import java.util.List;

public interface CompanyService {

    List<Company> getAllCompanies();

    boolean updateCompany(Company company,Long id);

    void createCompany(Company company);

    boolean deleteCompanyById(Long id);

    Company getCompany(Long id);
}

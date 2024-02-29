package com.iesam.carnejoven.features.company.domain;

public interface CompanyRepository {
    void saveCompany(Company company);

    Company obtainCompany(String id);
}

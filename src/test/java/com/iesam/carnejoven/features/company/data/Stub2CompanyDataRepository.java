package com.iesam.carnejoven.features.company.data;

import com.iesam.carnejoven.features.company.domain.Company;
import com.iesam.carnejoven.features.company.domain.CompanyRepository;

public class Stub2CompanyDataRepository implements CompanyRepository {
    @Override
    public void saveCompany(Company company) {

    }

    @Override
    public Company obtainCompany(String id) {
        return new Company("1","a","a");
    }
}

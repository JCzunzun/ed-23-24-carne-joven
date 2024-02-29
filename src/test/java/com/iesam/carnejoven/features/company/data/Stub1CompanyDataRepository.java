package com.iesam.carnejoven.features.company.data;

import com.iesam.carnejoven.features.company.domain.Company;
import com.iesam.carnejoven.features.company.domain.CompanyRepository;

public class Stub1CompanyDataRepository implements CompanyRepository {
    @Override
    public void saveCompany(Company company) {

    }

    @Override
    public Company obtainCompany(String id) {
        return null;
    }
}

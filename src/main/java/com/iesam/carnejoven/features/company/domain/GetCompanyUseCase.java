package com.iesam.carnejoven.features.company.domain;

import com.iesam.carnejoven.features.company.data.CompanyDataRepository;

public class GetCompanyUseCase {
    private final CompanyDataRepository companyDataRepository;

    public GetCompanyUseCase(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }
    public Company execute(String id){
        return companyDataRepository.obtainCompany(id);
    }
}

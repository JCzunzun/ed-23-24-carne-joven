package com.iesam.carnejoven.features.company.domain;

import com.iesam.carnejoven.features.company.data.CompanyDataRepository;

public class GetCompanyUseCase {
    private final CompanyRepository companyRepository;

    public GetCompanyUseCase(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public Company execute(String id){
        return companyRepository.obtainCompany(id);
    }
}

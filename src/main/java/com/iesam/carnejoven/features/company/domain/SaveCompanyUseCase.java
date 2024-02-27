package com.iesam.carnejoven.features.company.domain;

import com.iesam.carnejoven.features.company.data.CompanyDataRepository;

public class SaveCompanyUseCase {
    private final CompanyDataRepository companyDataRepository;

    public SaveCompanyUseCase(CompanyDataRepository companyDataRepository) {
        this.companyDataRepository = companyDataRepository;
    }

    public void execute(Company company){
        companyDataRepository.saveCompany(company);
    }
}

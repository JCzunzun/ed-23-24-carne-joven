package com.iesam.carnejoven.features.company.presentation;

import com.iesam.carnejoven.features.company.data.CompanyDataRepository;
import com.iesam.carnejoven.features.company.domain.Company;
import com.iesam.carnejoven.features.company.domain.GetCompanyUseCase;
import com.iesam.carnejoven.features.company.domain.SaveCompanyUseCase;

public class CompanyPresentation {
    public static void obtainCompany(String id) {
        GetCompanyUseCase getCompanyUseCase = new GetCompanyUseCase(CompanyDataRepository.newCompanyInstance());
        Company company = getCompanyUseCase.execute(id);
        System.out.println(company.toString());
    }

    public static void saveCompany(Company company) {
        SaveCompanyUseCase saveCompanyUseCase = new SaveCompanyUseCase(CompanyDataRepository.newCompanyInstance());
        saveCompanyUseCase.execute(company);

    }
}

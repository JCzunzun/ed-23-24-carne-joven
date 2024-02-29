package com.iesam.carnejoven.features.company.data;

import com.iesam.carnejoven.features.company.data.local.FilesLocalDataSourceCompany;
import com.iesam.carnejoven.features.company.domain.Company;
import com.iesam.carnejoven.features.company.domain.CompanyRepository;

public class CompanyDataRepository implements CompanyRepository {
    private static CompanyDataRepository instanceCompany = null;
    private FilesLocalDataSourceCompany fileLocalDataSource;

    public static CompanyDataRepository newCompanyInstance() {
        if (instanceCompany == null) {
            instanceCompany = new CompanyDataRepository();
        }
        return instanceCompany;
    }

    @Override
    public void saveCompany(Company company) {
        fileLocalDataSource.saveCompany(company);
    }

    @Override
    public Company obtainCompany(String id) {
        return fileLocalDataSource.obtainCompany(id);
    }
}

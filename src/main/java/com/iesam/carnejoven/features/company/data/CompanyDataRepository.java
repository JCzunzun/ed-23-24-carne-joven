package com.iesam.carnejoven.features.company.data;

import com.iesam.carnejoven.features.buy.data.BuyDataRepository;
import com.iesam.carnejoven.features.company.domain.Company;
import com.iesam.carnejoven.features.company.domain.CompanyRepository;

public class CompanyDataRepository implements CompanyRepository {
    private static CompanyDataRepository instanceCompany=null;
    public static CompanyDataRepository newCompanyInstance(){
        if(instanceCompany==null){
            instanceCompany = new CompanyDataRepository();
        }
        return instanceCompany;
    }
    @Override
    public void saveCompany(Company company) {

    }

    @Override
    public Company obtainCompany(String id) {
        return null;
    }
}

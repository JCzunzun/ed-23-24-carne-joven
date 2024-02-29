package com.iesam.carnejoven.features.company.domain;

import com.iesam.carnejoven.features.company.data.Stub1CompanyDataRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetCompanyUseCaseTest {
    private GetCompanyUseCase getCompanyUseCase;
    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        getCompanyUseCase = null;
    }

    @Test
    void execute() {
    }
    public void CuandoCompanySeaNuloMostrarNull() {
        //Given
        getCompanyUseCase = new GetCompanyUseCase(
                new Stub1CompanyDataRepository()
        );
        String id="1";
        //When
        Company company=getCompanyUseCase.execute(id);

        //Then
        Assertions.assertNull(company);
    }
    public void CuandoCompanySeaNuloMostrarCompany() {
        //Given
        getCompanyUseCase = new GetCompanyUseCase(
                new Stub1CompanyDataRepository()
        );
        String id="1";
        //When
        Company company=getCompanyUseCase.execute(id);

        //Then
        Assertions.assertNotNull(company);
    }

}
package com.iesam.carnejoven.features.company.domain;

public class Company {
    private final String id;
    private final String name;
    private final String cif;

    public Company(String id, String name, String cif) {
        this.id = id;
        this.name = name;
        this.cif = cif;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCif() {
        return cif;
    }
}

package com.iesam.carnejoven.features.user;

public class User {
    private final String nif;
    private final String name;
    private final String lastName;
    private final String adress;

    public User(String nif, String name, String lastName, String adress) {
        this.nif = nif;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getNif() {
        return nif;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAdress() {
        return adress;
    }
}
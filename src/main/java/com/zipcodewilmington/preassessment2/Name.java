package com.zipcodewilmington.preassessment2;

public class Name implements GenericPerson {
    String name;

    public Name(String name) {
        this.name = name;
    }

    public String getValue() {
        return this.name;
    }
}

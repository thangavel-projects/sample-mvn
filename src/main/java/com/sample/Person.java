package com.sample;

import java.util.Set;

public class Person {

    private final String name;
    private final String surName;
    private final Set<String> emails;

    public Person(String name, String surName, Set<String> emails) {
        this.name = name;
        this.surName = surName;
        this.emails = emails;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public Set<String> getEmails() {
        return emails;
    }
}

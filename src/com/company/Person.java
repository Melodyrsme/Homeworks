package com.company;

import java.util.Objects;

public class Person {
    private String lastName;
    private String firstName;
    private String middleName;

    public Person(){
    }

    public Person(String lastName, String firstName, String middleName) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
    }

    @Override
    public String toString() {
        return "\nPerson:" +
                "\nlastName='" + lastName + '\'' +
                "\nfirstName='" + firstName + '\'' +
                "\nmiddleName='" + middleName + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(lastName, person.lastName)
                && Objects.equals(firstName, person.firstName)
                && Objects.equals(middleName, person.middleName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
}

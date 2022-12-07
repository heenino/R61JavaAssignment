package com.vti.entity;

public class Contact {
    protected String name;
    protected String number;

    @Override
    public String toString() {
        return "Contact{" +
                "name số '" + name + '\'' +
                ", number số '" + number + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

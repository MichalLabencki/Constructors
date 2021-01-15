package com.company;

public class VipCustomer {

    private String Name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer() {
        this("Default name" , 50000, "default@email.com");

    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    public String getName() {
        return Name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        Name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;






    }
}

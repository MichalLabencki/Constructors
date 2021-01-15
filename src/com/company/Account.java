package com.company;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAdress;
    private String customerPhoneNumber;

    public void deposit(double depositAmmount) {
        this.balance += depositAmmount;
        System.out.println("Deposit of " + depositAmmount + "made. New balance is " + this.balance);

    }

    public void withdrawal(double withdrawalAmmount){
        if(this.balance - withdrawalAmmount < 0) {
            System.out.println("Only " + this.balance + " avaliable. Withdrawal not processed");
        } else {
            this.balance -= withdrawalAmmount;
            System.out.println("Withdrawal of " + withdrawalAmmount + " processed. Remaining balance " + this.balance);
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAdress() {
        return customerEmailAdress;
    }

    public void setCustomerEmailAdress(String customerEmailAdress) {
        this.customerEmailAdress = customerEmailAdress;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}

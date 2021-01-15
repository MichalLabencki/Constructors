package com.company;

public class Main {

    public static void main(String[] args) {

	Account bobsAccount = new Account();
	bobsAccount.withdrawal(100.00);

	bobsAccount.deposit(50.00);
        bobsAccount.withdrawal(100.00);

        bobsAccount.deposit(51.00);
        bobsAccount.withdrawal(100.00);


        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Bob", 250000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Tim",  100.00, "tim@email.com");
        System.out.println(person3.getName());


    }
}

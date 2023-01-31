package com.olufemi.questionfour;

public class Main {

    public static void main(String[] args) {

        SavingsAccount saver1 = new SavingsAccount(2_000.00);
        SavingsAccount saver2 = new SavingsAccount(3_000.00);

        SavingsAccount.modifyInterestRate(0.03);

        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());

        SavingsAccount.modifyInterestRate(0.04);

        System.out.println(saver1.calculateMonthlyInterest());
        System.out.println(saver2.calculateMonthlyInterest());

    }

}

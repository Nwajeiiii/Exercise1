package com.olufemi.questionfour;

public class SavingsAccount {

    private static double annualInterestRate;
    private double savingsBalance;

    public SavingsAccount(double savingsBalance){
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest(){
        double interest = (savingsBalance * annualInterestRate) / 12;
        savingsBalance += interest;
        return interest;
    }

    public static void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate = newAnnualInterestRate;
    }

}

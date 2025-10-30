package com.pluralsight;

public class Calculations{

    public static double getLoanPayment(double totalAmount, int loanLengthInMonths, double interestRate) {

       // double totalAmountt = get


//  totalLoanAmount = (totalAmount)
//  annualInterest = (interestRate)
//  mortYears
//  int mortN =(loanLengthInMonths)
//
//        double mortMI = (monthlyInterestRate)
        double monthlyInterestRate = interestRate / 12;


//        double numerator = mortMI * Math.pow(1+mortMI,mortN);
        double numerator = monthlyInterestRate * Math.pow( 1 + monthlyInterestRate, loanLengthInMonths);
//
//        double denominator = (Math.pow(1+mortMI,mortN)-1);
        double denominator = (Math.pow(1 + monthlyInterestRate, loanLengthInMonths) - 1 );
//
//        double totalMonthlyPay = mortPrinciple * (numerator/denominator);
        //
//        double totalInterest = (totalMonthlyPay*mortN)- mortPrinciple;

//        System.out.printf("A $%.2f loan at %.3f%% for %d year would have a $%.2f/mo payment with a total interest of $%.2f.\n", totalLoanAmount, annualInterest, mortYears, totalMonthlyPay,totalInterest );

        return totalAmount * (numerator / denominator);
    }
}
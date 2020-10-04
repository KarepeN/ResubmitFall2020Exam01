/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.util.Scanner;

/**
 *
 * @author Nithya Karepe
 */
public class BankDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the loan amount,
        // the number of years and the annual interest rate
        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();
        System.out.print("Number of Years: ");
        int years = input.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualRate = input.nextDouble();

        double balance = loanAmount;
        double principal;
        double interest;

        // Calculate monthly interest rate
        double monthlyRate = annualRate / 1200;

        // Calculat montly payment
        double monthlyPayment = loanAmount * monthlyRate * Math.pow(1 + monthlyRate, years * 12) / (Math.pow(1 + monthlyRate, years * 12) - 1);

        // Display montly payment
        System.out.printf("Monthly Payment: %.2f\n", monthlyPayment);

        // Display total payment
        System.out.printf("Total Payment: %.2f\n", (monthlyPayment * 12) * years);

        // Create amortization schedule
        System.out.println("Payment#     Interest     Principal     Balance");
        int i = 0;
        while (i < years * 12) {
            interest = monthlyRate * balance;
            principal = monthlyPayment - interest;
            balance = balance - principal;
            System.out.printf("%-13d%-13.2f%-13.2f%.2f\n", i + 1, interest,
                    principal, balance);
            i++;
        }
    }

}

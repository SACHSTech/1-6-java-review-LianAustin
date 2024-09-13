package gr11review.part1;

import java.io.*;

/**
 * A program that asks the user for the yearly amount, compound interest rate, and target amount
 * and outputs the number of years it will take to reach the target amount
 *
 * @author: Austin L
 */
public class Review5{
    public static void main(String[] args) throws IOException{

        // Initialize variables
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double dblCurrentAmount = 0;
        int intYears = 0;
        double dblYearlyAmount;
        double dblInterestRate;
        double dblTargetAmount;

        // Ask the user for the yearly amount, compound interest rate, and target amount
        System.out.print("Enter the yearly invested amount: ");
        dblYearlyAmount = Double.parseDouble(br.readLine());
        System.out.print("Enter the compound interest rate: ");
        dblInterestRate = Double.parseDouble(br.readLine());
        System.out.print("Enter the target amount: ");
        dblTargetAmount = Double.parseDouble(br.readLine());

        // Calculate the number of years it will take to reach the target amount
        while (dblCurrentAmount < dblTargetAmount) {
            dblCurrentAmount += dblYearlyAmount;
            dblCurrentAmount += dblCurrentAmount * (dblInterestRate / 100);
            intYears++;
        }

        // Output the number of years it will take to reach the target amount
        System.out.println("The target amount will be earned in " + intYears + " years.");
    }
}
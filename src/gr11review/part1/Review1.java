package gr11review.part1;

import java.io.*;

/**
 * A program that asks the user for the month number and day number and outputs the day of the year
 *
 * @author: Austin L
 */
public class Review1{

    /**
     * Main method to execute the program logic.
     *
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) throws IOException{

        // Initialize variables
        int intMonth;
        int intDay;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask the user for the month number and day number
        System.out.print("Enter the month number: ");
        intMonth = Integer.parseInt(br.readLine());
        System.out.print("Enter the day number: ");
        intDay = Integer.parseInt(br.readLine());

        // Calculate the day of the year
        int intDayOfYear = 0;
        int[] intDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        for (int i = 0; i < intMonth - 1; i++){
            intDayOfYear += intDaysInMonth[i];
        }
        intDayOfYear += intDay;

        // Output the day of the year
        System.out.println(intDayOfYear);
    }
}
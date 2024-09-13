package gr11review.part1;

import java.util.*;
public class Review8 {
    public static void main(String[] args) {

        // Initialize variables
        Random rand = new Random();
        int intTriples = 0;
        int intNum1;
        int intNum2;
        int intNum3;

        // Generate three random numbers between 0 and 8, then loop 1000 times
        for (int i = 1; i <= 1000; i++) {
            intNum1 = rand.nextInt(9);
            intNum2 = rand.nextInt(9);
            intNum3 = rand.nextInt(9);

            //  Output the three random numbers
            System.out.println(intNum1 + " " + intNum2 + " " + intNum3);

            // Check if the three random numbers are the same
            if (intNum1 == intNum2 && intNum2 == intNum3) {
                intTriples++;
            }
        }

        // Output the number of triples
        System.out.println(intTriples);
    }
}
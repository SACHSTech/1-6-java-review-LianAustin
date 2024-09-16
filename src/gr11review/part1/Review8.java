package gr11review.part1;

import java.io.IOException;
import java.util.*;

/**
 * A program that generates three random numbers between 0 and 8 1000 times and outputs the number of triples
 * that were generated
 *
 * @author: Austin L
 */
public class Review8 {

    /**
     * Main method to execute the program logic.
     *
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
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
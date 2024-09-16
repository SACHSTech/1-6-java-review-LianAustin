package gr11review.part1;

import java.io.*;

/**
 * A program that outputs odd numbers from 20 to 100 and numbers from 29 to 2 in decreasing order
 *
 * @author: Austin L
 */
public class Review3 {

    /**
     * Main method to execute the program logic.
     *
     * @param args Command-line arguments (not used).
     * @throws IOException If there is an error during input.
     */
    public static void main(String[] args) {
        for (int i = 21; i < 100; i += 2) {
            System.out.println(i);
        }
        System.out.println();
        for (int i = 29; i >= 2; i--) {
            System.out.println(i);
        }
    }
}
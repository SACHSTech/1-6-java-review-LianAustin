package gr11review.part1;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.geom.*;
import java.math.*;
import java.text.*;

/*
 * A program that outputs a joke based on the user's menu option
 *
 * @author: Austin L
 */
public class Review2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        // Print out the options
        System.out.println("0 - print a joke about your hair");
        System.out.println("1 - print a joke about your feet");
        System.out.println("2 - print a joke about your clothes");
        System.out.println("3 - print a joke about your teacher");

        // Ask the user for an option
        System.out.print("Choose a menu option: ");
        int intOption = 0;
        intOption = Integer.parseInt(br.readLine());

            // Output the joke based on the option
            switch (intOption) {
                case 0:
                    System.out.println("What do you call a line of men waiting to get haircuts? A barberqueue.");
                    break;
                case 1:
                    System.out.println("What has five toes and isn't your foot? \n My foot.");
                    break;
                case 2:
                    System.out.println("The feud between the two clothing stores down the street finally came to an end. \n It ended in a tie.");
                    break;
                case 3:
                    System.out.println("Two chemists walk into a bar.\r\n" + //
                                                "\r\n" + //
                                                "The first one says, \"I'll have some H2O.\"\r\n" + //
                                                "\r\n" + //
                                                "The second says, \"I'll have some H2O too.\"\r\n" + //
                                                "\r\n" + //
                                                "The bartender is tired of this joke and poisons them both.");
                    break;
                default:
                    System.out.println("Invalid menu option");
                    break;
        }
    }
}
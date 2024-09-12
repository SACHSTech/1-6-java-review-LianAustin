package gr11review.part1;

import java.io.*;
import java.util.*;
import java.lang.*;
import java.awt.*;
import java.awt.geom.*;
import java.math.*;
import java.text.*;


/**
 * A program that asks the user for the month number and day number and outputs the day of the year
 *
 * @author: Austin L
 */
public class Review1{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));

        System.out.print("Enter the month number: ");
        int intMonth = Integer.parseInt(br.readLine());
        System.out.print("Enter the day number: ");
        int intDay = Integer.parseInt(br.readLine());

        int intDayOfYear = 0;
        int[] intDaysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        for (int i = 0; i < intMonth - 1; i++){
            intDayOfYear += intDaysInMonth[i];
        }
        intDayOfYear += intDay;
        System.out.println(intDayOfYear);
    }
}
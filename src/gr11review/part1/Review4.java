package gr11review.part1;

import java.io.*;
import java.math.*;
import java.text.*;

/**
 * A program that asks the user for the price of items and outputs the subtotal, tax, and total
 * of the items
 *
 * @author: Austin L
 */
public class Review4 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.print("How many items do you want to buy? ");
        int intItems = Integer.parseInt(br.readLine());
        BigDecimal subtotal = BigDecimal.ZERO;

        for (int i = 1; i <= intItems; i++) {
            System.out.print("Enter the price for item " + i + ": ");
            BigDecimal price = new BigDecimal(br.readLine());
            subtotal = subtotal.add(price);
        }

        BigDecimal tax = subtotal.multiply(new BigDecimal("0.13")).setScale(2, RoundingMode.HALF_UP);
        BigDecimal total = subtotal.add(tax);

        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total: $" + df.format(total));
    }
}
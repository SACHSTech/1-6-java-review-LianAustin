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
public class Review6{
    public static void main(String[] args) throws IOException{

        // Initialize variables
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal subtotal = BigDecimal.ZERO;
        BigDecimal price = BigDecimal.ZERO;

        // Ask the user for the price of items
        while (true) {
            System.out.print("Enter the price for an item: ");
            price = new BigDecimal(br.readLine());
            if (price.compareTo(BigDecimal.ZERO) == 0) {
                break;
            }
            subtotal = subtotal.add(price);
        }

        // Calculate the tax and total of the items
        BigDecimal tax = subtotal.multiply(new BigDecimal("0.13")).setScale(2, RoundingMode.HALF_UP);
        BigDecimal total = subtotal.add(tax);

        // Output the subtotal, tax, and total of the items
        System.out.println("Subtotal: $" + df.format(subtotal));
        System.out.println("Tax: $" + df.format(tax));
        System.out.println("Total: $" + df.format(total));
    }
}
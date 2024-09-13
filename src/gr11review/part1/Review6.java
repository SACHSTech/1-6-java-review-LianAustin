package gr11review.part1;

import java.io.*;
import java.math.*;
import java.text.*;
/**
 * A program that asks the user for the price of items and outputs the Subtotal, Tax, and Total
 * of the items
 *
 * @author: Austin L
 */
public class Review6{
    public static void main(String[] args) throws IOException{

        // Initialize variables
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        BigDecimal bdlSubtotal = BigDecimal.ZERO;
        BigDecimal bdlPrice = BigDecimal.ZERO;

        // Ask the user for the Price of items
        while (true) {
            System.out.print("Enter the price for an item: ");
            bdlPrice = new BigDecimal(br.readLine());
            if (bdlPrice.compareTo(BigDecimal.ZERO) == 0) {
                break;
            }
            bdlSubtotal = bdlSubtotal.add(bdlPrice);
        }

        // Calculate the Tax and Subtotal of the items
        BigDecimal bdlTax = bdlSubtotal.multiply(new BigDecimal("0.13")).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bdlTotal = bdlSubtotal.add(bdlTax);

        // Output the Subtotal, Tax, and Total of the items
        System.out.println("Subtotal: $" + df.format(bdlSubtotal));
        System.out.println("Tax: $" + df.format(bdlTax));
        System.out.println("Total: $" + df.format(bdlTotal));
    }
}
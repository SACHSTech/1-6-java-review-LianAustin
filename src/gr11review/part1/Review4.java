package gr11review.part1;

import java.io.*;
import java.math.*;
import java.text.*;

/**
 * A program that asks the user for the bdlPrice of items and outputs the bdlSubTotal, bdlTax, and bdlTotal
 * of the items
 *
 * @author: Austin L
 */
public class Review4 {
    public static void main(String[] args) throws Exception {

        // Initialize variables
        int intItems;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");

        // Input price of items
        System.out.print("How many items do you want to buy? ");
        intItems = Integer.parseInt(br.readLine());
        BigDecimal bdlSubTotal = BigDecimal.ZERO;

        // Calculate the SubTotal, Tax, and Total of the items
        for (int i = 1; i <= intItems; i++) {
            System.out.print("Enter the bdlPrice for item " + i + ": ");
            BigDecimal bdlPrice = new BigDecimal(br.readLine());
            bdlSubTotal = bdlSubTotal.add(bdlPrice);
        }

        BigDecimal bdlTax = bdlSubTotal.multiply(new BigDecimal("0.13")).setScale(2, RoundingMode.HALF_UP);
        BigDecimal bdlTotal = bdlSubTotal.add(bdlTax);

         // Output the SubTotal, Tax, and Total of the items
        System.out.println("SubbdlTotal: $" + df.format(bdlSubTotal));
        System.out.println("Tax: $" + df.format(bdlTax));
        System.out.println("Total: $" + df.format(bdlTotal));
    }
}
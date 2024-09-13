package gr11review.part1;

import java.io.*;

/**
 * A program that asks the user for a sentence and outputs the number of characters, spaces, and letter 'a's in the sentence
 *
 * @author: Austin L
 */
public class Review7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Input the sentence
        String strTheSentence = br.readLine();

        // Gets number of characters
        int intChars = strTheSentence.length();

        // Gets number of spaces and number of letter 'a's
        int intSpaces = 0;
        int intLetterA = 0;
        for (int i = 0; i < strTheSentence.length(); i++) {
            char charCharacters = strTheSentence.charAt(i);
            if (charCharacters == ' ')
                intSpaces++;
            if (charCharacters == 'a' || charCharacters == 'A')
                intLetterA++;
        }

        // Get the odd-numbered characters
        String strOddChars = "";
        for (int i = 0; i < strTheSentence.length(); i++) {
            if (i % 2 == 0) {
                strOddChars += '-';
            }
        }

        // Output the results
        System.out.println("There are " + intChars + " characters in the sentence.");
        System.out.println("There are " + intSpaces + " spaces in the sentence.");
        System.out.println("There are " + intLetterA + " letter a in the sentence.");
        System.out.println(strOddChars);
    }
}
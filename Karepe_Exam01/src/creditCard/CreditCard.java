/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditCard;

import java.util.Scanner;

/**
 *
 * @author Nithya Karepe
 */
public class CreditCard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a credit card number as a long integer: ");
        long cardNumber = scan.nextLong();

        if (isValid(cardNumber)) {
            System.out.println(cardNumber + " is valid");
        } else {
            System.out.println(cardNumber + " is invalid");
        }
    }

    /**
     * Return true if the card number is valid
     *Checks for the length of the card and also checks
     * with what digit the credit card number starts with.
     * @param number
     * @return
     */
    public static boolean isValid(long number) {
        return (getSize(number) >= 13 && getSize(number) <= 16)
                && (prefixMatched(number, 4) || prefixMatched(number, 5)
                || prefixMatched(number, 37) || prefixMatched(number, 6))
                && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    /**
     * Get the result from Step 2
     *
     * @param 
     * @return 
     */
    
    public static int sumOfDoubleEvenPlace(long number) {
        String no = String.valueOf(number);
        int sum = 0;
        for (int i = getSize(number) - 1; i >= 0; i--) {
            int val = Integer.parseInt(String.valueOf(no.charAt(i)));
            if (i % 2 == 0 && getSize(number) % 2 == 0) {
                sum += getDigit(val * 2);
            } else if (i % 2 != 0 && getSize(number) % 2 != 0) {
                sum += getDigit(val * 2);
            }
        }
        return sum;
    }

    /**
     * Return this number if it is a single digit, otherwise, return the sum of
     * the two digits
     *
     * @param 
     * @return
     */
    public static int getDigit(int number) {
        if (number > 9) {
            number = getDigit(number / 10 + number % 10);
        }
        return number;
    }

    /**
     * Return sum of odd-place digits in number
     *
     * @param 
     * @return
     */
    public static int sumOfOddPlace(long number) {
        String no = String.valueOf(number);
        int sum = 0;
        for (int i = getSize(number) - 1; i >= 0; i--) {
            int val = Integer.parseInt(String.valueOf(no.charAt(i)));
            if (i % 2 != 0 && getSize(number) % 2 == 0) {
                sum += getDigit(val);
            } else if (i % 2 == 0 && getSize(number) % 2 != 0) {
                sum += getDigit(val);
            }
        }
        return sum;
    }

    /**
     * Return true if the digit d is a prefix for number
     *
     * @param 
     * @param 
     * @return
     */
    public static boolean prefixMatched(long number, int d) {
        return String.valueOf(number).startsWith(String.valueOf(d));
    }

    /**
     * Return the number of digits in d
     *
     * @param 
     * @return
     */
    public static int getSize(long d) {
        return String.valueOf(d).length();
    }

    /**
     * Return the first k number of digits from number.If the number of digits
     * in number is less than k, return number.
     *
     * @param 
     * @param 
     * @return
     */
    public static long getPrefix(long number, int k) {
        if (getSize(number) < k) {
            return number;
        }
        return Long.getLong(String.valueOf(number).substring(0, k));
    }

}

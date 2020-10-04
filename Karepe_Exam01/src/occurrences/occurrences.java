/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package occurrences;

import java.util.*;

/**
 *
 * @author  Nithya Karepe
 */
public class occurrences {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        String str1 = " ";
        String str2;
        int count = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        str1 = scan.nextLine();

        System.out.print("Enter string 2: ");
        str2 = scan.nextLine();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0) && i < str1.length() - str2.length() + 1) {
                if (str1.substring(i, i + str2.length()).equals(str2)) {
                    count++;
                }

            }
        }
        System.out.println(count);
    }

}

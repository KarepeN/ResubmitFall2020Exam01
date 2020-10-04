/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssn;
import static java.lang.Character.isDigit;
import java.util.Scanner;
/**
 *
 * @author Nithya Karepe
 */
public class SsnDriver {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * User Input is taken
         */
        System.out.print("Enter a SSN: ");
        Scanner scan = new Scanner(System.in);
        String ssn = scan.next();
        Ssn num= new Ssn();
        num.setSsn(ssn);       
System.out.println(num.toString());
    }
}
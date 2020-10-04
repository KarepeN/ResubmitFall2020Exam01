/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pentagon;

import java.util.Scanner;

/**
 *
 * @author Nithya Karepe
 */
public class PentagonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radius;
        /**
         * Reads input values from user
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the length from the center to a vertex: ");
        radius = scan.nextDouble();
        /**
         * Object creation
         */
        Pentagon p1 = new Pentagon(radius);
        /**
         * Prints the area according to toString() (Pentagon class)
         */
        System.out.println("The area of the pentagon is " + p1.toString());
    }

}

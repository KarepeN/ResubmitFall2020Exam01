/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ll;

import java.util.*;

/**
 *
 * @author Nithya Karepe
 */
public class Latitude {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1;
        String s2;
        double x1;
        double x2;
        double y1;
        double y2;
        /**
         *
         * Reads input from user
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        s1 = scan.nextLine();
        /**
         *
         * Converting String input into double
         */
        x1 = Double.parseDouble(s1.substring(0, s1.indexOf(',')));
        y1 = Double.parseDouble(s1.substring(s1.indexOf(',') + 1));
        /**
         *
         * Reads input from user
         */
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        s2 = scan.nextLine();
        x2 = Double.parseDouble(s2.substring(0, s2.indexOf(',')));
        y2 = Double.parseDouble(s2.substring(s2.indexOf(',') + 1));
        double distance;
        /**
         *
         * calculates the distance
         */
        distance = 6371.01 * Math.acos(Math.sin(Math.toRadians(x1))
                * Math.sin(Math.toRadians(x2))
                + (Math.cos(Math.toRadians(x1))
                * Math.cos(Math.toRadians(x2)))
                * Math.cos(Math.toRadians(y1) - Math.toRadians(y2)));
        /**
         *
         * Prints the calculated distance
         */
        System.out.println("The distance between the two points is " + distance + " km");
    }

}

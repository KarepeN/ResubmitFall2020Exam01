/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calendar;

import java.util.GregorianCalendar;

/**
 *
 * @author Nithya Karepe
 */
public class Calendar {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         *
         * Object Creation
         */
        GregorianCalendar cal = new GregorianCalendar();

        System.out.println("Current year:" + cal.get(GregorianCalendar.YEAR));
        System.out.println("Current month:" + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Current day:" + cal.get(GregorianCalendar.DAY_OF_MONTH));

        cal.setTimeInMillis(1234567898765L);

        System.out.println("Updated year:" + cal.get(GregorianCalendar.YEAR));
        System.out.println("Updated month:" + (cal.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Updated day:" + cal.get(GregorianCalendar.DAY_OF_MONTH));

    }

}

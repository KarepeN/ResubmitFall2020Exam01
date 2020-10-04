/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fan;

import java.util.*;

/**
 *
 * @author Nithya Karepe
 */
public class FanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Created a object
         */
        Fan fan = new Fan();
        /**
         * set values for Speed Radius Color On
         */
        fan.setSpeed(3);
        fan.setRadius(10);
        fan.setColor("peach");
        fan.setOn(true);
        /**
         * Here we refer to the toString() from Fan Class
         */
        System.out.println(fan.toString());
        /**
         * set values for Speed Radius Color
         */
        fan.setSpeed(2);
        fan.setRadius(10);
        fan.setColor("lavender");
        fan.setOn(false);
        /**
         * Here we refer to the toString() from Fan Class On
         */
        System.out.println(fan.toString());
    }

}

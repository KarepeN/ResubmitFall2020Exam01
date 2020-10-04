/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overload;

/**
 *
 * @author Nithya Karepe
 */
public class Overload {

    /**
     *
     * Use of same method with different arguments
     * @param x
     */
    public void load1(int x) {
        System.out.println("int : " + x);
    }

    /**
     *
     * @param s
     */
    public void load1(String s) {
        System.out.println("String : " + s);
    }

    /**
     *
     * @param d
     * @param e
     */
    public void load1(double d, double e) {
        double f = d + e;
        System.out.println("double : " + f);
    }

}

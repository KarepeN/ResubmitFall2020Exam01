/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combinations;

/**
 *
 * @author Nithya Karepe
 */
public class Combinations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         * Checks for values and increments and as long as it satisfies the
         * condition prints the values
         */
        int count = 0;
        for (int i = 1; i < 8; i++) {
            for (int j = i + 1; j < 8; j++) {
                System.out.println(i + " " + j);
                count++;
            }
        }
        System.out.println("The total number of all combinations is " + count);
    }
}

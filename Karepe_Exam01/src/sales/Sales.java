/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sales;
/**
 *
 * @author Nithya Karepe
 */
public class Sales {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        double baseSalary = 5000;
        double target = 30000;
        double requiredCommission = target - baseSalary;
        double commission = 0;
        double saleAmount = 0;
        /**
         *
         * Calculating commission for minimum sales
         */
        do {
            if (saleAmount <= 5000) {
                commission = 0.08 * saleAmount;
            } else if ((5000 < saleAmount) && (saleAmount <= 10000)) {
                commission = (.08 * 5000) + (0.1 * (saleAmount - 5000));
            } else if (saleAmount > 10000) {
                commission = (.08 * 5000) + (0.1 * 5000) + (0.12 * (saleAmount - 10000));
            }
            saleAmount = saleAmount + .01;
        } while (commission <= requiredCommission);
        /* *
        *
        Prints minimum Sales 
         */
        System.out.printf("The minimum sales needed to earn 30,000: %.2f", saleAmount);

    }

}

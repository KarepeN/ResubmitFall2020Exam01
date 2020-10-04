/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ssn;
import static java.lang.Character.isDigit;
/**
 *
 * @author Nithya Karepe
 */
public class Ssn {
    /**
     *
     */
    public String ssn;
    /**
     *
     * @return
     */
    public String getSsn() {
        return ssn;
    }
    /**
     *
     * @param ssn
     */
    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
    /**
     *
     */
    public Ssn() {
    }
    /**
     *
     * @return
     */
    /**
     * trim the extra spaces enters the loop only if it satisfies the conditions
     * such as length of string and splitting the characters with '-' Divides
     * the given string after third digits and also after fifth digit.Checks the remaining characters are digits or no
     * @return
     */
    public String getSsnNumber() {
        for (int i = 0; i < ssn.length(); i++) {
            if (ssn.trim().length() != 11 || ssn.charAt(3) != '-' || ssn.charAt(6) != '-') {
                return ssn + " an invalid social security number";
            }
            if (i != 3 && i != 6) {
                if (!isDigit(ssn.charAt(i))) {
                    return ssn + " an invalid social security number";
                }
            }
        }
        return ssn
                + " an valid social security number";
    }

    @Override
    public String toString() {
        String name = getSsnNumber();
        return name;
    }
}

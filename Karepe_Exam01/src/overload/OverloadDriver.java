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
public class OverloadDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    //object creation
        Overload obj = new Overload(); 
        // Methods are invoked aacoring to the parameters
        obj.load1("Hey, This is Nithya Karepe "); //String
        obj.load1(1150); // Int  
        obj.load1(7.5, 9.7);
    }
    
}

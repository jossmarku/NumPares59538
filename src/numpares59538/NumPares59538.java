/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numpares59538;

/**
 *
 * @author Personal
 */
public class NumPares59538 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num = 0;
        int suma = 0;
        
        while (num % 2 == 0 && suma <= 47) {
            System.out.println(num);
            num += 2;
            suma++;
        }
    }
}

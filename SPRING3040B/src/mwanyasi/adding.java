/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.util.Scanner;



/**
 *
 * @author John Mwanyambu
 */
public class adding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, sum;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = obj.nextInt();
        b = obj.nextInt();
        sum = a + b;
        System.out.print("The result is " + sum+ "\n");
        System.out.print("The sum of " + a + " + " + b + " = " + sum + "\n");
        
    }
    
}

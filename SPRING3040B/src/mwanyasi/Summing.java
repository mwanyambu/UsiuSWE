/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author John Mwanyambu
 */
public class Summing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Integer a, b, sum;
        Scanner obj = new Scanner(System.in);
        System.out.println("enter two values");
        a = obj.nextInt();
        b = obj.nextInt();
        sum = a + b;
        System.out.println(sum);
    }
    
}

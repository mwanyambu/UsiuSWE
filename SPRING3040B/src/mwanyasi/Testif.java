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
public class Testif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int age;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter age");
        age = obj.nextInt();
        
        if (age > 18)
            System.out.print("You qualify for a national ID \n");
    }
    
}

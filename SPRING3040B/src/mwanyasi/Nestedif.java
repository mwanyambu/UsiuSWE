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
public class Nestedif {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int score;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter score");
        score = obj.nextInt();
        
        if (score >100 || score < 0) {
            System.out.print("Invalid score \n");
            return;
        }
        
        if (score >= 90)
            System.out.print("you got an A \n");
        else if (score >= 70)
            System.out.print("you got a B \n ");
        else if (score >= 50)
            System.out.print("You got a B \n");
        else
            System.out.print("You got an F \n");
        
    }
    
}

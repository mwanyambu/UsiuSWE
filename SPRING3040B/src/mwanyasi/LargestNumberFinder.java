/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

import java.util.Scanner;

/**
 *
 * @author John Mwanyambu
 */
public class LargestNumberFinder {
    double num1;
    double num2;
    double num3;

    public void captureAndDisplayNumbers() {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Enter the first number: ");
        this.num1 = sc.nextDouble(); 

        System.out.println("Enter the second number: ");
        this.num2 = sc.nextDouble();

        System.out.println("Enter the third number: ");
        this.num3 = sc.nextDouble();

        System.out.println("The numbers you entered are: " + num1 + ", " + num2 + ", and " + num3);
    }

    public void computeAndDisplayLargest() {
        double largest;

 
        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest); 
    }

    public static void main(String[] args) {
        LargestNumberFinder finder = new LargestNumberFinder(); 
        
        finder.captureAndDisplayNumbers();
        finder.computeAndDisplayLargest();
    }
}


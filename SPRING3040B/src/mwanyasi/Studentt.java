/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
import java.util.Scanner; // Source for capturing user input

public class Studentt {
    // Attributes (fields) to represent the state of the student object
    private String name;
    private String address;
    private double fees;


    public void captureAndDisplayData() {

        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Capture Student Data ---");
        
        System.out.print("Enter Student Name: ");
        this.name = input.nextLine(); 

        System.out.print("Enter Student Address: ");
        this.address = input.nextLine();

        System.out.print("Enter Student Fees: ");

        this.fees = input.nextDouble();

        System.out.println("\n--- Student Record ---"); 
        System.out.println("Name: " + this.name);
        System.out.println("Address: " + this.address);
        System.out.format("Fees: %.2f\n", this.fees);
    }


    public static void main(String[] args) {
        Student studentObj = new Student();

        studentObj.captureAndDisplayData();
    }
}


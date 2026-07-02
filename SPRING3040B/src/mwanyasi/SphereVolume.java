/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
import java.util.Scanner; 
import java.lang.Math;  

public class SphereVolume {
    private double radius; 

  
    public void captureRadius() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the sphere: ");
        
        this.radius = input.nextDouble();
    }

    public double computeVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public void displayResult(double volume) {
        System.out.format("The volume of the sphere with radius %.2f is: %.4f\n", radius, volume);
    }

    public static void main(String[] args) {
        SphereVolume calculator = new SphereVolume();
        
        calculator.captureRadius();
        double volume = calculator.computeVolume();
        calculator.displayResult(volume);
    }
}

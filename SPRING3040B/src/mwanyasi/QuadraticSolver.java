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

public class QuadraticSolver {
    private double a;
    private double b;
    private double c;

    public void captureCoefficients() {
        // Using Scanner to read numeric data from System.in [4, 10, 11]
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter coefficient a (must not be 0): ");
        this.a = sc.nextDouble(); // Reads a double precision real value [10, 12, 13]
        
        // a cannot be 0 in a quadratic equation
        if (this.a == 0) {
            System.out.println("Error: 'a' cannot be zero. This is not a quadratic equation.");
            return;
        }

        System.out.println("Enter coefficient b: ");
        this.b = sc.nextDouble();

        System.out.println("Enter coefficient c: ");
        this.c = sc.nextDouble();
    }


    public void computeAndDisplayRoots() {
        double discriminant = (b * b) - (4 * a * c);

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("The equation has two real roots: %.2f and %.2f\n", root1, root2); // [19]
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.format("The equation has one repeated real root: %.2f\n", root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

    /**
     * Entry point of the application.
     */
    public static void main(String[] args) {
        QuadraticSolver solver = new QuadraticSolver();
        
        solver.captureCoefficients();
        solver.computeAndDisplayRoots();
    }
}

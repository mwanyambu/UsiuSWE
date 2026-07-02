/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author John Mwanyambu
 */
public class Cylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double r, h, volume;
        Scanner obj = new Scanner(System.in);
        System.out.print("enter radius and height \n");
        r = obj.nextDouble();
        h = obj.nextDouble();
        volume = Math.PI * Math.pow(r, 2) * h;
        DecimalFormat df = new DecimalFormat("$0,000.00 ksh");
        System.out.print("The volume is " + df.format(volume) + "\n");
    }
    
}

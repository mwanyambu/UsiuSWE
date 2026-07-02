/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
// Microwave.java - A Concrete Subclass []
public class Microwave extends Appliance {
    public Microwave(String brand) {
        super(brand);
    }

    @Override
    public void operate() {
        System.out.println("The " + getBrand() + " microwave is now heating food.");
    }
}


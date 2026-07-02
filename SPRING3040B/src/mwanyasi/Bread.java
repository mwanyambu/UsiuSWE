/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.util.List;

/**
 *
 * @author John Mwanyambu
 */
// Concrete class inheriting from Food and implementing Bakeable
class Bread extends Food implements Bakeable {
    public Bread() {
        super("Bread"); // Call to superclass constructor
    }

    // Overriding the abstract method (Polymorphism)
    @Override
    public List<String> getIngredients() {
        // Based on the author's "basic ingredients" list
        return List.of("eggs", "flour", "cocoa", "milk", "butter");
    }

    @Override
    public int getOvenTemperature() {
        return 350;
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
public class FoodDemo {
    public static void main(String[] args) {
        // Run-time polymorphism: Subclass instance assigned to superclass reference
        Food myFood = new Bread();
        
        System.out.println("Object Type: " + myFood.getName());
        System.out.println("Ingredients: " + myFood.getIngredients());
        
        // Explicit type conversion (casting) to access interface-specific behavior
        if (myFood instanceof Bakeable) {
            Bakeable bakeable = (Bakeable) myFood;
            System.out.println("Bake at: " + bakeable.getOvenTemperature() + "Degrees Celcius");
        }
    }
}

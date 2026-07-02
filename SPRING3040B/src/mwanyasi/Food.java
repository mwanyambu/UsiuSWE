/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */

import java.util.List;

// Abstract class defining core components for inheritance
abstract class Food {
    String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() { 
        return name; 
    }

    public abstract List<String> getIngredients();
}

interface Bakeable {
    int getOvenTemperature();
}




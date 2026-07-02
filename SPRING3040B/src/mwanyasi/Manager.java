/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
public final class Manager extends Employee {
    protected double benefits;
    
    public Manager() {
        
    }
    public Manager(double benefits) {
        super();
        this.benefits = benefits;
        
    }
    public double getbenefits() {
        return benefits;
    }
    @Override
    public String toString(){
        return super.toString() + getbenefits() + "\n";
    }
    
    
}

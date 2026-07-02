/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
public class Employee {
    protected String name;
    protected String idNumber;
    protected double salary;
    
    public Employee() {
        
    }
    public Employee(String name, String idNumber, double salary) {
        this.name = name;
        this.idNumber = idNumber;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public String getIdNumber() {
        return idNumber;
    }
    public double getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return getName() + "\t" + getIdNumber() + "\t" + getSalary() + "\n";
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
public class Student {
    String name, idNumber;
    int age;
    double fees;

    public Student() {
    }

    public Student(String name, String idNumber, int age, double fees) {
        this.name = name;
        this.idNumber = idNumber;
        this.age = age;
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public double getFees() {
        return fees;
    }

    @Override
    public String toString() {
        return getName() + "\t" + getAge() + "\t" + getIdNumber() + "\t" + getFees() + "\n";
    }
    
    
    
    
    
}

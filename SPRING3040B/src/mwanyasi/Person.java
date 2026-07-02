/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
public class Person {

    /**
     * @param args the command line arguments
     */
    String FirstName;
    String LastName;
    int age;
    public Person(){
    }
    public Person(String FirstName, String LastName, int age){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public String getLastName(){
        return LastName;
    }
    public int getAge(){
        return age;
    }
    
    @Override
    public String toString(){
        return getFirstName() + "\t" + getLastName() + "\t" + getAge() + "\n";
    }
    //public static void main(String[] args) {
        // TODO code application logic here
        
                
    //}
    
}

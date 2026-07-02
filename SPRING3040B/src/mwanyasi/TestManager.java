/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author John Mwanyambu
 */
public class TestManager {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        FileWriter output = new FileWriter("manager.xls", true);
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter name, IdNumber, salary, and benefits");
        
        for(int i = 0; i < 2; i++) {
            Manager usiu = new Manager();
            usiu.name = obj.nextLine();
            usiu.idNumber = obj.next();
            usiu.salary = obj.nextDouble();
            usiu.benefits = obj.nextDouble();
            obj.next();
            output.append(usiu.toString());
        }
        output.close();
                
        
    }
    
}

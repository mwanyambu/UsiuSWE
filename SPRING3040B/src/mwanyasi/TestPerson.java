/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.awt.TextArea;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author John Mwanyambu
 */
public class TestPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TextArea output = new TextArea(10,30);
        Scanner obj = new Scanner(System.in);
        int i, n;
        System.out.println("how many values ");
        n = obj.nextInt();
        System.out.println("enter first name, last name and age ");
        for (i=0; i < n; i++){
            Person usiu = new Person();
            usiu.FirstName = obj.next();
            usiu.LastName = obj.next();
            usiu.age = obj.nextInt();
            output.append(usiu.toString());
        }
        JOptionPane.showMessageDialog(null, output);
        //System.out.println(output.toString());
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.awt.TextArea;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author John Mwanyambu
 */
public class TestStudent {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        //TextArea output3 = new TextArea(10,30);
        Scanner obj = new Scanner(System.in);
        int i, n;
        System.out.println("how many records ");
        n = obj.nextInt();
        FileWriter output = new FileWriter("student2.xls", true);
        System.out.println("enter name, age, IDNumber, and fees ");
        for (i=0; i < n; i++){
            Student usiu = new Student();
            usiu.name = obj.next();
            //obj.nextLine();
            usiu.age = obj.nextInt();
            usiu.fees = obj.nextDouble();
            usiu.idNumber = obj.next();
            //obj.nextLine();
            output.append(usiu.toString());
            //output3.append(usiu.toString());
        }
        //JOptionPane.showMessageDialog(null, output3);
        //obj.close();
        output.close();
    }
    
}

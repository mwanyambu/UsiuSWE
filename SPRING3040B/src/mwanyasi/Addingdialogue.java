/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import javax.swing.JOptionPane;

/**
 *
 * @author John Mwanyambu
 */
public class Addingdialogue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        int a, b, sum;
        s = JOptionPane.showInputDialog("enter first value");
        a = Integer.parseInt(s);
        s = JOptionPane.showInputDialog("enter second value");
        b = Integer.parseInt(s);
        sum = a + b;
        
        JOptionPane.showMessageDialog(null,sum);
        
    }
    
}

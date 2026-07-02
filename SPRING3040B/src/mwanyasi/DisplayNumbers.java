/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.awt.TextArea;
import javax.swing.JOptionPane;

/**
 *
 * @author John Mwanyambu
 */
public class DisplayNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 1;
        TextArea outputarea = new TextArea(3, 4);
        while (n <= 100) {
            outputarea.append(n + "\n");
            n++;
        }
        JOptionPane.showMessageDialog(null, outputarea);
    }
    
}



















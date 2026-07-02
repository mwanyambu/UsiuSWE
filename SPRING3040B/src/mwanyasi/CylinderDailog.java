/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author John Mwanyambu
 */
public class CylinderDailog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s;
        double r, h, v;
        s = JOptionPane.showInputDialog("enter radius");
        r = Double.parseDouble(s);
        s = JOptionPane.showInputDialog("enter height");
        h = Double.parseDouble(s);
        v = Math.PI * h * Math.pow(r, 2);
        DecimalFormat df = new DecimalFormat("0.00");
        
        JOptionPane.showMessageDialog(null, df.format(v));
        
    }
    
}

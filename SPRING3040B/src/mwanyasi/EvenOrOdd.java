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
public class EvenOrOdd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        String s;
        //s = JOptionPane.showInputDialog("enter a value");
        //n = Integer.parseInt(s);
        TextArea even = new TextArea(10, 10);
        TextArea odd = new TextArea(10, 10);
        //for (n=1; n<=100; n++)
        while (true){
            s = JOptionPane.showInputDialog("enter a value");
            n = Integer.parseInt(s);
            if (n == -1) break;
        
            else if (n % 2 == 0)
                even.append(n + " Even\n");
            else
                odd.append(n + " Odd\n");
            
        }
        JOptionPane.showMessageDialog(null, even);
        JOptionPane.showMessageDialog(null, odd);
    }
    
}

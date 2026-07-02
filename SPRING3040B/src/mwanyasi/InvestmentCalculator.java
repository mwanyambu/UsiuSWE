/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author John Mwanyambu
 */
public class InvestmentCalculator {
    private List<InvestmentRecord> records = new ArrayList<>();

    /**
     * Captures input for several users via the console.
     */
    public void captureInvestments() {
        Scanner sc = new Scanner(System.in);
        String choice;

        do {
            System.out.println("Enter principal amount (p): ");
            double p = sc.nextDouble();
            
            System.out.println("Enter annual interest rate (r) as a decimal (e.g., 0.05): ");
            double r = sc.nextDouble();
            
            System.out.println("Enter number of years (n): ");
            int n = sc.nextInt();

            records.add(new InvestmentRecord(p, r, n));

            System.out.println("Would you like to enter another record? (yes/no): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("yes")); 
    }

    public void displayResults() {
        StringBuilder sb = new StringBuilder("Investment Results:\n");
        sb.append("--------------------------------------------------\n");
        

        for (InvestmentRecord record : records) {
            sb.append(record.toString());
        }


        JTextArea textArea = new JTextArea(sb.toString());
        textArea.setEditable(false); 

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize(new java.awt.Dimension(400, 300));

        JOptionPane.showMessageDialog(null, scrollPane, "Investment Records", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        InvestmentCalculator calc = new InvestmentCalculator();
        calc.captureInvestments();
        calc.displayResults();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JOptionPane;

/**
 * Models an individual investment record.
 */
class InvestmentRecord {
    private double principal;
    private double rate;
    private int years;
    private double compoundAmount;

    public InvestmentRecord(double p, double r, int n) {
        this.principal = p;
        this.rate = r;
        this.years = n;
        // Formula: a = p * (1 + r)^n
        this.compoundAmount = p * Math.pow(1 + r, n);
    }

    @Override
    public String toString() {
        return String.format("Principal: %.2f | Rate: %.2f | Years: %d | Total: %.2f\n", 
                             principal, rate, years, compoundAmount);
    }
}


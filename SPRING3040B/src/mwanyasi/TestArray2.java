/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.util.Scanner;

/**
 *
 * @author John Mwanyambu
 */
public class TestArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj = new Scanner(System.in);
        int n;
        int i;
        System.out.println("how many values");
        n = obj.nextInt();
        int[] mydata = new int[n];
        System.out.println("Enter values ");
        //for (i=0; i < n; i++)
        for (i=0; i < mydata.length; i++) {
            mydata[i] = obj.nextInt();
        }
        
        for (int x: mydata){
            System.out.print(x + "\t");
        }
        
    }
    
}

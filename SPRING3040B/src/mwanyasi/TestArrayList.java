/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John Mwanyambu
 */
public class TestArrayList {

    int n;
    int i;
    Scanner obj = new Scanner(System.in);
    ArrayList<Double> list = new ArrayList<>();
    
    public void getValues() {
        System.out.println("how many values");
        n = obj.nextInt();
        System.out.println("enter values");
        for (i = 0; i < n; i++) {
            list.add(obj.nextDouble());
            //System.out.println(list + " ");
        }
        increament(list);
        System.out.println("Result is: ");
        for (Double x: list){
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        TestArrayList usiu = new TestArrayList();
        usiu.getValues();
    }

    private void increament(ArrayList<Double> list) {
        for (i=0; i<n; i++) {
            list.set(i, list.get(i)*1.3);
            
        }
            
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

import java.util.ArrayList;

/**
 *
 * @author John Mwanyambu
 */
public class TestDynamicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer>list = new ArrayList<>();
        list.add(45);
        list.add(37874);
        list.add(464);
        list.add(37);
        list.add(3442);
        //System.out.print(list + " ");
        list.remove(2);
        //System.out.print(list + " ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        for(int x:list)
            System.out.print(list + " ");
        
        ArrayList<Double>list2 = new ArrayList<>();
        list2.add(45.67);
        list2.add(37874.544);
        list2.add(464.6554);
        list2.add(37.664);
        list2.add(3442.34);
        //System.out.print(list + " ");
        list.remove(2);
        //System.out.print(list + " ");
        //for (int i = 0; i < list2.size(); i++) {
        //    System.out.print(list2.get(i) + " ");
        //}
        for(Double x:list2)
            System.out.println(list2 + " ");
        
        ArrayList<Object>list3 = new ArrayList<>();
        list3.add(45.67);
        list3.add(37874.544);
        list3.add(464.6554);
        list3.add(37.664);
        list3.add(3442.34);
        //System.out.print(list + " ");
        //list.remove(2);
        //System.out.print(list + " ");
        for (int i = 0; i < list3.size(); i++) {
            System.out.print(list3.get(i) + " ");
        }
        for(Object x:list3)
            System.out.print(list3 + " ");
    }
    
}

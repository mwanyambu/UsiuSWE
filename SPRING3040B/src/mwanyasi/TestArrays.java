/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mwanyasi;

/**
 *
 * @author John Mwanyambu
 */
public class TestArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] mydata = {30, 5, 6};
        for (int i = 0; i <mydata.length; i++){
            //System.out.println(i);
            System.out.println(mydata[i]);
        }
        for (int x: mydata) {
            System.out.println(x);
        }
    }
     
    
}

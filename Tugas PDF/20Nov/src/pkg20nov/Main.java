/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20nov;

/**
 *
 * @author Lenovo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "ABC";
        String s2 = new String ("DEF");
        String s3 = "AB" + "C";
        
        //s1 compareTo s2
        int var1 = s1.compareTo(s2);
        System.out.println(var1);
        
        //s2 equals s3
        System.out.println("s2 equals to s3"+s2.equals  (s3 ) )   ;
        
        //s2 compareTo s3
        int var2 = s2.compareTo(s3);
        System.out.println(var2);
        
        //s3 equals s1
         System.out.println("s3 equals to s3"+s2.equals (s1 ) )   ;
    }
    
}

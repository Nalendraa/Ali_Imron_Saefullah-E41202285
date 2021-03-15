/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_d;

/**
 *
 * @author E41202285_Ali Imron Saefullah
 */

import java.util.Scanner;

public class TUGAS_D {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// TODO code application logic here
        Scanner s1  = new Scanner(System.in);
        
// Data dari Keyboard
        System.out.println("Masukkan Nilai UTS =   ");
        int nilaiuts = s1.nextInt();
        System.out.println("Masukkan UAS =   ");
        int nilaiuas = s1.nextInt();
        
// Gabungkan dan Print
        int nilaiakhir = nilaiuts + nilaiuas;
        System.out.println ("Nilai Akhir   = " +nilaiakhir  /2);
        
        
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal1;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        String s;
        int i=0;
        
        s = scn.nextLine();        
        System.out.println("");
        
        String str[] = s.split(" |\\!|\\,|\\?|\\.|\\_|\\'|\\@"); // tokenisasi string
        
        for(String t : str){ // menghitung banyaknya token
            i++;
        }
        
        System.out.println(i);
        
        for(String t : str){ // menampilan tiap-tipa token ke layar
            System.out.println(t);
        }
                
    }
    
}

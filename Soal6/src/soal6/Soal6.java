/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal6;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        BigInteger a, b, sum, kali;
        
        a = scn.nextBigInteger();
        b = scn.nextBigInteger();
        
        // operator add untuk menambahkan a dengan b
        sum = a.add(b); 
        // operator multiply untuk mengalikan a dnegan b
        kali = a.multiply(b); 
        
        System.out.println("");
        System.out.println(sum);
        System.out.println(kali);
    }
    
}

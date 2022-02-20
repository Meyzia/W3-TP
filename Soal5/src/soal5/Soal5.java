/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal5;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        int[] plat = new int[4];
        String merge="";
        long result;
        
        for(int i=0;i<4;i++){
            plat[i] = scn.nextInt();
        }
        
        for(int i=0;i<4;i++){ // menggabungkan nomor plat
            merge = merge + String.valueOf(plat[i]);
        }
        
        result = (Long.parseLong(merge)-999999)%5;
        
        if(result==0){
            System.out.println("Jalan");
        }else{
            System.out.println("Berhenti");
        }
    }
    
}

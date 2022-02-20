/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal4;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        int jumlahPenjualan, totalPenjualan, gaji=500000;
        
        jumlahPenjualan = scn.nextInt();
        
        totalPenjualan = 50000 * jumlahPenjualan;
        
        if(jumlahPenjualan>=15){
            if(jumlahPenjualan>=80){
                gaji = gaji + (totalPenjualan*35/100);
            }
            else if(jumlahPenjualan>=40){
                gaji = gaji + (totalPenjualan*25/100);
            }
            
            // bonus peritem
            gaji = gaji + (totalPenjualan*10/100);
            
        } else { // jika penjualan dibawah 15 maka akan ada pemotongan gaji
            gaji = gaji - ((15-jumlahPenjualan)*50000*15/100);
        }
        
        System.out.println(gaji);
    }
    
}

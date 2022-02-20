/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal2;
import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        String[] lang = new String[3];
        int[] num = new int[3];
        
        for(int i=0;i<3;i++){
        // input sebanyak 3 kali dengan format: [string] [integer]
            lang[i] = scn.next();
            num[i] = scn.nextInt();
        }
        
        System.out.println("");
        System.out.println("================================");
        
        for(int i=0;i<3;i++){
            /*  format string agar semua string yang tampil ke layar
                memiliki ukuran 15 karakter  */
            System.out.print(String.format("%-15s", lang[i]));
            
            /*  format agar integer yang tampil ke layar
                berukuran 3 digit  */
            System.out.println(String.format("%03d", num[i]));
        }
        System.out.println("================================");
    }
    
}

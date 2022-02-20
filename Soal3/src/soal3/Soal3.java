/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soal3;

import java.util.Scanner; 

/**
 *
 * @author lenovo
 */
public class Soal3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        
        int A, B;
        int result=0;
        String operator;
        
        A = scn.nextInt();
        operator = scn.next();
        B = scn.nextInt();
        
        switch(operator){
            case "+": result = A + B;
                   break;
            case "-": result = A - B;
                   break;
            case "*": result = A * B;
                   break;
            case "/": result = A / B;
                   break;
            case "%": result = A % B;
                   break;
        }
        
        System.out.println(result);
    }
    
}

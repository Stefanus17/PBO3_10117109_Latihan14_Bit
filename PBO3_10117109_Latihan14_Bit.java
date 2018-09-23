/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3_10117109_latihan14_bit;

/**
 *
 * @author 
 * NAMA  : Stefanus Saputra
 * KELAS : IF 3
 * NIM   : 10117109
 */
public class PBO3_10117109_Latihan14_Bit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = 60;/* 60 = 0011 1100 */
        int b = 13;/* 13 = 0000 1101 */
        int c = 0;
        c = a & b;
       
        System.out.println("a & b = " + c);
        c = a | b;
       
        System.out.println("a | b = " + c);
        c = a ^ b;
        
        System.out.println("a ^ b = " + c);
        c = ~a;
        
        System.out.println("~a = " + c);
        c = a << 2;
        
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        
        System.out.println("a >> 2 = " + c);
    }
}    
        
        
        
        
        
   
    


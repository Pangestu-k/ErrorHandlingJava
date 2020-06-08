/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ErrorHandlingStudy;

/**
 *
 * @author ~ H P ~
 */
public class latihan2 {
    public static void main(String[] args){
        //sintaks yg keliru
        //byte[] b = new byte[5];
        //try{System.in.read(b);
        //}catch(java.io.IOException e);
        //System.out.println("Hasil :" + (char) b[0] + (char) b[1] + (char) b[2]);
        
        //sintaks yg benar
        byte[] b = new byte[5];
        try{
            System.out.print("masukan Hobi :");
            System.in.read(b);
        }catch(java.io.IOException e){
            System.out.println(e);
        }
         System.out.println("Hasil :" + (char) b[0] + (char) b[1] + (char) b[2]);
         
         //jika menginputkan ngulik maka outputnya ngu
    }
}

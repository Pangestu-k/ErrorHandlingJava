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
public class latihan1 {
   public static void main(String[] args){
       //ini sintaks yang salah
       //int n = 0;
       //n = System.in.read();
       //System.out.println("Hasilnya :" + (char)n);
       
       //Ini sintaks yang benar
       int n = 0;
       try {
          System.out.print("masukan nama:");
          n =System.in.read(); 
       } catch (Exception e) {
           System.out.println(e);
       }
       System.out.println("Hasilnya :" + (char)n);
       
       //jika kita menginputkan pangestu maka output nya p
   }
}

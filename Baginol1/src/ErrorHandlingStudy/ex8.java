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
public class ex8 {
    public static void main(String[] args){
        double BILANGAN = 100.0;
        
        System.out.println("Sebelum Pembagian");
        
        for(int i=5; i >= 0; i--){
            try{
                System.out.print(BILANGAN + "/" + i + "=");
                System.out.println(BILANGAN / i);
            }finally{
                System.out.println("Bilangan finnally dijalankan");
            }
        }
        System.out.println("Selesai");
    }
}

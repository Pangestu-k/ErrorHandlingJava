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
public class latihan3 {
    public static void main(String[] args){
        //sintks yg salah
        //byte[] b = new byte[5];
        //System.out.print("Inputkan bilangan bulat : ");
        //try{System.in.read(b);
        //}catch(java.io.IOException e);
        //int N = Integer.ValueOf().intValue();
        //System.out.println("Hasil : " + (N + 2));
        
        //sintaks yg benar
        byte[] b = new byte[5];
        System.out.print("Inputkan bilangan bulat : ");
        try{
            System.in.read(b);
        }catch(java.io.IOException e){
            System.out.println(e);
        }
        String a = new String(b).trim();
        int N = Integer.valueOf(a);
        System.out.println("Hasil : " + (N + 2));
    }
    
    //jika kita menginputkan 2 maka output nya adalah 4
}

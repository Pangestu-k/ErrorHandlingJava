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
public class ex7 {
    static void methodeku() throws IllegalAccessException{
        System.out.println("ini isi methode ku");
        throw new IllegalAccessException("Mencoba");
    }
    
    public static void main(String[] args){
        try{
            methodeku();
        }catch(IllegalAccessException e){
            System.out.println("Tertangkap : " + e);
        }
    }
}

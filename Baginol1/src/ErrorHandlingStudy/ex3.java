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
public class ex3 {
    public static void main(String[] args){
        System.out.println("Sebelum Pembagian");
        try {
            System.out.println(5/0);
        } catch (Throwable t) {
            System.err.println("Ini jika terjadi pembagian 0");
        }
            System.err.println("sesudah pembagia");
    }
}

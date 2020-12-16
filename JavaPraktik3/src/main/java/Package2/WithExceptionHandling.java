/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package2;

/**
 *
 * @author Faisal
 */
public class WithExceptionHandling {
    public static void main(String[] args) {
    System.out.println("PROGRAM DENGAN EXCEPTION HANDLING");
    try {
        int hasil = 9/0;
        System.out.println("Hasil Pembagian = " + hasil);
        System.out.println("Pernyataan dalam blok try setelah bebas dari exception");
    }catch(ArithmeticException exc){
        System.err.println("ArithmeticException menangkap exception hasil pembagian oleh nol ");
        System.err.println("Exception yang ditangkap adalah : " + exc);
    }
    }
}

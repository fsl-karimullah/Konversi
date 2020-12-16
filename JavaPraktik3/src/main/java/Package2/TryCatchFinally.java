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
public class TryCatchFinally {
    public static void main (String[] args) {
    System.out.println("MENGGUNAKAN BLOK TRY-CATCH-FINALLY");
    
    
    try{
        int hasil = 9/0;
        System.out.println("Hasil Pembagian = " + hasil);
        System.out.println("Pertnyataan dalam blok try setelah bebas dari exception");
        
    }catch(ArithmeticException exc){
    System.err.println("Kita menangkap error exception arithmetic yang keluar di blok try");
    System.err.println("Exception tersebut adalah " + exc);
    }
    finally {
        System.out.println("Pernyataan dalam blok finally.");
    }
   System.out.println("Pernyataan diluar blok try catch dan finally");
    
    }
}

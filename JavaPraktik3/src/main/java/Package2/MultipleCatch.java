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
public class MultipleCatch {
    public static void main(String[] args) {
    System.out.println("MENGGUNAKAN MULTIPLE CATCH");
    
    try{
    int[] array = new int[9];
    System.out.println("Elemen array index ke 9 adalah " + array[6]);
    System.out.println("Pernyataan dalam blok try setelah bebas dari exception");
    }catch(ArrayIndexOutOfBoundsException exc){
        System.err.println("Anda mendeklarasi array di luar indeks yang di deklarasikan");
    }
    catch(NegativeArraySizeException e){
    System.err.println("Anda mendeklarasikan array dengan nilai negatif");
    }
    catch(Exception e){
    System.err.println("Anda melakukan pembagian dengan 0");
    }
    
    
    }
}

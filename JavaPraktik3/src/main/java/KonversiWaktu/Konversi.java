/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KonversiWaktu;

/**
 *
 * @author Faisal
 */
import java.util.Scanner;
public class Konversi {
    public static void main(String[] args) {
    System.out.println("Pilihan Konversi : \n" 
            + "1. Jam -> Menit \n"
            + "2. Detik -> Hari, Jam, Menit, dan detik"
    );
    
    System.out.println("\nMasukkan Pilihan");
    
    try (Scanner input = new Scanner(System.in)){
        if(!input.hasNextInt()){
        System.out.println("Tidak boleh memasukkan huruf !");
        }
        else{
        if(input.nextInt() == 1){
        System.out.println("Masukkan Jam : ");
        Scanner hours =  new Scanner(System.in);
           jamKeMenit(hours.nextInt());
        }else{
        System.out.println("Masukkan Detik : ");
        try(Scanner seconds = new Scanner(System.in)){
        detikKeHari(seconds.nextLong());
        }
        }
        }
    }
    
    }
    
    
public static void jamKeMenit(long jam){
long menit = jam * 60;
System.out.println("Menit: " + menit);

}

public static void detikKeHari(long detik){
    //hari 
    int hari = (int) (detik / (60 * 60 * 24));
    
    //jam
    detik %= (60 * 60 * 24);
    int jam = (int) (detik / (60 * 60));
    
    //menit
    detik %= (60 * 60);
    int menit = (int) (detik / 60);
    
    //detik
    detik %= 60;
    
    System.out.println(hari + " Hari, " + jam + " Jam," + menit + " Menit," + detik + " Detik");
    
}
}


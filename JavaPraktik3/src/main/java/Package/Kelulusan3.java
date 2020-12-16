/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package;

/**
 *
 * @author Faisal
 */
import java.util.Scanner;
public class Kelulusan3 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
        
    String nama = "";
    String JK = "";
    int TB = 0;
    
    System.out.println("Masukkan nama : ");
    nama = input.nextLine();
    
    System.out.println("Masukkan Jeni Kelamin (L / P)");
    JK = input.nextLine();
    switch(JK){
        case "L": 
        System.out.println("Laki Laki");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
        
        if(TB >= 0 && TB <= 170){
        System.out.println("Anda gagal");
        }
        else if(TB >= 171 && TB >= 230){
        System.out.println("Selamat anda lulus");
        }
        else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
             case "l": 
        System.out.println("Laki Laki");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
        
        if(TB >= 0 && TB <= 170){
        System.out.println("Anda gagal");
        }
        else if(TB >= 171 && TB <= 230){
        System.out.println("Selamat anda lulus");
        }
        else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
        case "P":
        System.out.println("Perempuan");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
         if(TB >= 0 && TB <= 160){
        System.out.println("Anda gagal");
        }
        else if(TB >= 161 && TB <= 210){
        System.out.println("Selamat anda lulus");
        }
          else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
            case "p":
        System.out.println("Perempuan");
        System.out.println("Masukkan tinggi badan ");
        TB = input.nextInt();
         if(TB >= 0 && TB <= 160){
        System.out.println("Anda gagal");
        }
        else if(TB >= 161 && TB <= 210){
        System.out.println("Selamat anda lulus");
        }
          else{
        System.out.println("Data Tinggi tidak valid ");
        }
            break;
        default:
            System.out.println("Pilihan tidak ada");
            break;
    }
    
   
    //Laki laki 0 - 170 anda gagal
    //laki laki 171 - 230 selamat anda lulu
    //perempuan 0 - 160 anda gagal
    //perempuan 161 - 210 selamat anda lulus
    
    
    
    
    
    }
}

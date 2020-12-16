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
public class Nilai {
    public static void main(String[] args) {
     int nilai = 0 ;
    Scanner input = new Scanner(System.in);
    
    System.out.println("Masukkan nilai");
    nilai = input.nextInt();
    
      if(nilai < 0 || nilai > 100) {
    System.out.println("Error");
    }
  else  if(nilai >= 0 && nilai <= 55){
    System.out.println("E");
    }
    else if(nilai >= 56 && nilai <= 65){
    System.out.println("D");
    }
    else if(nilai >= 66 && nilai <= 75){
    System.out.println("C");
    }
     else if(nilai >= 76 && nilai <= 85){
    System.out.println("B");
    }
      else if(nilai >= 86 && nilai <= 100){
    System.out.println("A");
    } 
    
    
    }
}

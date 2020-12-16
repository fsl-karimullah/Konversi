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
public class Kelulusan4 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    String huruf = "";
    System.out.println("Masukkan nilai huruf (A - E)");
    huruf = input.nextLine();
    
    switch(huruf){
        case "A":
            System.out.println("4");
            break;
        
            case "a":
            System.out.println("4");
            break;
            
            case "B":
            System.out.println("3");
            break;
            
            case "b":
            System.out.println("3");
            break;
            
            case "C":
            System.out.println("2");
            break;
            case "c":
            System.out.println("2");
            break;
            case "D":
            System.out.println("1");
            break;
            case "d":
            System.out.println("1");
            break;
            case "E":
            System.out.println("0");
            break;
            case "e":
            System.out.println("0");
            break;
            
        
        default:
            System.out.println("Hurus tidak terdaftar");
            break;
        
    }
        
        
    }
}

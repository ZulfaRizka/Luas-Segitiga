
package studikasus;

import java.util.Scanner;

/**
 *
 * @author MOKLET-1
 */
public class Studikasus {
    
       int a= 0;
       int t= 0;
       double hasil= 0.5*a*t;
    
    void luas(){
    System.out.println("Menghitung Luas Segitiga");
    Scanner input = new Scanner (System.in);  
    System.out.println("===========================");
    System.out.print("Masukkan Alas Segitiga   : ");
    a= input.nextInt();
    System.out.print("Masukkan Tinggi Segitiga : "); 
    t= input.nextInt();
    System.out.println("===========================");
    }
    void tampilan(){
    System.out.println("===========================");
    System.out.print(" Alas Segitiga   : "+a);
    System.out.print(" Tinggi Segitiga : "+t);
    System.out.print(" Luas Segitiga   : "+hasil);
    }
} 

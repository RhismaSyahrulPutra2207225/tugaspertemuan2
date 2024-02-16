/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1_ganjil;

import java.util.Scanner;
/**
 *
 * @author Rhisma Syahrul Putra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Meminta Input bilangan dari User
        System.out.print("Masukkan Bilangan Pertama: ");
        int bilangan1 = input.nextInt();
        System.out.print("Masukkan Bilangan Kedua: ");
        int bilangan2 = input.nextInt();
        System.out.print("Masukkan Bilangan Ketiga: ");
        int bilangan3 = input.nextInt();
        
        //Program untuk melakukan operasi (+, -, *, /)
        
        //Operasi Penjumlahan
        int hasilPenjumlahan = bilangan1 + bilangan2 + bilangan3;
        System.out.println("Hasil Penjumlahan: " + hasilPenjumlahan);
        
        //Operasi Pengurangan
        int hasilPengurangan = bilangan1 - bilangan2 - bilangan3;
        System.out.println("Hasil Pengurangan: " + hasilPengurangan);
        
        //Operasi Perkalian
        int hasilPerkalian = bilangan1 * bilangan2 * bilangan3;
        System.out.println("Hasil Perkalian: " + hasilPerkalian);
        
        //Operasi Pembagian
        double hasilPembagian = (double)bilangan1 / bilangan2 / bilangan3;
        System.out.println("Hasil Pembagian: " + hasilPembagian);
        
        input.close();
    }
    
}

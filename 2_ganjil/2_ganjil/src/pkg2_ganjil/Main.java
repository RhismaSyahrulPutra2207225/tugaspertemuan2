/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2_ganjil;

import java.util.Scanner;
/**
 *
 * @author rhisma syahrul putra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        //Meminta Input (Uang dan kondisi cuaca) dari User
        System.out.print("Masukan jumlah uang Anda (dalam Rupiah): ");
        int jumlahUang = input.nextInt();
        
        System.out.print("Apakah hari ini hujan? (true/false): ");
        boolean hujan = input.nextBoolean();
        
        //Menentukan apakah bisa pergi membeli gorengan atau tidak
        boolean bisaBeliGorengan = (jumlahUang > 5000) && (!hujan);
        
        if(bisaBeliGorengan) {
            System.out.println("Anda bisa membeli Gorengan");
        } else {
            System.out.println("Anda tidak bisa membeli Gorengan");
        }
        
        input.close();
    }
    
}

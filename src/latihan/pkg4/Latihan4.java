/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4;
import java.util.Scanner;
/**
 *
 * @author MOKLET-2
 */
public class Latihan4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Inputan User
        Scanner masukan = new Scanner (System.in);
        
        // Deklarasi Variabel
        int bil, hasil;
        
        // User Memasukkan Suatu Bilangan
        System.out.print("Masukkan Suatu Bilangan : ");
        bil = masukan.nextInt();
        
        // Pernyataan Hasil
        hasil = faktorial(bil);
        
        // Menampilkan Hasil dari Nilai Faktorial
        System.out.println("Nilai Faktorial "+ bil +" adalah "+ hasil);
    }
    // Method dari Nilai Faktorial
    private static int faktorial(int a){
        // Percabangan 
        // Jika Nilai A == 1, Maka Akan Menampilkan Hasil 1
        if (a==1)
            return 1;
        // Jika Tidak, Maka Nilai (a*faktorial(a-1))
         else 
            return (a*faktorial(a-1));
        }
   }

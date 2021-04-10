/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi.dan.inheritance;

import java.util.Scanner;

/**
 *
 * @author Bintang.Ilham
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //deklarasi variable
        String data, nama, kelas, alamat;
        int bayar, spp;
        //objek barusiswa1&2
        siswa1 wa1 = new siswa1();
        siswa2 wa2 = new siswa2();
        
        Scanner input = new Scanner(System.in);
        //perintah memilih
        System.out.println("Pilih Data apa yang anda Input? ketik a untuk Bayar SPP dan b untuk SPP");
        data = input.next();
        //jika ketik a 
        if(data.contains("a")){
            data = "siswa1";
        //atau jika ketik b    
        }else if(data.contains("b")){
            data = "siswa2";
        //tidak keduanya
        }else{
            System.out.println("Pilihan tidak ada!");
            System.exit(1);
        }
        //perintah isi data nama, kelas, alamat
        System.out.println("Masukkan Nama     : ");
        nama = input.next();
        System.out.println("Masukkan Kelas    : ");
        kelas = input.next();
        System.out.println("Masukkan Alamat   : ");
        alamat = input.next();
        
        //hasil dari jika memilih b
        if(data.contains("siswa2")){
            System.out.println("Tunggakan SPP : ");
            spp = input.nextInt();
            //memanggil method dari Class
            wa2.setClass(nama, kelas, nama);
            wa2.setsiswa2(spp);
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("===========================================");
            System.out.println(wa2.getsiswa2());
            System.out.println("===========================================");
            System.out.println("===========================================");
        //hasil dari ketik a
        }else{
            System.out.println("Masukkan Pembayaran : ");
            bayar = input.nextInt();
            //memanggil method Class
            wa1.setClass(nama, kelas, nama);
            wa1.setsiswa1(bayar);
            System.out.println("");
            System.out.println("===========================================");
            System.out.println("===========================================");
            System.out.println(wa1.getsiswa1());
            System.out.println("===========================================");
            System.out.println("==========================================="); 
    
        }
            
        }
        
}     
        
        
 
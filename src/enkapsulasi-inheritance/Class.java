/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enkapsulasi.dan.inheritance;

/**
 *
 * @author Bintang.Ilham
 */
class Class {
    //deklarasi variable
    String nama, kelas, alamat;
    //modifier, method & parameter
    protected void setClass(String n, String k, String a){
        this.nama = n;
        this.kelas = k;
        this.alamat = a;
        
    }
    public String getNama(){
        return nama;
    }
    
    protected String getKelas(){
        return kelas;
    }
    
    private String getAlamat(){
        return alamat;
    }
}
//subclass // keyword extends agar bisa menggunakan atribut dari Class
class siswa1 extends Class {
    private int bayar;
    
    protected void setsiswa1(int b){
        this.bayar = b;
    }
    protected String getsiswa1(){
        return("Nama Siswa   : "+nama+"\nKelas Siswa  : "+kelas+"\nAlamat Siswa : "+alamat+"\nPembayaran   : Rp."+bayar);
        
    }
}
//subclass // keyword extends agar bisa menggunakan atribut dari Class
class siswa2 extends Class {
    private int spp;
    
    protected void setsiswa2(int s){
        this.spp = s;   
    }
    protected String getsiswa2(){
        return("Nama Siswa   : "+nama+"\nKelas Siswa  : "+kelas+"\nAlamat Siswa : "+alamat+"\nSPP          : Rp."+spp);
    }
    
}
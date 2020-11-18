/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menampilkan anggota
 * akatsuki dan 6 tubuh pain yang berbeda
 */
public class Akatsuki {
    protected String jutsu;
    protected String desa;
    protected String keunikan;

    public Akatsuki(String jutsu, String keunikan, String desa) {
        this.jutsu = jutsu;
        this.desa = desa;
        this.keunikan = keunikan;
        
        //mengambil nama berdasarkan nama class
        String nama[] = getClass().getCanonicalName().split("\\.");
        System.out.println("Nama     : " + nama[nama.length - 1]);
    }
    
    public void status(){
        System.out.println("Anggota Akatsuki");
    }
    
    public void tampil(){
        System.out.println("Jutsu    : " + jutsu);
        System.out.println("desa     : " + desa);
        System.out.println("Keunikan : " + keunikan);
    }
}

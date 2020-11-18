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
public class Deidara extends Akatsuki{
    private String tujuan;

    public Deidara(String jutsu, String keunikan, String desa) {
        super(jutsu, keunikan, desa);
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    @Override
    public void status() {
        System.out.println("Status   : Mantan Anggota Akatsuki");
    }

    @Override
    public void tampil() {
        super.tampil();
        System.out.println("Tujuan   : " + tujuan);
    }
}

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
public class JigokudoPain extends PainNagato{

    public JigokudoPain(String jutsu, String keunikan, String desa) {
        super(jutsu, keunikan, desa);
    }

    @Override
    public void status() {
        System.out.println("Status   : Anggota Aktif Akatsuki yang merupakan bagian tubuh pain yang berbeda");
    }
    
}

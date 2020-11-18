/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119064.latihan60.akatsuki;

import model.ChikusodoPain;
import model.Deidara;
import model.GakidoPain;
import model.JigokudoPain;
import model.NingendoPain;
import model.PainNagato;
import model.ShuradoPain;
import model.TendoPain;

/**
 *
 * @author Bagus_24
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 * NIM          : 10119064 
 * Deskripsi Program : Program ini merupakan program untuk menampilkan anggota
 * akatsuki dan 6 tubuh pain yang berbeda
 */
public class PBOIF210119064Latihan60Akatsuki {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("===============Nama-Nama Anggota Akatsuki dan Statusnya===============");
        
        //inisialisasi objek Deidara
        Deidara deidara = new Deidara("Kekkei Genkai", "Spesialis ledakan menggunakan tanah liat", "Iwagakure");
        deidara.setTujuan("untuk menagkap siluman berekor satu Shukaku");
        deidara.tampil();
        deidara.status();
        
        System.out.println();
        
        //inisisalisasi objek Pain
        PainNagato painNagato = new PainNagato("Dojutsu", "Six Paths of Pain/Pein Rikudo", "Amegakuro");
        painNagato.setTujuan("mengambil Bijuu Pein atau Kyuubi si ekor sembilan di dalam tubuh Naruto");
        painNagato.tampil();
        painNagato.status();
        
        System.out.println();
        
        System.out.println("===============Six Paths of Pain===============");
        
        //inisilaisasi objek TendoPain
        TendoPain tendoPain = new TendoPain("Shinra Tensei", "Dapat memanipulasi", "Amegakure");
        tendoPain.setTujuan("mengambil Bijuu Pein atau Kyuubi si ekor sembilan di dalam tubuh Naruto");
        tendoPain.tampil();
        tendoPain.status();
        
        System.out.println();
        
        //inisilaisasi objek ShuradoPain
        ShuradoPain shuradoPain = new ShuradoPain("mengubah tubuhnya menjadi beragam persenjataan mekanik", "Memiliki tubuh seperti robot", "Tidak Diketahui");
        shuradoPain.setTujuan("mengambil Bijuu Pein atau Kyuubi si ekor sembilan di dalam tubuh Naruto");
        shuradoPain.tampil();
        shuradoPain.status();
        
        System.out.println();
        
        //inisilaisasi objek GakidoPain
        GakidoPain gakidoPain = new GakidoPain("Menyerap chakra dan ninjutsu", "dapat menggagalkan serangan", "Kusagakure");
        gakidoPain.setTujuan("mengambil Bijuu Pein atau Kyuubi si ekor sembilan di dalam tubuh Naruto");
        gakidoPain.tampil();
        gakidoPain.status();
        
        System.out.println();
        
        //inisilaisasi objek JigokudoPain
        JigokudoPain jigokudoPain = new JigokudoPain("Gedou Rinne Tensei no Jutsu", "Dapat menghidupkan orang nati", "Tidak Diketahui");
        jigokudoPain.setTujuan("mengambil Bijuu Pein atau Kyuubi si ekor sembilan di dalam tubuh Naruto");
        jigokudoPain.tampil();
        jigokudoPain.status();
        
        System.out.println();
        
        //inisilaisasi objek NingendoPain
        NingendoPain ningendoPain = new NingendoPain("Membaca Pikiran", "dapat menghapus jiwa seseorang", "Takigakure");
        ningendoPain.setTujuan("mengambil Bijuu Pein atau Kyuubi si ekor sembilan di dalam tubuh Naruto");
        ningendoPain.tampil();
        ningendoPain.status();
        
        System.out.println();
        
        //inisilaisasi objek ChikusodoPain
        ChikusodoPain chikusodoPain = new ChikusodoPain("Kuchiyose no jutsu", "menggunakan 2 tubuh", "Tidak diketahhui");
        chikusodoPain.setTujuan("mengambil Bijuu Pein atau Kyuubi si ekor sembilan di dalam tubuh Naruto");
        tendoPain.tampil();
        tendoPain.status();
    }
    
}

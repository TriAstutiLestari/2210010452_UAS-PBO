/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NILAI_MAIN_CLASS;
import SEKOLAH_VAR.MataPelajaran;
import SEKOLAH_VAR.Guru;
import java.sql.Date;

/**
 *
 * @author Lenovo
 */
public class NilaiSiswa {
    
    private String nama;
    private MataPelajaran mataPelajaran;
    
    public NilaiSiswa(String nama, MataPelajaran mataPelajaran){
        this.nama = nama;
        this.mataPelajaran = mataPelajaran;
    }
    
    public void nilaiTugas(){
        System.out.println(nama + " mendapat nilai tugas dengan nilai " + mataPelajaran.getHasilTugas() + " nilai.");
    }
    
    public void nilaiUTS(){
        System.out.println(nama + " mendapat nilai uts dengan nilai " + mataPelajaran.getHasilUTS() + " nilai.");
    }
    
    public void nilaiUAS(){
        System.out.println(nama + " mendapat nilai uas dengan nilai " + mataPelajaran.getHasilUAS() + " nilai.");
    }
    
    public void menghitungHasil(){
        double hasil = mataPelajaran.getHasilUAS() * mataPelajaran.getNilai();
        System.out.println("Hasil nilai yang dihasilkan oleh " + nama + " adalah " + hasil + " keseluruhan.");
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
    
}

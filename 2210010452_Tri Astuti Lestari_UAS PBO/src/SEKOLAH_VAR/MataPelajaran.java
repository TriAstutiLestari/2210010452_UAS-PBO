/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SEKOLAH_VAR;

/**
 *
 * @author Lenovo
 */
public class MataPelajaran {
    private int hasilTugas;
    private int hasilUTS;
    private int hasilUAS;
    private double nilai;
    
    public MataPelajaran(int hasilTugas, int hasilUTS, int hasilUAS, double nilai) {
        this.hasilTugas = hasilTugas;
        this.hasilUTS = hasilUTS;
        this.hasilUAS = hasilUAS;
        this.nilai = nilai;
    }
    
    public int getHasilTugas() {
        return hasilTugas;
    }
    
    public void setHasilTugas(int hasilTugas) {
        this.hasilTugas = hasilTugas;
    }
    
    public int getHasilUTS() {
        return hasilUTS;
    }
    
    public void setHasilUTS(int hasilUTS) {
        this.hasilUTS = hasilUTS;
    }
    
    public int getHasilUAS() {
        return hasilUAS;
    }
    
    public void setHasilUAS(int hasilUAS) {
        this.hasilUAS = hasilUAS;
    }
    
    public double getNilai() {
        return nilai;
    }
    
    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
    
}

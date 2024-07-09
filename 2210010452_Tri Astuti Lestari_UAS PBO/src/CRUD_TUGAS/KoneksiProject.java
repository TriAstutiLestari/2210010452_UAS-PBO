/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CRUD_TUGAS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

/**
 *
 * @author Lenovo
 */
public class KoneksiProject {
    private String database = "2210010452_tri astuti lestari";
    private String username = "root";
    private String password = "";
    private String lokasi = "jdbc:mysql://localhost/" + database;
    public static Connection koneksidb;
    
    public KoneksiProject() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            if (koneksidb == null || koneksidb.isClosed()) {
                koneksidb = DriverManager.getConnection(lokasi, username, password);
                System.out.println("Database Terkoneksi");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL SISWA START -------
    
    public void simpanSiswa(String tempnis, String tempnama, String tempkelas, String tempjenis_kelamin, String tempalamat){
        try {
            String sql = "INSERT INTO siswa (nis, nama, kelas, jenis_kelamin, alamat) VALUES (?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempnis);
            perintah.setString(2, tempnama);
            perintah.setString(3, tempkelas);
            perintah.setString(4, tempjenis_kelamin);
            perintah.setString(5, tempalamat);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void ubahSiswa(String tempnis, String tempnama, String tempkelas, String tempjenis_kelamin, String tempalamat){
        try {
            String sql = "UPDATE siswa SET nis = ?, nama = ?, kelas = ?, jenis_kelamin = ? WHERE alamat = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempnis);
            perintah.setString(2, tempnama);
            perintah.setString(3, tempkelas);
            perintah.setString(4, tempjenis_kelamin);
            perintah.setString(5, tempalamat);
            perintah.executeUpdate();
            System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public void hapusSiswa(String tempnis){
        try {
            String sql = "DELETE FROM siswa WHERE nis = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempnis);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }   
        //TABEL SISWA END -------
        
        
        
        //TABEL PELAJARAN START -------
        
        public void simpanMataPelajaran(String tempkode, String tempmata_pelajaran, String tempkelas, String tempjurusan){
            try{
                String sql = "INSERT INTO pelajaran (kode, mata_pelajaran, kelas, jurusan) VALUES (?,?,?,?)";
                PreparedStatement perintah = koneksidb.prepareStatement(sql);
                perintah.setString(1, tempkode);
                perintah.setString(2, tempmata_pelajaran);
                perintah.setString(3, tempkelas);
                perintah.setString(4, tempjurusan);
                perintah.executeUpdate();
                System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
                System.out.println(e.getMessage()); 
            }  
        }
        
        public void ubahMataPelajaran(String tempkode, String tempmata_pelajaran, String tempkelas, String tempjurusan){
            try{
                String sql = "UPDATE pelajaran set kode = ?, mata_pelajaran = ?, kelas = ?, AND jurusan = ?";
                PreparedStatement perintah = koneksidb.prepareStatement(sql);
                perintah.setString(1, tempkode);
                perintah.setString(2, tempmata_pelajaran);
                perintah.setString(3, tempkelas);
                perintah.setString(4, tempjurusan);
                perintah.executeUpdate();
                System.out.println("Data berhasil diubah");
        } catch (Exception e) {
                System.out.println(e.getMessage()); 
            }  
        }
        
        public void hapusMataPelajaran(String tempkode, String tempmata_pelajaran, String tempkelas, String tempjurusan){
            try{
                String sql = "DELETE From pelajaran WHERE kode = ? AND mata_pelajaran = ? AND kelas = ? AND jurusan = ?";
                PreparedStatement perintah = koneksidb.prepareStatement(sql);
                perintah.setString(1, tempkode);
                perintah.setString(2, tempmata_pelajaran);
                perintah.setString(3, tempkelas);
                perintah.setString(4, tempjurusan);
                perintah.executeUpdate();
                System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
                System.out.println(e.getMessage()); 
            }  
        }
        
        //TABEL PELAJARAN END -------
        
        
        
        //TABEL NILAI START -------
        
        public void simpanNilai(String tempid, String tempnis, String tempkode, String tempnilai, String tempjenis_nilai, String tempkelas, String tempsemester){
            try {
            String sql = "INSERT INTO nilai (id, nis, kode, nilai, jenis_nilai, kelas, semester) VALUES (?,?,?,?,?)";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid);
            perintah.setString(2, tempnis);
            perintah.setString(3, tempkode);
            perintah.setString(4, tempnilai);
            perintah.setString(5, tempjenis_nilai);
            perintah.setString(6, tempkelas);
            perintah.setString(7, tempsemester);
            perintah.executeUpdate();
            System.out.println("Data berhasil disimpan");
            } catch (Exception e) {
            System.out.println(e.getMessage());
            }    
        }
        
        public void ubahNilai (String tempid, String tempnis, String tempkode, String tempnilai, String tempjenis_nilai, String tempkelas, String tempsemester){
            try {
                String sql = "UPDATE nilai SET id = ?, nis = ?, kode = ?, nilai = ?, jenis_nilai = ?, kelas = ? WHERE semester = ?";
                PreparedStatement perintah = koneksidb.prepareStatement(sql);
                perintah.setString(1, tempid);
                perintah.setString(2, tempnis);
                perintah.setString(3, tempkode);
                perintah.setString(4, tempnilai);
                perintah.setString(5, tempjenis_nilai);
                perintah.setString(6, tempkelas);
                perintah.setString(7, tempsemester);
                perintah.executeUpdate();
                System.out.println("Data berhasil diubah");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        
        public void hapusNilai (String tempid){
        
        try {
            String sql = "DELETE FROM nilai WHERE id = ?";
            PreparedStatement perintah = koneksidb.prepareStatement(sql);
            perintah.setString(1, tempid);
            perintah.executeUpdate();
            System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    //TABEL NILAI END -------
        
        
        
    //TABEL GURU START -------
    
    public void simpanGuru (String tempid, String tempnama, String tempstatus, String tempjenis_kelamin, String tempno_hp, String tempalamat){
        try {
        String sql = "INSERT INTO guru (id, nama, status, jenis_kelamin, no_hp, alamat) values (?,?,?,?,?,?)";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempid);
        perintah.setString(2, tempnama);
        perintah.setString(3, tempstatus);
        perintah.setString(4, tempjenis_kelamin);
        perintah.setString(5, tempno_hp);
        perintah.setString(6, tempalamat);
        perintah.executeUpdate();
        System.out.println("Data berhasil disimpan");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void ubahGuru (String tempid, String tempnama, String tempstatus, String tempjenis_kelamin, String tempno_hp, String tempalamat){
        try {
        String sql = "UPDATE guru SET id = ?, nama = ?, status = ?, jenis_kelamin = ?, no_hp = ? WHERE alamat = ?";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempid);
        perintah.setString(2, tempnama);
        perintah.setString(3, tempstatus);
        perintah.setString(4, tempjenis_kelamin);
        perintah.setString(5, tempno_hp);
        perintah.setString(6, tempalamat);
        perintah.executeUpdate();
        System.out.println("Data berhasil diubah");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void hapusGuru (String tempNama){
        try {
        String sql = "DELETE FROM penyuluh WHERE nama = ?";
        PreparedStatement perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempNama);
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //TABEL GURU END -------
}

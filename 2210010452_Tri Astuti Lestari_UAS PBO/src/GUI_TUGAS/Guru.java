/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI_TUGAS;

/**
 *
 * @author Lenovo
 */
import static CRUD_TUGAS.KoneksiProject.koneksidb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Guru extends javax.swing.JFrame {

    /**
     * Creates new form Guru
     */
    DefaultTableModel model;
    private Object CRUD;
    public Guru() {
        initComponents();
        String [] judul ={"Id","Nama","Status","Jenis Kelamin","No Hp","Alamat"};
        model =new DefaultTableModel(judul,0);
        tabel.setModel(model);
        tampilkan();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        nama = new javax.swing.JTextField();
        status = new javax.swing.JTextField();
        jenis_kelamin = new javax.swing.JTextField();
        no_hp = new javax.swing.JTextField();
        alamat = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnubah = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btncari = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("GURU");

        jLabel2.setText("Id");

        jLabel3.setText("Nama");

        jLabel4.setText("Status");

        jLabel5.setText("Jenis Kelamin");

        jLabel6.setText("No Hp");

        jLabel7.setText("Alamat");

        btnsimpan.setText("Simpan");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnubah.setText("Ubah");
        btnubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnubahActionPerformed(evt);
            }
        });

        btnhapus.setText("Hapus");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btncari.setText("Cari");
        btncari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncariActionPerformed(evt);
            }
        });

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(btnsimpan))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(btnubah)
                                .addGap(43, 43, 43)
                                .addComponent(btnhapus))
                            .addComponent(no_hp, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(jenis_kelamin)
                            .addComponent(status)
                            .addComponent(nama)
                            .addComponent(id)
                            .addComponent(alamat))
                        .addGap(18, 18, 18)
                        .addComponent(btncari))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncari))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jenis_kelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(no_hp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsimpan)
                    .addComponent(btnhapus)
                    .addComponent(btnubah))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
        // TODO add your handling code here:
        try {
            
           if(id.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Id belum diisi");
                id.requestFocus();
            } else if(nama.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Nama belum diisi");
                nama.requestFocus();
            } else if(status.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Status belum diisi");
                status.requestFocus();
            } else if(jenis_kelamin.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Jenis Kelamin belum diisi");
                jenis_kelamin.requestFocus();
            } else if(no_hp.getText().equals("")){
                JOptionPane.showMessageDialog(this, "No Hp belum diisi");
                no_hp.requestFocus();
            } else if(alamat.getText().equals("")){
                JOptionPane.showMessageDialog(this, "Alamat belum diisi");
                alamat.requestFocus();
            } else {
                simpanGuru(id.getText(), nama.getText(), status.getText(), jenis_kelamin.getText(), no_hp.getText(), alamat.getText());
                JOptionPane.showMessageDialog(this, "data berhasil disimpan");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
           
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btnubahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnubahActionPerformed
        // TODO add your handling code here:
        try {
            if (
                id.getText().equals("") &&
                nama.getText().equals("") &&
                status.getText().equals("")&&
                jenis_kelamin.getText().equals("")&&
                no_hp.getText().equals("")&&
                alamat.getText().equals("")

            )
            {
                JOptionPane.showMessageDialog(this, "Silahkan cari data terlebih dahulu");
                id.requestFocus();
            } else {
                ubahGuru(id.getText(), nama.getText(), status.getText(), jenis_kelamin.getText(), no_hp.getText(), alamat.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil diubah");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnubahActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
        // TODO add your handling code here:
        try {
            if (
                id.getText().equals("") &&
                nama.getText().equals("") &&
                status.getText().equals("")&&
                jenis_kelamin.getText().equals("")&&
                no_hp.getText().equals("")&&
                alamat.getText().equals("")
            )
            {
                JOptionPane.showMessageDialog(this, "Silahkan cari data terlebih dahulu");
                id.requestFocus();
            } else {
                hapusGuru(id.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus");
                id.setText(null);
                nama.setText(null);
                status.setText(null);
                jenis_kelamin.setText(null);
                no_hp.setText(null);
                alamat.setText(null);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btncariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncariActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "SELECT * FROM guru WHERE id = '"+id.getText()+"'";
            var perintah = koneksidb.prepareStatement(sql);
            ResultSet data = perintah.executeQuery(sql);
            if (data.next()){
                nama.setText(data.getString("nama"));
                status.setText(data.getString("status"));
                jenis_kelamin.setText(data.getString("status"));
                no_hp.setText(data.getString("status"));
                alamat.setText(data.getString("status"));
            } else {
                nama.setText(null);
                status.setText(null);
                jenis_kelamin.setText(null);
                no_hp.setText(null);
                alamat.setText(null);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btncariActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Guru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Guru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Guru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Guru.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Guru().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat;
    private javax.swing.JButton btncari;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JButton btnubah;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jenis_kelamin;
    private javax.swing.JTextField nama;
    private javax.swing.JTextField no_hp;
    private javax.swing.JTextField status;
    private javax.swing.JTable tabel;
    // End of variables declaration//GEN-END:variables

        private void tampilkan() {
            int row = tabel.getRowCount();
            for(int a= 0; a<row;a++){
                model.removeRow(0);
            }
            try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/2210010452_tri astuti lestari","root","");
            ResultSet rs = cn.createStatement().executeQuery("SELECT * FROM guru");
            while(rs.next()){
                String data []= {rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6)};
                model.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Guru.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void simpanGuru(String tempid, String tempnama, String tempstatus, String tempjenis_kelamin, String tempno_hp, String tempalamat) {
        try {
        String sql = "INSERT INTO guru (id, nama, status, jenis_kelamin, no_hp, alamat) values (?,?,?,?,?,?)";
        var perintah = koneksidb.prepareStatement(sql);
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

    private void ubahGuru(String tempid, String tempnama, String tempstatus, String tempjenis_kelamin, String tempno_hp, String tempalamat) {
     try {
        String sql = "UPDATE guru SET id = ?, nama = ?, status = ?, jenis_kelamin = ?, no_hp = ? WHERE alamat = ?";
        var perintah = koneksidb.prepareStatement(sql);
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

    private void hapusGuru(String tempid) {
        try {
        String sql = "DELETE FROM guru WHERE id = ?";
        var perintah = koneksidb.prepareStatement(sql);
        perintah.setString(1, tempid);
        perintah.executeUpdate();
        System.out.println("Data berhasil dihapus");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
        
}

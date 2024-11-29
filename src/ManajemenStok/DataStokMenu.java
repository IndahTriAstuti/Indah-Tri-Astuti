package ManajemenStok;

import static javax.swing.JOptionPane.showMessageDialog;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DataStokMenu extends javax.swing.JFrame {

    private DefaultTableModel tableModel;

    private void simpanDataKeDatabase(String namaMenu, int jumlahStok, double harga) {
        String url = "jdbc:mysql://localhost:3306/db_warung_stok";
        String user = "root"; 
        String password = ""; 

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "INSERT INTO stok_menu (nama_menu, jumlah_stok, harga) VALUES (?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, namaMenu);
            statement.setInt(2, jumlahStok);
            statement.setDouble(3, harga);

            statement.executeUpdate();
            showMessageDialog(this, "Data berhasil disimpan ke database");
        } catch (SQLException e) {
            e.printStackTrace();
            showMessageDialog(this, "Gagal menyimpan data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public DataStokMenu() {
        initComponents();
        initTableModel();
    }

    private void initTableModel() {
        tableModel = new DefaultTableModel();
        tableModel.addColumn("Nama Menu");
        tableModel.addColumn("Jumlah Stok");
        tableModel.addColumn("Harga");
        jTable3.setModel(tableModel);
    }
           
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
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        jLabel1.setText("Manajemen Stok Warung ");

        jLabel2.setText("Nama Menu");

        jLabel3.setText("Harga ");

        jLabel4.setText("Jumlah Stok");

        jButton1.setText("Simpan Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nama Menu", "Jumlah Stok", "Harga"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jButton2.setText("Ubah Menu");

        jButton3.setText("Hapus Menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(28, 28, 28)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String namaMenu = jTextField1.getText();
        String jumlahStokStr = jTextField2.getText();
        String hargaStr = jTextField3.getText();
        
        if(namaMenu.isEmpty()||jumlahStokStr.isEmpty()||hargaStr.isEmpty()){
            javax.swing.JOptionPane.showMessageDialog(this,"Semua field harus diisi","Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int jumlahStok = Integer.parseInt(jumlahStokStr);
            double harga = Double.parseDouble(hargaStr);
            
        Object[] rowData = {namaMenu, jumlahStok, harga};
        tableModel.addRow(rowData);
        
        simpanDataKeDatabase(namaMenu, jumlahStok,harga);
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
       
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Jumlah stok dan harga harus berupa angka", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int selectedRow = jTable3.getSelectedRow();
        if (selectedRow == -1) {
            showMessageDialog(this, "Pilih baris yang ingin diubah", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String namaMenu = jTextField1.getText();
        String jumlahStokStr = jTextField2.getText();
        String hargaStr = jTextField3.getText();
        
        if (namaMenu.isEmpty() || jumlahStokStr.isEmpty() || hargaStr.isEmpty()) {
            showMessageDialog(this, "Semua field harus diisi", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try {
            int jumlahStok = Integer.parseInt(jumlahStokStr);
            double harga = Double.parseDouble(hargaStr);
            
            tableModel.setValueAt(namaMenu, selectedRow, 0);
            tableModel.setValueAt(jumlahStok, selectedRow, 1);
            tableModel.setValueAt(harga, selectedRow, 2);
            
            String url = "jdbc:mysql://localhost:3306/db_warung_stok";
            String user = "root";
            String password = "";
            
            try (Connection conn = DriverManager.getConnection(url, user, password)) {
                String sql = "UPDATE stok_menu SET jumlah_stok = ?, harga = ? WHERE nama_menu = ?";
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, jumlahStok);
                statement.setDouble(2, harga);
                statement.setString(3, namaMenu);
                
                statement.executeUpdate();
                showMessageDialog(this, "Data berhasil diubah di database");
            } catch (SQLException e) {
                e.printStackTrace();
                showMessageDialog(this, "Gagal mengubah data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            showMessageDialog(this, "Jumlah stok dan harga harus berupa angka", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
       
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     int selectedRow = jTable3.getSelectedRow();
        if (selectedRow == -1) {
            showMessageDialog(this, "Pilih baris yang ingin dihapus", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        String namaMenu = (String) tableModel.getValueAt(selectedRow, 0);
        
        tableModel.removeRow(selectedRow);
        
        String url = "jdbc:mysql://localhost:3306/db_warung_stok";
        String user = "root";
        String password = "";
        
        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            String sql = "DELETE FROM stok_menu WHERE nama_menu = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, namaMenu);
            
            statement.executeUpdate();
            showMessageDialog(this, "Data berhasil dihapus dari database");
        } catch (SQLException e) {
            e.printStackTrace();
            showMessageDialog(this, "Gagal menghapus data: " + e.getMessage(), "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
       // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(DataStokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataStokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataStokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataStokMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataStokMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

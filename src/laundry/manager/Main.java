/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laundry.manager;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gilar
 */
public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
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
        jk = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtKodeBuku = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtJudulBuku = new javax.swing.JTextField();
        txtTglTerbit = new javax.swing.JTextField();
        txtPengarang = new javax.swing.JTextField();
        btnInput_buku = new javax.swing.JButton();
        btnUpdate_buku = new javax.swing.JButton();
        btnDelete_buku = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableBuku = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        txtNamaSiswa = new javax.swing.JTextField();
        jComboKelas = new javax.swing.JComboBox();
        jRadioLaki = new javax.swing.JRadioButton();
        jRadioPerempuan = new javax.swing.JRadioButton();
        btnInput_siswa = new javax.swing.JButton();
        btnUpdate_siswa = new javax.swing.JButton();
        btnDelete_siswa = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tableSiswa = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtKodePinjam = new javax.swing.JTextField();
        txtKodeBuku_peminjaman = new javax.swing.JTextField();
        txtNIM_peminjaman = new javax.swing.JTextField();
        txtTglPinjam = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablePeminjaman = new javax.swing.JTable();
        btnInput_peminjaman = new javax.swing.JButton();
        btnUpdate_peminjaman = new javax.swing.JButton();
        btnDelete_peminjaman = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Laundry Manager");

        jLabel3.setText("Kode Buku");

        jLabel4.setText("Judul Buku");

        jLabel5.setText("Tgl Terbit");

        jLabel6.setText("Pengarang");

        btnInput_buku.setText("Input");
        btnInput_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInput_bukuActionPerformed(evt);
            }
        });

        btnUpdate_buku.setText("Update");
        btnUpdate_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_bukuActionPerformed(evt);
            }
        });

        btnDelete_buku.setText("Delete");
        btnDelete_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_bukuActionPerformed(evt);
            }
        });

        tableBuku.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Buku", "Judul Buku", "Tgl Terbit", "Pengarang"
            }
        ));
        tableBuku.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableBukuMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableBuku);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                    .addComponent(txtJudulBuku)
                                    .addComponent(txtTglTerbit)
                                    .addComponent(txtPengarang)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnInput_buku)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate_buku)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete_buku)))
                        .addGap(0, 87, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtKodeBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtJudulBuku, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTglTerbit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtPengarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInput_buku)
                    .addComponent(btnUpdate_buku)
                    .addComponent(btnDelete_buku))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Data ");

        jLabel8.setText("NIM");

        jLabel9.setText("Nama");

        jLabel10.setText("Kelas");

        jLabel11.setText("Jenis Kelamin");

        jComboKelas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "D3IF-41-01", "D3IF-41-02", "D3IF-41-03", "D3IF-41-04" }));

        jk.add(jRadioLaki);
        jRadioLaki.setText("Laki Laki");

        jk.add(jRadioPerempuan);
        jRadioPerempuan.setText("Perempuan");

        btnInput_siswa.setText("Input");
        btnInput_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInput_siswaActionPerformed(evt);
            }
        });

        btnUpdate_siswa.setText("Update");
        btnUpdate_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_siswaActionPerformed(evt);
            }
        });

        btnDelete_siswa.setText("Delete");
        btnDelete_siswa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_siswaActionPerformed(evt);
            }
        });

        tableSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Kelas", "Jenis Kelamin"
            }
        ));
        tableSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableSiswaMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tableSiswa);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jRadioLaki)
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadioPerempuan))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNIM, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(txtNamaSiswa)
                                        .addComponent(jComboKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnInput_siswa)
                                .addGap(18, 18, 18)
                                .addComponent(btnUpdate_siswa)
                                .addGap(18, 18, 18)
                                .addComponent(btnDelete_siswa)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamaSiswa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jRadioLaki)
                    .addComponent(jRadioPerempuan))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInput_siswa)
                    .addComponent(btnUpdate_siswa)
                    .addComponent(btnDelete_siswa))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Siswa");

        jLabel13.setText("Kode Pinjam");

        jLabel14.setText("Kode Buku");

        jLabel15.setText("NIM");

        jLabel16.setText("Tgl Pinjam");

        tablePeminjaman.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Pinjam", "Kode Buku", "NIM", "Tgl Pinjam"
            }
        ));
        jScrollPane4.setViewportView(tablePeminjaman);

        btnInput_peminjaman.setText("Input");
        btnInput_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInput_peminjamanActionPerformed(evt);
            }
        });

        btnUpdate_peminjaman.setText("Update");
        btnUpdate_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdate_peminjamanActionPerformed(evt);
            }
        });

        btnDelete_peminjaman.setText("Delete");
        btnDelete_peminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelete_peminjamanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtKodePinjam)
                            .addComponent(txtKodeBuku_peminjaman)
                            .addComponent(txtNIM_peminjaman)
                            .addComponent(txtTglPinjam, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnInput_peminjaman)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate_peminjaman)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete_peminjaman)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtKodePinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtKodeBuku_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtNIM_peminjaman, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txtTglPinjam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInput_peminjaman)
                            .addComponent(btnUpdate_peminjaman)
                            .addComponent(btnDelete_peminjaman)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel12.setText("Peminjaman");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addGap(327, 327, 327)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel12))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(372, 372, 372)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInput_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInput_bukuActionPerformed
        // TODO add your handling code here:
        String kodeBuku = txtKodeBuku.getText();
        String judulBuku = txtJudulBuku.getText();
        String tglTerbit =  txtTglTerbit.getText();
        String pengarang = txtPengarang.getText();
        DefaultTableModel model = (DefaultTableModel)tableBuku.getModel();
        model.addRow(new Object[]{kodeBuku, judulBuku, tglTerbit, pengarang});
        JOptionPane.showMessageDialog(null, "Data Buku Berhasil Disimpan");
        txtKodeBuku.setText("");
        txtJudulBuku.setText("");
        txtTglTerbit.setText("");
        txtPengarang.setText("");
    }//GEN-LAST:event_btnInput_bukuActionPerformed

    private void tableBukuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableBukuMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableBuku.getModel();
        txtKodeBuku.setText(model.getValueAt(tableBuku.getSelectedRow(),0).toString());
        txtJudulBuku.setText(model.getValueAt(tableBuku.getSelectedRow(),1).toString());
        txtTglTerbit.setText(model.getValueAt(tableBuku.getSelectedRow(),2).toString());
        txtPengarang.setText(model.getValueAt(tableBuku.getSelectedRow(),3).toString());
    }//GEN-LAST:event_tableBukuMouseClicked

    private void btnInput_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInput_siswaActionPerformed
        // TODO add your handling code here:
        String nim = txtNIM.getText();
        String nama = txtNamaSiswa.getText();
        String jenisk = null;
        String kelas = jComboKelas.getSelectedItem().toString();
        if (jRadioLaki.isSelected()) {
            jenisk = "Laki - Laki";
        }
        else if (jRadioPerempuan.isSelected()) {
            jenisk = "Perempuan";
        }
        DefaultTableModel model = (DefaultTableModel)tableSiswa.getModel();
        model.addRow(new Object[]{nim, nama, kelas, jenisk});
        txtNIM.setText("");
        txtNamaSiswa.setText("");
        jk.clearSelection();
        jComboKelas.setSelectedItem("D3IF-41-01");
        JOptionPane.showMessageDialog(null, "Data Siswa Berhasil Disimpan");
    }//GEN-LAST:event_btnInput_siswaActionPerformed

    private void btnInput_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInput_peminjamanActionPerformed
        // TODO add your handling code here:
        String kodepinjam = txtKodePinjam.getText();
        String kodebuku = txtKodeBuku_peminjaman.getText();
        String NIM = txtNIM_peminjaman.getText();
        String tglPinjam = txtTglPinjam.getText();
        DefaultTableModel model = (DefaultTableModel)tablePeminjaman.getModel();
        model.addRow(new Object[]{kodepinjam, kodebuku, NIM, tglPinjam});
        
        JOptionPane.showMessageDialog(null, "Data Peminjaman Berhasil Disimpan");
    }//GEN-LAST:event_btnInput_peminjamanActionPerformed

    private void tableSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableSiswaMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tableSiswa.getModel();
        txtNIM.setText(model.getValueAt(tableSiswa.getSelectedRow(),0).toString());
        txtNamaSiswa.setText(model.getValueAt(tableSiswa.getSelectedRow(),1).toString());
        String jenisk = model.getValueAt(tableSiswa.getSelectedRow(),3).toString();
        if (jenisk.equalsIgnoreCase("laki - laki")) {
            jRadioLaki.setSelected(true);
        }
        else if(jenisk.equalsIgnoreCase("perempuan")){
            jRadioPerempuan.setSelected(true);
        }
        String kelas = model.getValueAt(tableSiswa.getSelectedRow(),2).toString();
        for (int i = 0; i < jComboKelas.getItemCount(); i++) {
            if (kelas.equalsIgnoreCase((String)jComboKelas.getItemAt(i))) {
                jComboKelas.setSelectedIndex(i);
            }
        }
    }//GEN-LAST:event_tableSiswaMouseClicked

    private void btnUpdate_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_bukuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Comming Soon");
    }//GEN-LAST:event_btnUpdate_bukuActionPerformed

    private void btnDelete_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_bukuActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Comming Soon");
    }//GEN-LAST:event_btnDelete_bukuActionPerformed

    private void btnUpdate_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_siswaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Comming Soon");
    }//GEN-LAST:event_btnUpdate_siswaActionPerformed

    private void btnDelete_siswaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_siswaActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Comming Soon");
    }//GEN-LAST:event_btnDelete_siswaActionPerformed

    private void btnUpdate_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdate_peminjamanActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Comming Soon");
    }//GEN-LAST:event_btnUpdate_peminjamanActionPerformed

    private void btnDelete_peminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelete_peminjamanActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Comming Soon");
    }//GEN-LAST:event_btnDelete_peminjamanActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete_buku;
    private javax.swing.JButton btnDelete_peminjaman;
    private javax.swing.JButton btnDelete_siswa;
    private javax.swing.JButton btnInput_buku;
    private javax.swing.JButton btnInput_peminjaman;
    private javax.swing.JButton btnInput_siswa;
    private javax.swing.JButton btnUpdate_buku;
    private javax.swing.JButton btnUpdate_peminjaman;
    private javax.swing.JButton btnUpdate_siswa;
    private javax.swing.JComboBox jComboKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioLaki;
    private javax.swing.JRadioButton jRadioPerempuan;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.ButtonGroup jk;
    private javax.swing.JTable tableBuku;
    private javax.swing.JTable tablePeminjaman;
    private javax.swing.JTable tableSiswa;
    private javax.swing.JTextField txtJudulBuku;
    private javax.swing.JTextField txtKodeBuku;
    private javax.swing.JTextField txtKodeBuku_peminjaman;
    private javax.swing.JTextField txtKodePinjam;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNIM_peminjaman;
    private javax.swing.JTextField txtNamaSiswa;
    private javax.swing.JTextField txtPengarang;
    private javax.swing.JTextField txtTglPinjam;
    private javax.swing.JTextField txtTglTerbit;
    // End of variables declaration//GEN-END:variables
}

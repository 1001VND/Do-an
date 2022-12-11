/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.DangKyVeThangDAO;
import DAO.NhapXeDAO;
import DTO.DKVeThangDTO;
import DTO.TongVeDTO;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class PFDKiVeThang extends javax.swing.JPanel {

    /**
     * Creates new form PFGiveCarBack
     */
    public PFDKiVeThang() {
        initComponents();
        setSize(1040, 545);
        showTable();
        loadTable();
    }

    private void showTable() {
        DefaultTableModel tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Vé", "Tên Khách Hàng", "Số Điện Thoại", "Biển Số Xe", "Loại Xe", "Màu Xe", "Ngày Đăng Ký"});
        TableTTVeThang.setModel(tblModel);
    }

    public void loadTable() {
        ArrayList<TongVeDTO> list = DangKyVeThangDAO.tableVethang();
        DefaultTableModel tblModel = (DefaultTableModel) TableTTVeThang.getModel();
        Object[] row = new Object[7];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getMaVe();
            row[1] = list.get(i).getTenKhach();
            row[2] = list.get(i).getSdt();
            row[3] = list.get(i).getBienSo();
            row[4] = list.get(i).getLoaiXe();
            row[5] = list.get(i).getMauXe();
            row[6] = list.get(i).getNgayDk();
            tblModel.addRow(row);
        }
        TableTTVeThang.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (TableTTVeThang.getSelectedRow() >= 0) {
                    txtMaVe.setText((String) TableTTVeThang.getValueAt(TableTTVeThang.getSelectedRow(), 0));
                    txtName.setText((String) TableTTVeThang.getValueAt(TableTTVeThang.getSelectedRow(), 1));
                    txtSDT.setText((String) TableTTVeThang.getValueAt(TableTTVeThang.getSelectedRow(), 2));
                    txtBienSo.setText((String) TableTTVeThang.getValueAt(TableTTVeThang.getSelectedRow(), 3));
                    txtLoaiXe.setText((String) TableTTVeThang.getValueAt(TableTTVeThang.getSelectedRow(), 4));
                    txtMauXe.setText((String) TableTTVeThang.getValueAt(TableTTVeThang.getSelectedRow(), 5));
                }
            }
        });
    }

    public TongVeDTO themVethang() {
        TongVeDTO ac = new TongVeDTO();
        ac.setMaVe(txtMaVe.getText());
        ac.setLoaiVe("Vé Tháng");
        ac.setTenKhach(txtName.getText());
        ac.setSdt(txtSDT.getText());
        ac.setBienSo(txtBienSo.getText());
        ac.setLoaiXe(txtLoaiXe.getText());
        ac.setMauXe(txtMauXe.getText());
        ac.setNgayDk(LocalDate.now());
        if (txtLoaiXe.getText().equals("Xe máy")) {
            ac.setSoTien(100000);
        } else if (txtLoaiXe.getText().equals("Ô tô")) {
            ac.setSoTien(400000);
        }
        return ac;
    }

    public TongVeDTO themVethangTong() {
        TongVeDTO ac = new TongVeDTO();
        ac.setMaVe(txtMaVe.getText());
        ac.setTenKhach(txtName.getText());
        ac.setSdt(txtSDT.getText());
        ac.setBienSo(txtBienSo.getText());
        ac.setLoaiXe(txtLoaiXe.getText());
        ac.setMauXe(txtMauXe.getText());
        ac.setNgayDk(LocalDate.now());
        if (txtLoaiXe.getText().equals("Xe máy")) {
            ac.setSoTien(100000);
        } else if (txtLoaiXe.getText().equals("Ô tô")) {
            ac.setSoTien(400000);
        }
        return ac;
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
        TableTTVeThang = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnThemVT = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtMaVe = new javax.swing.JTextField();
        txtMauXe = new javax.swing.JTextField();
        txtBienSo = new javax.swing.JTextField();
        txtLoaiXe = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnXoaVT = new javax.swing.JButton();
        btnCapNhatVT = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        TableTTVeThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã vé", "Tên Khách Hàng	", "Số Điện Thoại", "Loại Xe", "Biển Số Xe", "Màu Xe", "Ngày Đăng Kí"
            }
        ));
        jScrollPane1.setViewportView(TableTTVeThang);
        if (TableTTVeThang.getColumnModel().getColumnCount() > 0) {
            TableTTVeThang.getColumnModel().getColumn(0).setPreferredWidth(100);
            TableTTVeThang.getColumnModel().getColumn(0).setMaxWidth(100);
            TableTTVeThang.getColumnModel().getColumn(3).setPreferredWidth(100);
            TableTTVeThang.getColumnModel().getColumn(3).setMaxWidth(100);
            TableTTVeThang.getColumnModel().getColumn(4).setPreferredWidth(150);
            TableTTVeThang.getColumnModel().getColumn(4).setMaxWidth(150);
            TableTTVeThang.getColumnModel().getColumn(5).setPreferredWidth(120);
            TableTTVeThang.getColumnModel().getColumn(5).setMaxWidth(120);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Đăng Kí Vé Gửi Tháng");
        jLabel1.setToolTipText("");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Loại Xe :");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Biển Số Xe :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Màu Xe :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Mã Vé :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Tên Khách Hàng :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Số Điện Thoại :");

        btnThemVT.setBackground(new java.awt.Color(102, 102, 255));
        btnThemVT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemVT.setText("Thêm Vé Tháng");
        btnThemVT.setBorder(null);
        btnThemVT.setBorderPainted(false);
        btnThemVT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemVT.setFocusPainted(false);
        btnThemVT.setName("btnThemVT"); // NOI18N
        btnThemVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVTActionPerformed(evt);
            }
        });

        btnLamMoi.setBackground(new java.awt.Color(102, 102, 255));
        btnLamMoi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnLamMoi.setText("Làm Mới");
        btnLamMoi.setBorder(null);
        btnLamMoi.setBorderPainted(false);
        btnLamMoi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLamMoi.setFocusPainted(false);
        btnLamMoi.setName("btnLamMoi"); // NOI18N
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setName("txtKhachHang"); // NOI18N

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSDT.setName("txtSDT"); // NOI18N
        txtSDT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDTActionPerformed(evt);
            }
        });

        txtMaVe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaVe.setName("txtMaVe"); // NOI18N
        txtMaVe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaVeActionPerformed(evt);
            }
        });

        txtMauXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMauXe.setName("txtMauXe"); // NOI18N
        txtMauXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMauXeActionPerformed(evt);
            }
        });

        txtBienSo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBienSo.setName("txtBienSo"); // NOI18N
        txtBienSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBienSoActionPerformed(evt);
            }
        });

        txtLoaiXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtLoaiXe.setName("txtLoaiXe"); // NOI18N
        txtLoaiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoaiXeActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        btnXoaVT.setBackground(new java.awt.Color(102, 102, 255));
        btnXoaVT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaVT.setText("Xóa Vé Tháng");
        btnXoaVT.setBorder(null);
        btnXoaVT.setBorderPainted(false);
        btnXoaVT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaVT.setFocusPainted(false);
        btnXoaVT.setName("btnXoaVT"); // NOI18N
        btnXoaVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaVTActionPerformed(evt);
            }
        });

        btnCapNhatVT.setBackground(new java.awt.Color(102, 102, 255));
        btnCapNhatVT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCapNhatVT.setText("Cập Nhật Vé Tháng");
        btnCapNhatVT.setBorder(null);
        btnCapNhatVT.setBorderPainted(false);
        btnCapNhatVT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCapNhatVT.setFocusPainted(false);
        btnCapNhatVT.setName("btnCapNhatVT"); // NOI18N
        btnCapNhatVT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatVTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel7)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(61, 61, 61)
                        .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCapNhatVT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemVT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaVT, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLamMoi, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(4, 4, 4)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaVe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemVT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtBienSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnCapNhatVT, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtMauXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaVT, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSDTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSDTActionPerformed

    private void txtMaVeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaVeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaVeActionPerformed

    private void txtMauXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMauXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMauXeActionPerformed

    private void txtBienSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBienSoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBienSoActionPerformed

    private void txtLoaiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoaiXeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoaiXeActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        txtMaVe.setText("");
        txtName.setText("");
        txtSDT.setText("");
        txtLoaiXe.setText("");
        txtBienSo.setText("");
        txtMauXe.setText("");
        loadTable();
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnThemVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVTActionPerformed
        try {
            if (txtMaVe.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập mã vé");
            } else if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập tên khách");
            } else if (txtSDT.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập số điện thoại");
            } else if (txtLoaiXe.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập loại xe");
            } else if (txtBienSo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập biển số");
            } else if (txtMauXe.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Chưa nhập màu xe");
            } else {
                String checkVe = txtMaVe.getText();
                DangKyVeThangDAO dkvt = new DangKyVeThangDAO();
                TongVeDTO dkdto = dkvt.checkVechoformVethang(checkVe);
                if (dkdto != null) {
                    JOptionPane.showMessageDialog(this, "Vé tháng đã tồn tại");
                    txtMaVe.setText("");
                } else {
                    TongVeDTO dkdto1 = themVethang();
                    TongVeDTO dkdto2 = themVethangTong();
                    if (dkvt.addVethang(dkdto1) > 0) {
                        dkvt.addVethangTong(dkdto2);
                        JOptionPane.showMessageDialog(this, "Thêm vé tháng thành công");
                        loadTable();
                        FVeThang form = new FVeThang(checkVe);
                        form.show();
                        form.setVisible(true);
                        txtMaVe.setText("");
                        txtName.setText("");
                        txtSDT.setText("");
                        txtLoaiXe.setText("");
                        txtBienSo.setText("");
                        txtMauXe.setText("");
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm vé tháng thất bại");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemVTActionPerformed

    private void btnCapNhatVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatVTActionPerformed
        try {
            String mave = txtMaVe.getText();
            String tenkh = txtName.getText();
            String sdt = txtSDT.getText();
            String bienso = txtBienSo.getText();
            String loaixe = txtLoaiXe.getText();
            String mauxe = txtMauXe.getText();
            if (txtMaVe.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Không được để trống mã vé");
            } else if (txtName.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Không được để trống tên khách");
            } else if (txtSDT.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Không được để trống số điện thoại");
            } else if (txtLoaiXe.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Không được để trống loại xe");
            } else if (txtBienSo.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Không được để trống biển số");
            } else if (txtMauXe.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Không được để trống màu xe");
            } else {
                DangKyVeThangDAO dkvt = new DangKyVeThangDAO();
                NhapXeDAO checkBien = new NhapXeDAO();
                if (checkBien.checkBien(bienso) != null) {
                    JOptionPane.showMessageDialog(this, "Xe hiện đang trong bãi. Không thể cập nhật");
                    txtMaVe.setText("");
                    txtName.setText("");
                    txtSDT.setText("");
                    txtLoaiXe.setText("");
                    txtBienSo.setText("");
                    txtMauXe.setText("");
                    loadTable();
                } else {
                    if (dkvt.checkVechoformVethang(mave) != null) {
                        JOptionPane.showMessageDialog(this, "Mã vé đã tồn tại");
                        txtMaVe.setText("");
                        txtName.setText("");
                        txtSDT.setText("");
                        txtLoaiXe.setText("");
                        txtBienSo.setText("");
                        txtMauXe.setText("");
                        loadTable();
                    } else {
                        int update = dkvt.updateVethang(mave, tenkh, sdt, bienso, loaixe, mauxe);
                        int updatetongvethang = dkvt.updateTongvethang(mave, tenkh, sdt, bienso, loaixe, mauxe);
                        if (update > 0 && updatetongvethang > 0) {
                            JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                            txtMaVe.setText("");
                            txtName.setText("");
                            txtSDT.setText("");
                            txtLoaiXe.setText("");
                            txtBienSo.setText("");
                            txtMauXe.setText("");
                            loadTable();
                        } else {
                            JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
                        }
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnCapNhatVTActionPerformed

    private void btnXoaVTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaVTActionPerformed
        try {
            DangKyVeThangDAO dkvt = new DangKyVeThangDAO();
            int xoa = dkvt.deleteVethang();
            if (xoa > 0) {
                String date = String.valueOf(LocalDate.now());
                LocalDate currentDate = LocalDate.parse(date);
                int month = currentDate.getMonthValue();
                int x = month - 1;
                System.out.println("Month: " + month);
                JOptionPane.showMessageDialog(this, "Xóa tất cả vé tháng " + x + " thành công");
                txtMaVe.setText("");
                txtName.setText("");
                txtSDT.setText("");
                txtLoaiXe.setText("");
                txtBienSo.setText("");
                txtMauXe.setText("");
                loadTable();
            } else {
                JOptionPane.showMessageDialog(this, "Xóa vé tháng thành công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaVTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableTTVeThang;
    private javax.swing.JButton btnCapNhatVT;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnThemVT;
    private javax.swing.JButton btnXoaVT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtBienSo;
    private javax.swing.JTextField txtLoaiXe;
    private javax.swing.JTextField txtMaVe;
    private javax.swing.JTextField txtMauXe;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import DAO.DangNhapDAO;
import DTO.AccountDTO;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class PFQuanLyNhanVien extends javax.swing.JPanel {

    /**
     * Creates new form PFGiveCarBack
     */
    public PFQuanLyNhanVien() {
        initComponents();
        setSize(1000, 505);
        showTable();
        loadTabel();
        txtPass.setPreferredSize(new Dimension(211, 30));
    }

    public AccountDTO themAccount() {
        AccountDTO ac = new AccountDTO();
        ac.setTaiKhoan(txtTaikhoan.getText());
        ac.setSdt(txtSdt.getText());
        ac.setTenNguoidung(txtTen.getText());
        ac.setMatKhau(txtPass.getText());
        return ac;
    }

    private void showTable() {
        DefaultTableModel tblModel;
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Tên Nhân Viên", "SDT", "Tài Khoản", "Mật khẩu"});
        TableNhanVien.setModel(tblModel);
    }

    public void loadTabel() {
        ArrayList<AccountDTO> list = DangNhapDAO.tableAcc();
        DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
        Object[] row = new Object[4];
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getTenNguoidung();
            row[1] = list.get(i).getSdt();
            row[2] = list.get(i).getTaiKhoan();
            row[3] = list.get(i).getMatKhau();
            tblModel.addRow(row);
        }
        TableNhanVien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (TableNhanVien.getSelectedRow() >= 0) {
                    txtTaikhoan.setEditable(false);
                    txtTen.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 0));
                    txtSdt.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 1));
                    txtTaikhoan.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 2));
                    txtPass.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 3));
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableNhanVien = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSdt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTaikhoan = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        btnThemTK = new javax.swing.JButton();
        btnXoaTK = new javax.swing.JButton();
        btnSuaTK = new javax.swing.JButton();
        txtTimkiem = new javax.swing.JTextField();
        btnTimkiem = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setPreferredSize(new java.awt.Dimension(1000, 505));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Quản Lý Nhân Viên");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nhân Viên");

        TableNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tên Nhân Viên", "SDT", "Tài Khoản", "Mật Khẩu"
            }
        ));
        jScrollPane1.setViewportView(TableNhanVien);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Tên Nhân Viên :");

        txtTen.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Số Điện Thoại :");

        txtSdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSdt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSdtActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tài Khoản :");

        txtTaikhoan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Mật Khẩu :");

        txtPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnThemTK.setBackground(new java.awt.Color(102, 102, 255));
        btnThemTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnThemTK.setText("Thêm Tài Khoản");
        btnThemTK.setBorder(null);
        btnThemTK.setBorderPainted(false);
        btnThemTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemTK.setFocusPainted(false);
        btnThemTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemTKActionPerformed(evt);
            }
        });

        btnXoaTK.setBackground(new java.awt.Color(102, 102, 255));
        btnXoaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnXoaTK.setText("Xóa Tài Khoản");
        btnXoaTK.setBorder(null);
        btnXoaTK.setBorderPainted(false);
        btnXoaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaTK.setFocusPainted(false);
        btnXoaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaTKActionPerformed(evt);
            }
        });

        btnSuaTK.setBackground(new java.awt.Color(102, 102, 255));
        btnSuaTK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSuaTK.setText("Cập Nhật Tài Khoản");
        btnSuaTK.setBorder(null);
        btnSuaTK.setBorderPainted(false);
        btnSuaTK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaTK.setFocusPainted(false);
        btnSuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTKActionPerformed(evt);
            }
        });

        txtTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTimkiem.setForeground(new java.awt.Color(153, 153, 153));
        txtTimkiem.setText("Nhập tài khoản...");
        txtTimkiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimkiemFocusGained(evt);
            }
        });
        txtTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTimkiemMouseClicked(evt);
            }
        });
        txtTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimkiemActionPerformed(evt);
            }
        });
        txtTimkiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTimkiemKeyPressed(evt);
            }
        });

        btnTimkiem.setBackground(new java.awt.Color(102, 102, 255));
        btnTimkiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnTimkiem.setText("Tìm kiếm");
        btnTimkiem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTimkiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimkiemMouseClicked(evt);
            }
        });
        btnTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimkiemActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Làm Mới");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)
                                        .addComponent(btnSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                                        .addComponent(btnXoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                            .addComponent(txtTaikhoan, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE))))
                                .addGap(224, 224, 224))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(466, 466, 466)
                                .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnTimkiem)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(20, 20, 20))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTaikhoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemTKActionPerformed
        try {
            DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
            String checkacc = txtTaikhoan.getText();
            if (txtTaikhoan.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản!");
            } else if (txtTen.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập tên nhân viên!");
            } else if (txtSdt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập số điện thoại!");
            } else if (txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập mật khẩu!");
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                AccountDTO tk = dn.CheckUser(checkacc);
                if (tk != null) {
                    JOptionPane.showMessageDialog(this, "Tài khoản đã tồn tại!");
                    txtTaikhoan.setText("");
                } else {
                    AccountDTO ac = themAccount();
                    if (dn.ThemTk(ac) > 0) {
                        JOptionPane.showMessageDialog(this, "Thêm tài khoản thành công!");
                        txtTaikhoan.setText("");
                        txtTen.setText("");
                        txtSdt.setText("");
                        txtPass.setText("");
                        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                            tblModel.removeRow(i);
                        }
                        loadTabel();
                    } else {
                        JOptionPane.showMessageDialog(this, "Thêm tài khoản thất bại!");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnThemTKActionPerformed

    private void txtTimkiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimkiemFocusGained

    }//GEN-LAST:event_txtTimkiemFocusGained

    private void txtTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimkiemMouseClicked
        txtTimkiem.setText("");
        txtTimkiem.setForeground(Color.black);
    }//GEN-LAST:event_txtTimkiemMouseClicked

    private void txtTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimkiemActionPerformed
        DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
        Object[] row = new Object[4];
        String checkAcc = txtTimkiem.getText();
        DangNhapDAO dn = new DangNhapDAO();
        if (txtTimkiem.getText().contains("Nhập tài khoản...") == true) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập tài khoản cần tìm");
        } else {
            AccountDTO ac = dn.findAccbyTaikhoan(txtTimkiem.getText());
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            if (ac != null) {
                row[0] = ac.getTenNguoidung();
                row[1] = ac.getSdt();
                row[2] = ac.getTaiKhoan();
                row[3] = ac.getMatKhau();
                tblModel.addRow(row);
                TableNhanVien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (TableNhanVien.getSelectedRow() >= 0) {
                            txtTaikhoan.setEditable(false);
                            txtTen.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 0));
                            txtSdt.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 1));
                            txtTaikhoan.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 2));
                            txtPass.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 3));
                        }
                    }
                });
                txtTimkiem.setText("Nhập tài khoản...");
                txtTimkiem.setForeground(new Color(153, 153, 153));
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản");
                txtTimkiem.setText("Nhập tài khoản...");
                txtTimkiem.setForeground(new Color(153, 153, 153));
                loadTabel();
            }
        }
    }//GEN-LAST:event_txtTimkiemActionPerformed

    private void txtTimkiemKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimkiemKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
            Object[] row = new Object[4];

            String checkAcc = txtTimkiem.getText();
            DangNhapDAO dn = new DangNhapDAO();
            AccountDTO ac = dn.findAccbyTaikhoan(txtTimkiem.getText());
            for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                tblModel.removeRow(i);
            }
            if (ac != null) {
                row[0] = ac.getTenNguoidung();
                row[1] = ac.getSdt();
                row[2] = ac.getTaiKhoan();
                row[3] = ac.getMatKhau();
                tblModel.addRow(row);
                TableNhanVien.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
                    @Override
                    public void valueChanged(ListSelectionEvent e) {
                        if (TableNhanVien.getSelectedRow() >= 0) {
                            txtTaikhoan.setEditable(false);
                            txtTen.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 0));
                            txtSdt.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 1));
                            txtTaikhoan.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 2));
                            txtPass.setText((String) TableNhanVien.getValueAt(TableNhanVien.getSelectedRow(), 3));
                        }
                    }
                });
                txtTimkiem.setText("Nhập tài khoản...");
                txtTimkiem.setForeground(new Color(153, 153, 153));
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy tài khoản");
                txtTimkiem.setText("Nhập tài khoản...");
                txtTimkiem.setForeground(new Color(153, 153, 153));
                loadTabel();
            }
        }
    }//GEN-LAST:event_txtTimkiemKeyPressed

    private void btnTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimkiemActionPerformed

    }//GEN-LAST:event_btnTimkiemActionPerformed

    private void txtSdtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSdtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSdtActionPerformed

    private void btnSuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTKActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
            if (txtTaikhoan.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else if (txtTen.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else if (txtSdt.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else if (txtPass.getText().equals("")) {
                JOptionPane.showMessageDialog(this, "Cập nhật thất bại do thông tin đang trống!");
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                String taikhoan = txtTaikhoan.getText();
                String tennv = txtTen.getText();
                String sdt = txtSdt.getText();
                String matkhau = txtPass.getText();
                if (dn.updateAcc(taikhoan, tennv, sdt, matkhau) > 0) {
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công!");
                    txtTaikhoan.setText("");
                    txtTen.setText("");
                    txtSdt.setText("");
                    txtPass.setText("");
                    for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
                        tblModel.removeRow(i);
                    }
                    loadTabel();
                } else {
                    JOptionPane.showMessageDialog(this, "Cập nhật thất bại!");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnSuaTKActionPerformed

    private void btnTimkiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimkiemMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimkiemMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        txtTaikhoan.setText("");
        txtTen.setText("");
        txtSdt.setText("");
        txtPass.setText("");
        txtTaikhoan.setEditable(true);
        DefaultTableModel tblModel = (DefaultTableModel) TableNhanVien.getModel();
        for (int i = tblModel.getRowCount() - 1; i >= 0; i--) {
            tblModel.removeRow(i);
        }
        loadTabel();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnXoaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaTKActionPerformed
        // TODO add your handling code here:
        try {

            if (txtTaikhoan.getText().contains("admin") == true) {
                JOptionPane.showMessageDialog(this, "Không thể xóa được tài khoản của admin!");
                txtTaikhoan.setText("");
                txtTen.setText("");
                txtSdt.setText("");
                txtPass.setText("");
                loadTabel();
            } else {
                DangNhapDAO dn = new DangNhapDAO();
                int ac = dn.deleteAcc(txtTaikhoan.getText());
                if (ac != 0) {
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thành công.");
                    txtTaikhoan.setText("");
                    txtTen.setText("");
                    txtSdt.setText("");
                    txtPass.setText("");
                    loadTabel();
                } else {
                    JOptionPane.showMessageDialog(this, "Xóa tài khoản thất bại!");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXoaTKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TableNhanVien;
    private javax.swing.JButton btnSuaTK;
    private javax.swing.JButton btnThemTK;
    private javax.swing.JButton btnTimkiem;
    private javax.swing.JButton btnXoaTK;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSdt;
    private javax.swing.JTextField txtTaikhoan;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtTimkiem;
    // End of variables declaration//GEN-END:variables
}

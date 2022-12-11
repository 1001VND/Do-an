package UI;

import DAO.NhapXeDAO;
import DTO.NhapXeDTO;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PFNhanXe extends javax.swing.JPanel {

    public PFNhanXe() {
        initComponents();
        setSize(1000, 505);
        autoDate();
        autoTime();
        loadChonVe();
        loadLoaiXe();
        String loaixe = cbxLoaiXe.getSelectedItem().toString();
        String loaive = cbxLoaive.getSelectedItem().toString();
        loadMave(loaive);
        loadcbxKhuVuc(loaixe, loaive);
        loadcbxViTri(loaive);
    }

    private void autoDate() {
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        txtNgaynhan.setText(s.format(d));
    }

    private void autoTime() {
        new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                txtGionhan.setText(s.format(d));
            }
        }).start();
    }

    private void loadChonVe() {
        ArrayList<String> list = NhapXeDAO.LoadComboBoxChonVe();
        cbxLoaive.removeAllItems();
        for (String item : list) {
            cbxLoaive.addItem(item.toString());
        }
    }

    private void loadMave(String loaive) {
        ArrayList<String> list = NhapXeDAO.LoadComboBoxMaVe(loaive);
        cbxMave.removeAllItems();
        for (String item : list) {
            cbxMave.addItem(item.toString());
        }
    }

    private void loadLoaiXe() {
        ArrayList<String> list = NhapXeDAO.LoadcbxLoaiXe();
        cbxLoaiXe.removeAllItems();
        for (String item : list) {
            cbxLoaiXe.addItem(item.toString());
        }
    }

    private void loadcbxKhuVuc(String loaixe, String loaive) {
        ArrayList<String> list = NhapXeDAO.LoadcbxKhuVuc(loaixe, loaive);
        cbxKhuVuc.removeAllItems();
        for (String item : list) {
            cbxKhuVuc.addItem(item.toString());
        }
    }

    private void loadcbxViTri(String loaive) {
        ArrayList<String> list = NhapXeDAO.LoadcbxViTri(loaive);
        cbxViTri.removeAllItems();
        for (String item : list) {
            cbxViTri.addItem(item.toString());
        }
    }

    public NhapXeDTO addXe() {
        NhapXeDTO themxe = new NhapXeDTO();
        themxe.setBienSo(txtBienso.getText());
        themxe.setLoaiXe(cbxLoaiXe.getSelectedItem().toString());
        themxe.setLoaiVe(cbxLoaive.getSelectedItem().toString());
        themxe.setMaVe(cbxMave.getSelectedItem().toString());
        themxe.setMauXe(txtMauxe.getText());
        themxe.setKhuVuc(cbxKhuVuc.getSelectedItem().toString());
        if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
            themxe.setViTri("");
        } else {
            themxe.setViTri(cbxViTri.getSelectedItem().toString());
        }
        themxe.setNgayGui(LocalDate.parse(txtNgaynhan.getText()));
        themxe.setGioGui(txtGionhan.getText());
        return themxe;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxLoaive = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxMave = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtBienso = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMauxe = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbxLoaiXe = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbxKhuVuc = new javax.swing.JComboBox<>();
        cbxViTri = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtNgaynhan = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtGionhan = new javax.swing.JTextField();
        btnXacNhan = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Loại Vé : ");

        cbxLoaive.setBackground(new java.awt.Color(102, 102, 255));
        cbxLoaive.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxLoaive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxLoaive.setBorder(null);
        cbxLoaive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaive.setFocusable(false);
        cbxLoaive.setName("cbxLoaive"); // NOI18N
        cbxLoaive.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiveItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Mã Vé : ");

        cbxMave.setBackground(new java.awt.Color(102, 102, 255));
        cbxMave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxMave.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxMave.setBorder(null);
        cbxMave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxMave.setFocusable(false);
        cbxMave.setName("cbxMave"); // NOI18N
        cbxMave.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMaveItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Biển Số Xe :");

        txtBienso.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtBienso.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtBienso.setName("txtBienso"); // NOI18N
        txtBienso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBiensoKeyPressed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Màu Xe :");

        txtMauxe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMauxe.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtMauxe.setName("txtMauxe"); // NOI18N
        txtMauxe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMauxeKeyPressed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Loại Xe :");

        cbxLoaiXe.setBackground(new java.awt.Color(102, 102, 255));
        cbxLoaiXe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxLoaiXe.setBorder(null);
        cbxLoaiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxLoaiXe.setFocusable(false);
        cbxLoaiXe.setName("cbxLoaiXe"); // NOI18N
        cbxLoaiXe.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLoaiXeItemStateChanged(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Khu Vực :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Vị Trí :");
        jLabel7.setToolTipText("");

        cbxKhuVuc.setBackground(new java.awt.Color(102, 102, 255));
        cbxKhuVuc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxKhuVuc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxKhuVuc.setBorder(null);
        cbxKhuVuc.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxKhuVuc.setFocusable(false);
        cbxKhuVuc.setName("cbxKhuVuc"); // NOI18N

        cbxViTri.setBackground(new java.awt.Color(102, 102, 255));
        cbxViTri.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbxViTri.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxViTri.setBorder(null);
        cbxViTri.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxViTri.setFocusable(false);
        cbxViTri.setName("cbxViTri"); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Ngày Nhận :");

        txtNgaynhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgaynhan.setName("txtNgaynhan"); // NOI18N

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Giờ Nhận :");

        txtGionhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtGionhan.setName("txtGionhan"); // NOI18N

        btnXacNhan.setBackground(new java.awt.Color(102, 102, 255));
        btnXacNhan.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXacNhan.setText("Xác Nhận");
        btnXacNhan.setBorder(null);
        btnXacNhan.setBorderPainted(false);
        btnXacNhan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXacNhan.setName("btnXacNhan"); // NOI18N
        btnXacNhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXacNhanActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel10.setText("Nhận Xe");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(48, 48, 48)
                                .addComponent(cbxLoaive, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                                        .addComponent(txtMauxe, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel2))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cbxMave, 0, 141, Short.MAX_VALUE)
                                            .addComponent(txtBienso, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addGap(18, 18, 18))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(44, 44, 44)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbxViTri, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbxKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNgaynhan, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(txtGionhan, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)))
                            .addComponent(jSeparator2)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxLoaive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cbxLoaiXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtNgaynhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbxMave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbxKhuVuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtGionhan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtBienso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxViTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtMauxe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(65, 65, 65)
                .addComponent(btnXacNhan, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbxLoaiXeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiXeItemStateChanged
        cbxLoaiXe = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String loaixe = cbxLoaiXe.getSelectedItem().toString();
            String loaive = cbxLoaive.getSelectedItem().toString();
            if (cbxLoaive.getSelectedItem().toString().equals("Vé Ngày")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    loadcbxKhuVuc("Ô tô", loaive);
                    loadcbxViTri(loaive);
                    cbxViTri.setEnabled(true);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    loadcbxKhuVuc("Xe máy", loaive);
                    cbxViTri.setEnabled(false);
                    cbxViTri.removeAllItems();
                }
            } else if (cbxLoaive.getSelectedItem().toString().equals("Vé Tháng")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    loadcbxKhuVuc("Ô tô", loaive);
                    loadcbxViTri(loaive);
                    cbxViTri.setEnabled(true);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    loadcbxKhuVuc("Xe máy", loaive);
                    cbxViTri.setEnabled(false);
                    cbxViTri.removeAllItems();
                }
            }
        }
    }//GEN-LAST:event_cbxLoaiXeItemStateChanged

    private void cbxLoaiveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLoaiveItemStateChanged
        cbxLoaive = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            String loaixe = cbxLoaiXe.getSelectedItem().toString();
            String loaive = cbxLoaive.getSelectedItem().toString();
            String khuvuc = cbxKhuVuc.getSelectedItem().toString();
            if (cbxLoaive.getSelectedItem().toString().equals("Vé Ngày")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    cbxLoaiXe.setEnabled(true);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(true);
                    txtMauxe.setEnabled(true);
                    txtBienso.setText("");
                    txtMauxe.setText("");
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadcbxKhuVuc(loaixe, loaive);
                    loadMave(loaive);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    cbxLoaiXe.setEnabled(true);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(true);
                    txtMauxe.setEnabled(true);
                    txtBienso.setText("");
                    txtMauxe.setText("");
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadcbxKhuVuc(loaixe, loaive);
                    loadcbxViTri(loaive);
                    loadMave(loaive);
                }
            } else if (cbxLoaive.getSelectedItem().toString().equals("Vé Tháng")) {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                    cbxLoaiXe.setEnabled(false);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(false);
                    txtMauxe.setEnabled(false);
                    txtBienso.setDisabledTextColor(Color.black);
                    txtMauxe.setDisabledTextColor(Color.black);
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadMave(loaive);
                    loadcbxKhuVuc(loaixe, loaive);
                    loadcbxViTri(loaive);
                } else if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    cbxLoaiXe.setEnabled(false);
                    cbxKhuVuc.setEnabled(true);
                    txtBienso.setEnabled(false);
                    txtMauxe.setEnabled(false);
                    txtBienso.setDisabledTextColor(Color.black);
                    txtMauxe.setDisabledTextColor(Color.black);
                    cbxViTri.removeAllItems();
                    cbxKhuVuc.removeAllItems();
                    loadcbxKhuVuc(loaixe, loaive);
                    loadMave(loaive);
                }
            }
        }
    }//GEN-LAST:event_cbxLoaiveItemStateChanged

    private void cbxMaveItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMaveItemStateChanged
        cbxMave = (JComboBox<String>) evt.getSource();
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            if (cbxLoaive.getSelectedItem().toString().equals("Vé Tháng")) {
                String loaive = cbxLoaive.getSelectedItem().toString();
                String loaixe = cbxLoaiXe.getSelectedItem().toString();
                String mave = cbxMave.getSelectedItem().toString();
                NhapXeDAO nxa = new NhapXeDAO();
                NhapXeDTO nxt = nxa.load2Text(mave);
                if (nxt != null) {
                    txtBienso.setText(nxt.getBienSo());
                    txtMauxe.setText(nxt.getMauXe());
                    cbxLoaiXe.setSelectedItem(nxt.getLoaiXe());
                    if (cbxLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
                        loadcbxViTri(loaive);
                    }
                }
            }
        }
    }//GEN-LAST:event_cbxMaveItemStateChanged

    private void btnXacNhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXacNhanActionPerformed
        try {
            if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                if (txtBienso.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                } else {
                    String checkBienso = txtBienso.getText();
                    String loaive = cbxLoaive.getSelectedItem().toString();
                    String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                    String loaixe = cbxLoaiXe.getSelectedItem().toString();
                    NhapXeDAO nx = new NhapXeDAO();
                    NhapXeDTO checkxe = nx.checkBien(checkBienso);
                    if (checkxe != null) {
                        JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                        txtBienso.setText("");
                    } else {
                        NhapXeDTO themxe = addXe();
                        if (nx.ThemXe(themxe) > 0) {
                            JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                            loadMave(checkBienso);
                            loadLoaiXe();
                            loadChonVe();

                            loadcbxKhuVuc(loaixe, loaive);
                            loadcbxViTri(loaive);
                            txtBienso.setText("");
                            txtMauxe.setText("");
                        } else {
                            JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                        }
                    }
                }
            } else {
                if (txtBienso.getText().equals("")) {
                    JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                } else {
                    String checkBienso = txtBienso.getText();
                    NhapXeDAO nx = new NhapXeDAO();
                    NhapXeDTO checkxe = nx.checkBien(checkBienso);
                    if (checkxe != null) {
                        JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                        txtBienso.setText("");
                    } else {
                        NhapXeDTO themxe = addXe();
                        String loaive = cbxLoaive.getSelectedItem().toString();
                        String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                        String loaixe = cbxLoaiXe.getSelectedItem().toString();
                        if (nx.ThemXe(themxe) > 0) {
                            JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                            loadMave(checkBienso);
                            loadLoaiXe();
                            loadChonVe();

                            loadcbxKhuVuc(loaixe, loaive);
                            loadcbxViTri(loaive);
                            txtBienso.setText("");
                            txtMauxe.setText("");
                        } else {
                            JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnXacNhanActionPerformed

    private void txtBiensoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBiensoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        String loaive = cbxLoaive.getSelectedItem().toString();
                        String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                        String loaixe = cbxLoaiXe.getSelectedItem().toString();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();

                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                } else {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            String loaive = cbxLoaive.getSelectedItem().toString();
                            String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                            String loaixe = cbxLoaiXe.getSelectedItem().toString();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();

                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtBiensoKeyPressed

    private void txtMauxeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMauxeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                if (cbxLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        String loaive = cbxLoaive.getSelectedItem().toString();
                        String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                        String loaixe = cbxLoaiXe.getSelectedItem().toString();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();

                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                } else {
                    if (txtBienso.getText().equals("")) {
                        JOptionPane.showMessageDialog(this, "Vui lòng nhập biển số");
                    } else {
                        String checkBienso = txtBienso.getText();
                        NhapXeDAO nx = new NhapXeDAO();
                        NhapXeDTO checkxe = nx.checkBien(checkBienso);
                        if (checkxe != null) {
                            JOptionPane.showMessageDialog(this, "Xe đã có trong bãi");
                            txtBienso.setText("");
                        } else {
                            NhapXeDTO themxe = addXe();
                            String loaive = cbxLoaive.getSelectedItem().toString();
                            String khuvuc = cbxKhuVuc.getSelectedItem().toString();
                            String loaixe = cbxLoaiXe.getSelectedItem().toString();
                            if (nx.ThemXe(themxe) > 0) {
                                JOptionPane.showMessageDialog(this, "Nhập xe thành công!");
                                loadMave(checkBienso);
                                loadLoaiXe();
                                loadChonVe();

                                loadcbxKhuVuc(loaixe, loaive);
                                loadcbxViTri(loaive);
                                txtBienso.setText("");
                                txtMauxe.setText("");
                            } else {
                                JOptionPane.showMessageDialog(this, "Nhập xe thất bại!");
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_txtMauxeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnXacNhan;
    private javax.swing.JComboBox<String> cbxKhuVuc;
    private javax.swing.JComboBox<String> cbxLoaiXe;
    private javax.swing.JComboBox<String> cbxLoaive;
    private javax.swing.JComboBox<String> cbxMave;
    private javax.swing.JComboBox<String> cbxViTri;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtBienso;
    private javax.swing.JTextField txtGionhan;
    private javax.swing.JTextField txtMauxe;
    private javax.swing.JTextField txtNgaynhan;
    // End of variables declaration//GEN-END:variables
}

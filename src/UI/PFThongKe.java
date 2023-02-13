/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
/**
 *
 * @author Admin
 */
public class PFThongKe extends javax.swing.JPanel {

    /**
     * Creates new form PFGiveCarBack
     */
    public PFThongKe() {
        initComponents();
        setSize(1000,505);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTKGuiXe = new javax.swing.JButton();
        btnTKVeThang = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(204, 204, 255));

        btnTKGuiXe.setBackground(new java.awt.Color(102, 102, 255));
        btnTKGuiXe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTKGuiXe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_traffic_jam_96px.png"))); // NOI18N
        btnTKGuiXe.setText("Xem Thống Kê Lượt Gửi Xe");
        btnTKGuiXe.setBorder(null);
        btnTKGuiXe.setBorderPainted(false);
        btnTKGuiXe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTKGuiXe.setFocusPainted(false);
        btnTKGuiXe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTKGuiXe.setName("btnTKGuiXe"); // NOI18N
        btnTKGuiXe.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTKGuiXe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKGuiXeActionPerformed(evt);
            }
        });

        btnTKVeThang.setBackground(new java.awt.Color(102, 102, 255));
        btnTKVeThang.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnTKVeThang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/icons8_credit_card_96px.png"))); // NOI18N
        btnTKVeThang.setText("Xem Thống Kê Lượt Đăng Kí Vé Tháng");
        btnTKVeThang.setBorder(null);
        btnTKVeThang.setBorderPainted(false);
        btnTKVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTKVeThang.setFocusPainted(false);
        btnTKVeThang.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTKVeThang.setName("btnTKVeThang"); // NOI18N
        btnTKVeThang.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTKVeThang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTKVeThangActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Thống Kê");

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(btnTKGuiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnTKVeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jSeparator1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTKGuiXe, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTKVeThang, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTKVeThangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKVeThangActionPerformed
        
    }//GEN-LAST:event_btnTKVeThangActionPerformed

    private void btnTKGuiXeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTKGuiXeActionPerformed
        new FThongKeLuotGuiXe().setVisible(true);
    }//GEN-LAST:event_btnTKGuiXeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTKGuiXe;
    private javax.swing.JButton btnTKVeThang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

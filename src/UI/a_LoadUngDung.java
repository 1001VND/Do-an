package UI;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author Lê Quang Hưng
 */
public class a_LoadUngDung extends javax.swing.JFrame {

    /**
     * Creates new form a_LoadUngDung
     */
    public a_LoadUngDung() {
        initComponents();
        setSize(1270, 720);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LoadindLabel = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();
        LoadingBar = new javax.swing.JProgressBar();
        BackGroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1270, 720));

        BackGroundPane.setBackground(new java.awt.Color(102, 102, 255));
        BackGroundPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/Tham-khao-mau-icon-Hello-dac-sac-removebg-preview.png"))); // NOI18N
        BackGroundPane.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 430));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/d746925076f7acef40bc89a27ad40b9a-removebg-preview.png"))); // NOI18N
        BackGroundPane.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 540, 410));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("Chào Mừng Đến Phần Mềm Của Nhóm 9");
        BackGroundPane.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, 780, 100));

        LoadindLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoadindLabel.setText("Đang tải...");
        BackGroundPane.add(LoadindLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 680, 510, 30));

        LoadingValue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        LoadingValue.setText("0%");
        BackGroundPane.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 680, 50, 30));
        BackGroundPane.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 710, 1270, 10));

        BackGroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/Image/photo-1617957689233-207e3cd3c610 (1).jpg"))); // NOI18N
        BackGroundImage.setPreferredSize(new java.awt.Dimension(1270, 720));
        BackGroundPane.add(BackGroundImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1270, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(a_LoadUngDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(a_LoadUngDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(a_LoadUngDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(a_LoadUngDung.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        a_LoadUngDung form = new a_LoadUngDung();
        form.setVisible(true);
        try {
            for (int i = 0; i <= 100; i=i+2) {
                Thread.sleep(100);
                form.LoadingValue.setText(i + "%");
                if (i==10){
                    form.LoadindLabel.setText("Đang khởi động hệ thống");
                } 
                if (i==20){
                    form.LoadindLabel.setText("Đang tải dữ liệu");
                }
                if (i==50){
                    form.LoadindLabel.setText("Đang kết nối máy chủ");
                }
                if (i==70){
                    form.LoadindLabel.setText("Kết nối thành công");
                }
                if (i==80){
                    form.LoadindLabel.setText("Đang khởi động giao diện");
                } if (i==100){
                    new FLogin().setVisible(true);
                    form.dispose();
                }
                form.LoadingBar.setValue(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackGroundImage;
    private javax.swing.JPanel BackGroundPane;
    private javax.swing.JLabel LoadindLabel;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}

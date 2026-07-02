package hu.kisspd.keszletnyilv.gui;
import hu.kisspd.keszletnyilv.MySQLConn;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Register extends javax.swing.JFrame {
    Connection conn = null;

    public Register() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Nev = new javax.swing.JLabel();
        jLabel_Jelszo = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel_Jelszo_ism = new javax.swing.JLabel();
        jPasswordField_2 = new javax.swing.JPasswordField();
        jButton_Jovahagy = new javax.swing.JButton();
        jButton_Vissza = new javax.swing.JButton();
        jCheckBox_1 = new javax.swing.JCheckBox();
        jLabel_Info = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Nev.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Nev.setText("Név:");

        jLabel_Jelszo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Jelszo.setText("Jelszó:");

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPasswordField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel_Jelszo_ism.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Jelszo_ism.setText("Jelszó ismétlés:");

        jPasswordField_2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_Jovahagy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Jovahagy.setText("Felvétel");
        jButton_Jovahagy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_JovahagyActionPerformed(evt);
            }
        });

        jButton_Vissza.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Vissza.setText("Vissza");
        jButton_Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisszaActionPerformed(evt);
            }
        });

        jCheckBox_1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jCheckBox_1.setText("Rendszergazda");

        jLabel_Info.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Info.setText("Info:");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 853, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox_1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Jelszo)
                                    .addComponent(jLabel_Nev)
                                    .addComponent(jLabel_Jelszo_ism))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Jovahagy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(104, 104, 104)
                .addComponent(jButton_Vissza, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField, jPasswordField_2, jTextField_Name});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel_Jelszo, jLabel_Jelszo_ism, jLabel_Nev});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_Jovahagy, jButton_Vissza});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Nev))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Jelszo))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Jelszo_ism, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordField_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addComponent(jCheckBox_1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Jovahagy)
                    .addComponent(jButton_Vissza))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordField, jPasswordField_2, jTextField_Name});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel_Jelszo, jLabel_Jelszo_ism, jLabel_Nev});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisszaActionPerformed
        Login loginPage = new Login();
        loginPage.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_jButton_VisszaActionPerformed

    private void jButton_JovahagyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_JovahagyActionPerformed
        boolean validRegister = true;
        
        for (int i = 0; i < jTextField_Name.getText().length(); i++)
        {
            char ellenorzes = jTextField_Name.getText().charAt(i);
            
            if (ellenorzes == ' ')
            {
                validRegister = false;
                jLabel_Info.setText("Ne hagyjon space karaktert!");
            }
        }
        
        if (validRegister)
        {
            if (jTextField_Name.getText().equals("") || jPasswordField.getText().equals(""))
            {
                JOptionPane.showMessageDialog(
                    null, 
                    "Ne hagyjon üres mezőket!",
                    "Hiba",
                    JOptionPane.ERROR_MESSAGE);
                validRegister = false;
            }
            else if (!(jPasswordField.getText().equals(jPasswordField_2.getText())))
            {
                JOptionPane.showMessageDialog(
                    null, 
                    "Jelszó megerősítés nem megfelelő!",
                    "Hiba",
                    JOptionPane.ERROR_MESSAGE);
                validRegister = false;
            }
            else
            {
                String sql = "SELECT username FROM User WHERE username = '"+ jTextField_Name.getText() +"'";
                try
                {
                    conn = MySQLConn.ConnectDB();
                    Statement sta = conn.createStatement();
                    ResultSet rs = sta.executeQuery(sql);
                    
                    if (rs.next())
                    {
                        rs.getString("username");
                        JOptionPane.showMessageDialog(
                            null, 
                            "Ez a név már szerepel!",
                            "Hiba",
                            JOptionPane.ERROR_MESSAGE);
                        validRegister = false;
                    }
                    sta.close();
                    rs.close();
                    conn.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(
                    null, 
                    e,
                    "Hiba",
                    JOptionPane.ERROR_MESSAGE);
                }
            } 
        }
    
        if (validRegister)
        {
            try
            {
                conn = MySQLConn.ConnectDB();
                String sql = "INSERT INTO User (username, password) VALUES"
                        + "('" + jTextField_Name.getText() + "',"
                        + "'" + jPasswordField.getText() + ")";
                
                Statement sta = conn.createStatement();
                sta.executeUpdate(sql);
                
                JOptionPane.showMessageDialog(null, "Insert megtörtént!");
                
                sta.close();
                conn.close();
                this.dispose();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sikertelen felvétel!" + e,
                    "Hiba",
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButton_JovahagyActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) 
    {
            Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

            int w = this.getSize().width;
            int h = this.getSize().height;
            int x = (dim.width - w)/2;
            int y = (dim.height - h)/2;

            this.setLocation(x, y);
    }
    
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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Jovahagy;
    private javax.swing.JButton jButton_Vissza;
    private javax.swing.JCheckBox jCheckBox_1;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Jelszo;
    private javax.swing.JLabel jLabel_Jelszo_ism;
    private javax.swing.JLabel jLabel_Nev;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JPasswordField jPasswordField_2;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}

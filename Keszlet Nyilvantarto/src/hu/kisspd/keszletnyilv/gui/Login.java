package hu.kisspd.keszletnyilv.gui;
import hu.kisspd.keszletnyilv.MySQLConn;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;


public class Login extends javax.swing.JFrame {
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
static String Nev = null; //ki a felhasznéló, aki bejelentkezett
static String Jelsz = null;
static String F_id = null;

    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_felh = new javax.swing.JTextField();
        jPasswordField_pass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        jButton_enter = new javax.swing.JButton();
        register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Felhasznalonev:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Jelszó:");

        jTextField_felh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPasswordField_pass.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );

        jButton_enter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_enter.setText("Belépés");
        jButton_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_enterActionPerformed(evt);
            }
        });

        register.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        register.setText("Új felhasználó");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Még nem regisztrált?");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField_felh, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(register)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPasswordField_pass, jTextField_felh});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton_enter, register});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField_felh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jPasswordField_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jButton_enter)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(register)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel1, jLabel2});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPasswordField_pass, jTextField_felh});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_enterActionPerformed
        Boolean control = true;
        Boolean empty = true;
        conn = MySQLConn.ConnectDB();
        String sql = "SELECT * FROM Felh WHERE F_nev=? AND F_jelsz=?";
        try
        {
            pst = conn.prepareStatement(sql);
            pst.setString(1, jTextField_felh.getText());
            pst.setString(2, jPasswordField_pass.getText());
            rs = pst.executeQuery();
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null, "Üdvözlöm!");
                Nev = jTextField_felh.getText();
                Jelsz = jPasswordField_pass.getText();
                MainMenu f = new MainMenu();
                f.setVisible(true);
                setVisible(false);
                empty = false;
            }
            else if (empty = true && jTextField_felh.getText().equals("") || jPasswordField_pass.getText().equals("")) 
            {
               JOptionPane.showMessageDialog(
                    null, 
                    "Ne hagyjon üres mezőt!",
                    "Hiba", 
                    JOptionPane.ERROR_MESSAGE);
                control = false; 
            }
            else
            {
                JOptionPane.showMessageDialog(
                    null, 
                    "Hibás felhasználónév vagy jelszó! ",
                    "Hiba", 
                    JOptionPane.ERROR_MESSAGE);
                control = false;
            }
            pst.close();
            conn.close();    
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(
                    null, 
                    "Nem sikerült csatlakozni az adatbázishoz! " + e.getMessage(),
                    "Hiba", 
                    JOptionPane.ERROR_MESSAGE);
        }
        if (control)
        {
            try
            {
                conn = MySQLConn.ConnectDB();
                Statement sta = conn.createStatement();
                String sqlID = "Select Id from Felh where F_nev='"+ Nev +"' AND F_jelsz='"+ Jelsz +"'";
                ResultSet rs = sta.executeQuery(sqlID);
                if (rs.next())
                {
                    F_id = rs.getString("Id");
                }
                sta.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(
                    null, 
                    "Sikertelen!"+ e,
                    "Hiba", 
                    JOptionPane.ERROR_MESSAGE);
            } 
        }
    }//GEN-LAST:event_jButton_enterActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        Register r = new Register();
        r.setVisible(true);
        setVisible(false);       
    }//GEN-LAST:event_registerActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) 
{
        // Get the size of the screen
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width - w)/2;
        int y = (dim.height - h)/2;

        // Move the window
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_enter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField_pass;
    private javax.swing.JTextField jTextField_felh;
    private javax.swing.JButton register;
    // End of variables declaration//GEN-END:variables
}

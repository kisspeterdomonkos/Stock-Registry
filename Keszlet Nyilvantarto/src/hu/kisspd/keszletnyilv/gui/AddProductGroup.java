/*
 mivel a felhasználó dönti el, nem csak a termékcsoport nevét, de a kódját is. 
megj: nincs auto increment, vagyis ellenőrizni kell hosz szerepel-e már a kód
megkötéseink lesznek az elnevezésnél is, itt már a bevitelnél is szeretnénk ellenőrzést
eszközölni
 */
package hu.kisspd.keszletnyilv.gui;
import hu.kisspd.keszletnyilv.MySQLConn;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author steyza
 */
public class AddProductGroup extends javax.swing.JFrame {
static Integer Allapot=null;
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
String Nevellenorzes=null;
    /**
     * Creates new form Uj_Termekcsoport
     */
    public AddProductGroup() {
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

        jLabel_tcsk = new javax.swing.JLabel();
        jLabel_tcsn = new javax.swing.JLabel();
        jTextField_tcsk = new javax.swing.JTextField();
        jTextField_tcsn = new javax.swing.JTextField();
        jButton_Felv = new javax.swing.JButton();
        jButton_Vissza = new javax.swing.JButton();
        jLabel_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_tcsk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_tcsk.setText("Termékcsoport kód:");

        jLabel_tcsn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_tcsn.setText("Termékcsoport név:");

        jTextField_tcsk.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_tcsk.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_tcskKeyTyped(evt);
            }
        });

        jTextField_tcsn.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_tcsn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_tcsnKeyTyped(evt);
            }
        });

        jButton_Felv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Felv.setText("Felvétel");
        jButton_Felv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FelvActionPerformed(evt);
            }
        });

        jButton_Vissza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Vissza.setText("Vissza");
        jButton_Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisszaActionPerformed(evt);
            }
        });

        jLabel_info.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_info.setText("Info:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_tcsn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_tcsn))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_tcsk)
                        .addGap(47, 47, 47)
                        .addComponent(jTextField_tcsk, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jButton_Felv)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Vissza)
                .addGap(196, 196, 196))
            .addComponent(jLabel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_tcsk)
                    .addComponent(jTextField_tcsk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_tcsn)
                    .addComponent(jTextField_tcsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Felv)
                    .addComponent(jButton_Vissza))
                .addGap(53, 53, 53)
                .addComponent(jLabel_info, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_VisszaActionPerformed

    private void jButton_FelvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FelvActionPerformed
        jLabel_info.setText("");
        boolean ok=true;
        if (ok)
        {
            if (jTextField_tcsk.getText().equals("") || jTextField_tcsn.getText().equals(""))
            {
                jLabel_info.setText("Ne hagyjon üres mezőket!");
                ok=false;
            }
            else
            {
                conn=MySQLConn.ConnectDB();
                String sql="Select * from Termekcsoport where Tcs_kod='"+jTextField_tcsk.getText()+"'";
                try
                {
                    Statement sta=conn.createStatement();
                    rs=sta.executeQuery(sql);
                    if (rs.next())
                    {
                        Nevellenorzes=rs.getString("Tcs_kod");
                        jLabel_info.setText("Ez a kód már szerepel!");
                        ok=false;
                    }
                    rs.close();
                    sta.close();
                    conn.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                conn=MySQLConn.ConnectDB();
                sql="Select * from Termekcsoport where Tcs_nev='"+jTextField_tcsn.getText()+"'";
                try
                {
                    Statement sta=conn.createStatement();
                    rs=sta.executeQuery(sql);
                    if (rs.next())
                    {
                        Nevellenorzes=rs.getString("Tcs_nev");
                        jLabel_info.setText("Ez a termekcsoport már létezik!");
                        ok=false;
                    }
                    rs.close();
                    sta.close();
                    conn.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ok)
        {
            try
            {
                conn=MySQLConn.ConnectDB();
                String sql="INSERT INTO Termekcsoport (Tcs_kod, Tcs_nev) VALUES "
                        +"('"+jTextField_tcsk.getText()+"',"
                        +"'"+jTextField_tcsn.getText()+"')";
                Statement sta=conn.createStatement();
                sta.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Insert megtörtént!");
                rs.close();
                sta.close();
                conn.close();
                this.dispose();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_FelvActionPerformed

    private void jTextField_tcskKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tcskKeyTyped
        // ellenőrizni szeretném a beviteli mezőt
        char c = evt.getKeyChar();
        if (jTextField_tcsk.getText().equals("")) // van-e már valami a textmezőben
        {
            if (((c <'1') || (c > '9')) && (c !=KeyEvent.VK_BACK_SPACE)) //nincs még benne
            {
                evt.consume(); // ha nem szám, akkor ignorálunk , 0-val nem kezdődhet kód
            }
        }
        else // itt van-e benne már valami
        {
            if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume(); // ha nem szám, akkor ignoráljuk
            }
        }
    }//GEN-LAST:event_jTextField_tcskKeyTyped

    private void jTextField_tcsnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_tcsnKeyTyped
        char c= evt.getKeyChar();
        if ((c == ' ') && (c != KeyEvent.VK_BACK_SPACE))
        {
            evt.consume(); // ha space, akkor ignorálunk
        }
    }//GEN-LAST:event_jTextField_tcsnKeyTyped

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
            java.util.logging.Logger.getLogger(AddProductGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProductGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProductGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProductGroup.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddProductGroup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Felv;
    private javax.swing.JButton jButton_Vissza;
    private javax.swing.JLabel jLabel_info;
    private javax.swing.JLabel jLabel_tcsk;
    private javax.swing.JLabel jLabel_tcsn;
    private javax.swing.JTextField jTextField_tcsk;
    private javax.swing.JTextField jTextField_tcsn;
    // End of variables declaration//GEN-END:variables
}

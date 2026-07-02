package hu.kisspd.keszletnyilv.gui;

import hu.kisspd.keszletnyilv.MySQLConn;
import java.awt.event.KeyEvent;
import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Kimutatas extends javax.swing.JFrame {
    Connection conn = null;
    
    public Kimutatas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_Total = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Exchange = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton_Atvalt = new javax.swing.JButton();
        jTextField_EURO = new javax.swing.JTextField();
        jButton_Vissza = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Kimutat = new javax.swing.JTable();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Összeladás:");

        jTextField_Total.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Ft");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Árfolyam:");

        jTextField_Exchange.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField_Exchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_ExchangeActionPerformed(evt);
            }
        });
        jTextField_Exchange.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ExchangeKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("EURO");

        jButton_Atvalt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Atvalt.setText("ÁTVÁLT");
        jButton_Atvalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AtvaltActionPerformed(evt);
            }
        });

        jTextField_EURO.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jButton_Vissza.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_Vissza.setText("Vissza");
        jButton_Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisszaActionPerformed(evt);
            }
        });

        jTable_Kimutat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable_Kimutat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tcs_nev", "Osszeladas"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable_Kimutat);
        if (jTable_Kimutat.getColumnModel().getColumnCount() > 0) {
            jTable_Kimutat.getColumnModel().getColumn(0).setResizable(false);
            jTable_Kimutat.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField_Total, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton_Atvalt))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField_Exchange, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField_EURO, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(116, 116, 116))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton_Vissza)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jTextField_Total)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField_Exchange))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Atvalt)
                    .addComponent(jLabel5)
                    .addComponent(jTextField_EURO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192)
                .addComponent(jButton_Vissza)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_ExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_ExchangeActionPerformed
        
    }//GEN-LAST:event_jTextField_ExchangeActionPerformed

    private void jButton_AtvaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AtvaltActionPerformed
        if (jTextField_Exchange.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "Átváltási értéket adja meg! ");
        }
        else
        {
            double result = Double.parseDouble(jTextField_Total.getText()) / Double.parseDouble(jTextField_Exchange.getText());
            DecimalFormat dc = new DecimalFormat("0.00");
            String formattedText = dc.format(result);
            jTextField_EURO.setText(formattedText);
        }
    }//GEN-LAST:event_jButton_AtvaltActionPerformed

    private void jTextField_ExchangeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ExchangeKeyTyped
        char c = evt.getKeyChar();
        if (jTextField_Exchange.getText().equals(""))
        {
            if (((c < '1') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextField_ExchangeKeyTyped

    private void jButton_VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_VisszaActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        DefaultTableModel model =(DefaultTableModel)jTable_Kimutat.getModel();
        
        for (int i = model.getRowCount() -1; i >= 0; i--)
        {
            model.removeRow(i);
        }
        
        conn = MySQLConn.ConnectDB();
        //TODO: replace old sqlQuery
        String sql = "SELECT SUM(Forgalom.F_Mennyiseg*Termek.T_ar) as ertek FROM Forgalom "
                +"INNER JOIN Termek "
                +"ON Forgalom.T_cikkszam=Termek.T_cikkszam ";
        try
        {
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            
            if (rs.next())
            {
                jTextField_Total.setText(rs.getString("ertek"));
                
            }
            
            rs.close();
            sta.close();
            conn.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        try
        {
            conn = MySQLConn.ConnectDB();
            //TODO: replace old sqlQuery
            String sqlterm = "Select Termekcsoport.Tcs_nev, SUM(Forgalom.F_Mennyiseg*Termek.T_ar) as ertek From Forgalom  "
                    +"INNER JOIN Termek ON Forgalom.T_cikkszam=Termek.T_cikkszam "
                    +"INNER JOIN Termekcsoport ON Termekcsoport.Tcs_kod=Termek.Tcs_kod "
                    +"GROUP BY Termekcsoport.Tcs_nev ";
            
            Statement sta = conn.createStatement();
            ResultSet rs = sta.executeQuery(sqlterm);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getString("Termekcsoport.Tcs_nev"),rs.getDouble("ertek")});
            }
            
            rs.close();
            sta.close();
            conn.close();
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! " +e);
        }
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(Kimutatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kimutatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kimutatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kimutatas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kimutatas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Atvalt;
    private javax.swing.JButton jButton_Vissza;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Kimutat;
    private javax.swing.JTextField jTextField_EURO;
    private javax.swing.JTextField jTextField_Exchange;
    private javax.swing.JTextField jTextField_Total;
    // End of variables declaration//GEN-END:variables
}

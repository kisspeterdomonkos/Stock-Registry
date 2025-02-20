/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.kisspd.keszletnyilv.gui;
import hu.kisspd.keszletnyilv.MySQLConn;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.io.PrintWriter;
/**
 *
 * @author steyza
 */
public class Sale extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
static String cikkszam=null;
static String termeknev=null;
static String keszlet=null;
static Integer szlasz=null;
static String Ar=null;
static Integer Fizetendo=null;
static Integer Osszeg = null;

    /**
     * Creates new form Eladas
     */
    public Sale() {
        initComponents();
        jTable_Termek.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        jTable_Termek.setFont(new Font("Arial", Font.ITALIC, 18));
        jTable_Szamla.getTableHeader().setFont(new Font("Arial", Font.BOLD, 18));
        jTable_Szamla.setFont(new Font("Arial", Font.ITALIC, 18));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Termekfelirat = new javax.swing.JLabel();
        jLabel_Mennyisegfelirat = new javax.swing.JLabel();
        jTextField_Termek = new javax.swing.JTextField();
        jTextField_Mennyiseg = new javax.swing.JTextField();
        jButton_Nyugta = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Termek = new javax.swing.JTable();
        jLabel_Szamla = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Szamla = new javax.swing.JTable();
        jButton_Fizetes = new javax.swing.JButton();
        jLabel_Fizetendo = new javax.swing.JLabel();
        jTextField_Osszeg = new javax.swing.JTextField();
        jLabel_Ft = new javax.swing.JLabel();
        jButton_Vissza = new javax.swing.JButton();
        jCheckBox_Nyugta = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel_Termekfelirat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Termekfelirat.setText("Termék:");
        jLabel_Termekfelirat.setToolTipText("");

        jLabel_Mennyisegfelirat.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Mennyisegfelirat.setText("Mennyiség:");

        jTextField_Termek.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Termek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField_TermekMouseClicked(evt);
            }
        });
        jTextField_Termek.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField_TermekKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_TermekKeyReleased(evt);
            }
        });

        jTextField_Mennyiseg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Mennyiseg.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_MennyisegKeyTyped(evt);
            }
        });

        jButton_Nyugta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Nyugta.setText("Nyugta");
        jButton_Nyugta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_NyugtaActionPerformed(evt);
            }
        });

        jTable_Termek.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable_Termek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "T_cikkszam", "T_nev", "Keszlet", "T_ar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_Termek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_TermekMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Termek);
        if (jTable_Termek.getColumnModel().getColumnCount() > 0) {
            jTable_Termek.getColumnModel().getColumn(0).setResizable(false);
            jTable_Termek.getColumnModel().getColumn(1).setResizable(false);
            jTable_Termek.getColumnModel().getColumn(2).setResizable(false);
            jTable_Termek.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel_Szamla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Szamla.setText("Számla:");

        jTable_Szamla.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTable_Szamla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "szlaszam", "cikkszam", "termek", "mennyiseg", "egysegar", "azon", "fizetendo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable_Szamla);
        if (jTable_Szamla.getColumnModel().getColumnCount() > 0) {
            jTable_Szamla.getColumnModel().getColumn(0).setResizable(false);
            jTable_Szamla.getColumnModel().getColumn(1).setResizable(false);
            jTable_Szamla.getColumnModel().getColumn(2).setResizable(false);
            jTable_Szamla.getColumnModel().getColumn(3).setResizable(false);
            jTable_Szamla.getColumnModel().getColumn(4).setResizable(false);
            jTable_Szamla.getColumnModel().getColumn(5).setResizable(false);
            jTable_Szamla.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton_Fizetes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Fizetes.setText("Fizetés");
        jButton_Fizetes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FizetesActionPerformed(evt);
            }
        });

        jLabel_Fizetendo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Fizetendo.setText("Fizetendő:");

        jTextField_Osszeg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabel_Ft.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Ft.setText("Ft");

        jButton_Vissza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Vissza.setText("Vissza");
        jButton_Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisszaActionPerformed(evt);
            }
        });

        jCheckBox_Nyugta.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox_Nyugta.setText("Nyugta megnyitása");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Termekfelirat)
                                    .addComponent(jLabel_Mennyisegfelirat))
                                .addGap(143, 143, 143)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Termek)
                                    .addComponent(jTextField_Mennyiseg, javax.swing.GroupLayout.DEFAULT_SIZE, 383, Short.MAX_VALUE))
                                .addGap(73, 73, 73)
                                .addComponent(jButton_Nyugta))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 721, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Szamla, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(708, 708, 708))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 874, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBox_Nyugta, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Fizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jButton_Vissza, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                            .addComponent(jTextField_Osszeg, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel_Ft)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                                .addComponent(jButton_Fizetes, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Termek)
                            .addComponent(jLabel_Termekfelirat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton_Nyugta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel_Mennyisegfelirat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Mennyiseg))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Szamla, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton_Fizetes, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Fizetendo, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Ft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Osszeg, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                    .addComponent(jCheckBox_Nyugta))
                .addGap(44, 44, 44)
                .addComponent(jButton_Vissza)
                .addContainerGap(118, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_VisszaActionPerformed

    private void eladfresh()
    {
        DefaultTableModel dm = (DefaultTableModel) jTable_Szamla.getModel();
        while (dm.getRowCount()>0)
        {
            dm.removeRow(0);
        }
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tblfresh();
        jTextField_Osszeg.setText("0");
        jButton_Nyugta.setEnabled(false);
        // eladfresh();
    }//GEN-LAST:event_formWindowOpened

    private void jTextField_TermekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField_TermekMouseClicked
        jTextField_Termek.setText("");
        jTextField_Mennyiseg.setText("");
        jButton_Nyugta.setEnabled(false);
    }//GEN-LAST:event_jTextField_TermekMouseClicked

    private void jTextField_MennyisegKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_MennyisegKeyTyped
        char c= evt.getKeyChar();
        if (jTextField_Mennyiseg.getText().equals(""))
        {
            if (((c <'1') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c <'0') || (c>'9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextField_MennyisegKeyTyped

    private void jTextField_TermekKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TermekKeyPressed
        tblkeres();
    }//GEN-LAST:event_jTextField_TermekKeyPressed

    private void jTextField_TermekKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TermekKeyReleased
        tblkeres();
    }//GEN-LAST:event_jTextField_TermekKeyReleased

    private void jTable_TermekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_TermekMouseClicked
        int sor=jTable_Termek.getSelectedRow();
        cikkszam=jTable_Termek.getModel().getValueAt(sor, 0).toString();
        termeknev=jTable_Termek.getModel().getValueAt(sor, 1).toString();
        keszlet=jTable_Termek.getModel().getValueAt(sor, 2).toString();
        Ar=jTable_Termek.getModel().getValueAt(sor, 3).toString();
        
        jTextField_Termek.setText(termeknev);
        jButton_Nyugta.setEnabled(true);
    }//GEN-LAST:event_jTable_TermekMouseClicked

    private void jButton_NyugtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_NyugtaActionPerformed
        conn=MySQLConn.ConnectDB();
        String sqlszla="Select MAX(szamlaszam) as szlasz from Forgalom"; // el kell készíteni a forgalom táblát.
        try
        {
            Statement sta=conn.createStatement();
            ResultSet rs=sta.executeQuery(sqlszla);
            rs.next();
            szlasz=rs.getInt("szlasz")+1;
            if (szlasz.equals(0))
            {
                szlasz=1; // ha még nincs száűmlánk
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        // mennyiség nem üres-e?
        if (!jTextField_Mennyiseg.getText().equals(""))
        {
            DefaultTableModel dm= (DefaultTableModel)jTable_Szamla.getModel();
            Integer i =0;
            Fizetendo=0;
            Integer ujertek=0;
            boolean ok=true;
            if ((dm.getRowCount()>0))
            {
                while (ok && i<dm.getRowCount())
                {
                    if (dm.getValueAt(i, 2).equals(termeknev))
                    {
                        ujertek=Integer.parseInt(jTable_Szamla.getModel().getValueAt(i, 3).toString())+Integer.parseInt(jTextField_Mennyiseg.getText());
                        Fizetendo=Integer.parseInt(Ar)*ujertek;
                        ok=false;
                    }
                    if (ok)
                    {
                        i++;
                    }
                }
                if (i>=dm.getRowCount())
                {
                    Fizetendo=Integer.parseInt(Ar)*Integer.parseInt(jTextField_Mennyiseg.getText());
                    dm.addRow(new Object[]{szlasz,cikkszam,termeknev,jTextField_Mennyiseg.getText(),Ar,Login.F_id,Fizetendo});
                    
                }
                else
                {
                    dm.setValueAt(ujertek, i, 3);
                    dm.setValueAt(Fizetendo, i, 6);
                }
            }
            else
            {
                ujertek=ujertek+Integer.parseInt(jTextField_Mennyiseg.getText());
                Fizetendo=Integer.parseInt(Ar)*ujertek;
                //JOptionPane.showMessageDialog(null, szlasz+ " "+ cikkszam+ " "+ termeknev + jTextField_Mennyiseg.getText() + " "+ Ar + " " + Into.F_id+" "+ Fizetendo);
                dm.addRow(new Object[]{szlasz,cikkszam,termeknev,jTextField_Mennyiseg.getText(),Ar,Login.F_id,Fizetendo});
            }
            // ezt kérem!!!
            jTextField_Termek.setText("");
            jTextField_Mennyiseg.setText("");
            jButton_Nyugta.setEnabled(false);
            tblfresh();
        }
        else
        {
            JOptionPane.showMessageDialog((null), "Nem lehet a mennyiség üres!");
        }
        DefaultTableModel dm= (DefaultTableModel)jTable_Szamla.getModel();
        int sorokszama=dm.getRowCount();
        Osszeg=0;
        for (int i=sorokszama-1; i >=0; i--)
        {
            Osszeg=Osszeg+Integer.parseInt(jTable_Szamla.getModel().getValueAt(i, 6).toString());
        }
        jTextField_Osszeg.setText(Integer.toString(Osszeg));
    }//GEN-LAST:event_jButton_NyugtaActionPerformed

    private void jButton_FizetesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FizetesActionPerformed
        int akt_termek_keszlet=0;
        int eladott_termek_keszlet=0;
        try
        {
            JOptionPane.showMessageDialog(null, jTable_Szamla.getRowCount());
            for (int i=0; i < jTable_Szamla.getRowCount(); i++)
            {
                conn=MySQLConn.ConnectDB();
                String sqlin="INSERT INTO Forgalom (szamlaszam, T_cikkszam, F_Mennyiseg, Id) VALUES "
                        +"("+szlasz+","
                        +jTable_Szamla.getValueAt(i, 1)+","
                        +jTable_Szamla.getValueAt(i, 3)+","
                        +jTable_Szamla.getValueAt(i, 5)+")";
                Statement st=conn.createStatement();
                st.executeUpdate(sqlin);
                st.close();
                conn.close();
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Sikertelen felvétel! "+e);
        }
        try
        {
            for (int i=0; i<jTable_Szamla.getRowCount(); i++)
            {
                conn=MySQLConn.ConnectDB();
                String sqlmi="Select Keszlet from Termek where T_cikkszam="
                        +jTable_Szamla.getValueAt(i, 1);
                Statement stmi=conn.createStatement();
                ResultSet rsmi=stmi.executeQuery(sqlmi);
                rsmi.next();
                akt_termek_keszlet=rsmi.getInt("Keszlet");
                eladott_termek_keszlet=Integer.parseInt(jTable_Szamla.getModel().getValueAt(i, 3).toString());
                rsmi.close();
                stmi.close();
                conn.close();
                
                try
                {
                    conn=MySQLConn.ConnectDB();
                    String sqlup="UPDATE Termek Set Termek.Keszlet="+(akt_termek_keszlet-eladott_termek_keszlet)+""
                            + " Where Termek.T_cikkszam="+jTable_Szamla.getValueAt(i, 1);
                    Statement stup=conn.createStatement();
                    stup.executeUpdate(sqlup);
                    stup.close();
                    conn.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, "Sikertelen Frissítés! " + e);
                }
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Sikertelen lekérdezés! "+e);
        }
        
        String s="C://Users/steyza.VEREBELY/Documents/NetBeansProjects/Enter/src/Enter/Enter/Nyugta/"+Integer.toString(szlasz)+".txt";
        try
        {
            System.setProperty("file.encoding", "UTF8");
            PrintWriter pw=new PrintWriter(s);
            pw.println("Számlaszám: "+ jTable_Szamla.getModel().getValueAt(0,0).toString());
            pw.println("Cikkszam \t\tTermek \t\tMennyiseg \t\tEgysegar \t\tFizetendő");
            String kiir="";
            DefaultTableModel dm= (DefaultTableModel)jTable_Szamla.getModel();
            for (int i=0; i< jTable_Szamla.getRowCount(); i++)
            {
                kiir=jTable_Szamla.getModel().getValueAt(i,1).toString()+" \t\t"+jTable_Szamla.getModel().getValueAt(i, 2).toString()+" \t\t"+jTable_Szamla.getModel().getValueAt(i,3).toString()+" \t\t"+jTable_Szamla.getModel().getValueAt(i,4).toString()+" \t\t"+jTable_Szamla.getModel().getValueAt(i,6).toString();
                pw.println(kiir);
            }
            pw.println("Összesen: "+jTextField_Osszeg.getText());
            pw.close();
        }
        catch(Exception hiba)
        {
            JOptionPane.showMessageDialog(null, "Sikertelen lekérdezés! " + hiba);
        }
        if (jCheckBox_Nyugta.isSelected()==true)
        {
            try
            {
                ProcessBuilder job = new ProcessBuilder("notepad.exe",s);
                job.start();
            }
            catch(Exception hiba)
            {
                JOptionPane.showMessageDialog(null, "Sikertelen megnyitás! " + hiba);
            }
        }
        tblfresh();
        jTextField_Osszeg.setText("0");
        DefaultTableModel dm= (DefaultTableModel)jTable_Szamla.getModel();
        int sorokszama=dm.getRowCount();
        for(int i = sorokszama-1; i >=0; i--)
        {
            dm.removeRow(i);
        }
    }//GEN-LAST:event_jButton_FizetesActionPerformed

    /**
     * @param args the command line arguments
     */
    
    private void tblkeres()
    {
        DefaultTableModel model=(DefaultTableModel)jTable_Termek.getModel();
        int sorokszama=model.getRowCount();
        for (int i =sorokszama-1; i>=0; i--) // kitöröljük azt, ami benne van a táblában
        {
            model.removeRow(i);
        }
        try
        {
            conn=MySQLConn.ConnectDB();
            String sql="Select T_cikkszam, T_nev, Termek.Tcs_kod, Keszlet, T_ar "
                    + "FROM Termek WHERE T_nev LIKE '"+jTextField_Termek.getText()+"%'";
            Statement sta=conn.createStatement();
            ResultSet rs=sta.executeQuery(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getInt("T_cikkszam"), rs.getString("T_nev"),rs.getInt("Keszlet"),rs.getInt("T_ar")});
            }
            sta.close();
            conn.close();
            
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! "+ e);
        }
    }
    private void tblfresh()
    {
        DefaultTableModel model=(DefaultTableModel)jTable_Termek.getModel();
        int sorokszama=model.getRowCount();
        for (int i =sorokszama-1; i>=0; i--)
        {
            model.removeRow(i);
        }
        try
        {
            conn=MySQLConn.ConnectDB();
            String sql="Select T_cikkszam, T_nev, Termek.Tcs_kod, Keszlet, T_ar "
                    +"FROM Termek ";
            Statement sta=conn.createStatement();
            ResultSet rs=sta.executeQuery(sql);
            
            while(rs.next())
            {
                model.addRow(new Object[]{rs.getInt("T_cikkszam"),rs.getString("T_nev"),rs.getInt("Keszlet"),rs.getInt("T_ar")});
            }
            sta.close();
            conn.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! " +e);
        }
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
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sale.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sale().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Fizetes;
    private javax.swing.JButton jButton_Nyugta;
    private javax.swing.JButton jButton_Vissza;
    private javax.swing.JCheckBox jCheckBox_Nyugta;
    private javax.swing.JLabel jLabel_Fizetendo;
    private javax.swing.JLabel jLabel_Ft;
    private javax.swing.JLabel jLabel_Mennyisegfelirat;
    private javax.swing.JLabel jLabel_Szamla;
    private javax.swing.JLabel jLabel_Termekfelirat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_Szamla;
    private javax.swing.JTable jTable_Termek;
    private javax.swing.JTextField jTextField_Mennyiseg;
    private javax.swing.JTextField jTextField_Osszeg;
    private javax.swing.JTextField jTextField_Termek;
    // End of variables declaration//GEN-END:variables
}

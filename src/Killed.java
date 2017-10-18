import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.*;

public class Killed extends javax.swing.JFrame {
DefaultTableModel model;
    public Killed() {
        initComponents();
        model= (DefaultTableModel) tbl.getModel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cmb = new javax.swing.JComboBox<>();
        jt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jid = new javax.swing.JTextField();
        jbody = new javax.swing.JTextField();
        jdate = new javax.swing.JTextField();
        ji = new javax.swing.JButton();
        jd = new javax.swing.JButton();
        ju = new javax.swing.JButton();
        jc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jB.setText("Search");
        jB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActionPerformed(evt);
            }
        });

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Date_of_Recovery", "Body_Condition"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cmb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id", "Date_of _Recovery", "Body_Condition", " " }));

        jt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtKeyReleased(evt);
            }
        });

        jLabel1.setText("Id");

        jLabel2.setText("Date of Recovery");

        jLabel3.setText("Body Status");

        jbody.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbodyActionPerformed(evt);
            }
        });

        ji.setText("Insert");
        ji.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jiActionPerformed(evt);
            }
        });

        jd.setText("Delete");
        jd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jdActionPerformed(evt);
            }
        });

        ju.setText("Update");
        ju.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                juActionPerformed(evt);
            }
        });

        jc.setText("Clear");
        jc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcActionPerformed(evt);
            }
        });

        jButton2.setText("Synchronise");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jbody, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(140, 140, 140)
                                .addComponent(jc)
                                .addGap(68, 68, 68)
                                .addComponent(jButton1)))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2)
                            .addComponent(jd)
                            .addComponent(ju)
                            .addComponent(ji))))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB)
                    .addComponent(cmb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ji))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ju))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jd)
                        .addGap(211, 211, 211))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jc)
                            .addComponent(jButton1)
                            .addComponent(jButton2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActionPerformed
     try {
            Class.forName("com.mysql.jdbc.Driver");
        
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin_login","root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from killed_list");
    while(rs.next()){
   model.insertRow(model.getRowCount(), new Object[]{rs.getString("Id"),rs.getString("Date_of_Recovery"),rs.getString("Body_Condition")});
      
    }
} catch (Exception ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_jBActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      First rgf = new First();
        rgf.setVisible(true);
        rgf.pack();
        rgf.setLocationRelativeTo(null);
        rgf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbodyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbodyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbodyActionPerformed

    private void jdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jdActionPerformed
try{
              Class.forName("com.mysql.jdbc.Driver");        
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin_login","root", "root");
         String sql ="delete from killed_list  where id =?";
               
         PreparedStatement pst=con.prepareStatement(sql);
         
        pst.setString(1, jid.getText());
         
         pst.executeUpdate();
         JOptionPane.showMessageDialog(this,"Deleted Successfully");
          }
         catch(Exception ex){
         JOptionPane.showMessageDialog(this,ex.getMessage());
                 }    }//GEN-LAST:event_jdActionPerformed

    private void juActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_juActionPerformed
try{
         Class.forName("com.mysql.jdbc.Driver");        
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin_login","root", "root");
         String sql ="update killed_list set date_of_recovery=?,body_condition=? where id =?";
               
         PreparedStatement pst=con.prepareStatement(sql);
         
         pst.setString(1, jdate.getText());
         pst.setString(2, jbody.getText());
         pst.setString(3, jid.getText());
         
         pst.executeUpdate();
         JOptionPane.showMessageDialog(this,"Updated Successfully");
          }
         catch(Exception ex){
         JOptionPane.showMessageDialog(this,ex.getMessage());
                 }    }//GEN-LAST:event_juActionPerformed

    private void jtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtKeyReleased
        try{
         String selection=(String)cmb.getSelectedItem();
         Class.forName("com.mysql.jdbc.Driver");        
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin_login","root", "root");
         String query="select * from killed_list where "+selection+" = ? ";
         PreparedStatement pst=con.prepareStatement(query);
         pst.setString(1,jt.getText());
         ResultSet rs=pst.executeQuery();
        tbl.setModel(DbUtils.resultSetToTableModel(rs));
//     while(rs.next())
//             {
//             
//             }
             pst.close();
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
    }//GEN-LAST:event_jtKeyReleased

    private void jiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jiActionPerformed
try{
              Class.forName("com.mysql.jdbc.Driver");        
         Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin_login","root", "root");
         String sql ="insert into killed_list"
                 +"(id,Date_of_Recovery,Body_condition)"
                 +"values(?,?,?)";
         PreparedStatement pst=con.prepareStatement(sql);
         pst.setString(1, jid.getText());
         pst.setString(2, jdate.getText());
         pst.setString(3, jbody.getText());
         
         
         
         
         pst.executeUpdate();
         JOptionPane.showMessageDialog(this,"Inserted Successfully");
          }
         catch(Exception ex){
         JOptionPane.showMessageDialog(this,ex.getMessage());
                 }    }//GEN-LAST:event_jiActionPerformed

    private void jcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcActionPerformed
         
    while(model.getRowCount()>0)
        {
            
            for (int i = 0; i < model.getRowCount(); i++) {
                model.removeRow(i);
            }
        }    }//GEN-LAST:event_jcActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
          Class.forName("com.mysql.jdbc.Driver");
        
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/admin_login","root", "root");
    while(model.getRowCount()>0)
        {
            
            for (int i = 0; i < model.getRowCount(); i++) {
              String k= model.getValueAt(i,0).toString();

                String sql ="delete from kidnapped_list  where id = ?";
               
        PreparedStatement pst=con.prepareStatement(sql);  
        
          pst.setString(1, k);
      
         pst.executeUpdate();
         
                
    }con.close();
            
            }
        }
        
        catch(Exception ex){
         JOptionPane.showMessageDialog(this,"Synchronisation Successful");
        }
       
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Killed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Killed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Killed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Killed.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Killed().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JButton jB;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jbody;
    private javax.swing.JButton jc;
    private javax.swing.JButton jd;
    private javax.swing.JTextField jdate;
    private javax.swing.JButton ji;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jt;
    private javax.swing.JButton ju;
    private javax.swing.JTable tbl;
    // End of variables declaration//GEN-END:variables
}
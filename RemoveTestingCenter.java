/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdtemp;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author harig
 */
public class RemoveTestingCenter extends javax.swing.JFrame {

    /**
     * Creates new form GovtOrders
     */
    public RemoveTestingCenter() {
        initComponents();
        this.setLocationRelativeTo(null);
        fetch();
        
        
    }
     private void fetch() {
        try {
            
            con = new Connector().getCon();
            stmt=con.prepareStatement("SELECT dist_name FROM asdproject.districts;");
            ResultSet rs=stmt.executeQuery();
            int size =0;
            if (rs != null) 
            {
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
            }
            rs.first();
            distnames=new String[size];
            int i=0;
            do{
            distnames[i++]=rs.getString(1);
            }while(rs.next());
             cb_district.setModel(new javax.swing.DefaultComboBoxModel<>(distnames));
        
             
        }    
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_district = new javax.swing.JComboBox<>();
        b_removehotspot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_testingcenter = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tf_removeid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_testcentername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 49, 49));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Remove Testing Center");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/images.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel21)
                .addGap(633, 633, 633))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel3.setText("Select District");

        cb_district.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cb_district.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_districtActionPerformed(evt);
            }
        });

        b_removehotspot.setBackground(new java.awt.Color(0, 102, 0));
        b_removehotspot.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_removehotspot.setForeground(new java.awt.Color(255, 255, 255));
        b_removehotspot.setText("Remove from Testing Centers");
        b_removehotspot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_removehotspot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_removehotspotMouseClicked(evt);
            }
        });
        b_removehotspot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_removehotspotActionPerformed(evt);
            }
        });

        t_testingcenter.setBackground(new java.awt.Color(204, 255, 255));
        t_testingcenter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        t_testingcenter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_testingcenterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_testingcenter);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setText("Selected Testing Center ID");

        tf_removeid.setEditable(false);
        tf_removeid.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        tf_removeid.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tf_removeidInputMethodTextChanged(evt);
            }
        });
        tf_removeid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_removeidActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel7.setText("Selected Testing Center Name ");

        tf_testcentername.setEditable(false);
        tf_testcentername.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 677, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(cb_district, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(145, 145, 145)
                                .addComponent(b_removehotspot))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_testcentername, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                                    .addComponent(tf_removeid))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_district, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_removeid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_testcentername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(b_removehotspot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void b_removehotspotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_removehotspotMouseClicked
//       
    }//GEN-LAST:event_b_removehotspotMouseClicked

    private void tf_removeidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_removeidActionPerformed
        int tcid = Integer.parseInt(tf_removeid.getText());
        tf_testcentername.setEnabled(true);
        try
        {
          Connection con = new Connector().getCon();  
          PreparedStatement stmt1=con.prepareStatement("Select tc_name FROM asdproject.testing_centers WHERE tc_id=?;");
          stmt1.setInt(1,tcid);
          ResultSet rs1 = stmt1.executeQuery();
          if(rs1.next())
          {
              tf_testcentername.setText(rs1.getString("tc_name"));
              //System.out.println("Success");
          }
        }
       catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } 
    }//GEN-LAST:event_tf_removeidActionPerformed

    private void tf_removeidInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tf_removeidInputMethodTextChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_removeidInputMethodTextChanged

    private void cb_districtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_districtActionPerformed
        // TODO add your handling code here:
         int district= cb_district.getSelectedIndex()+1;
        try
        {
        Connection con = new Connector().getCon();
       PreparedStatement stmt=con.prepareStatement("SELECT tc_id, tc_name,tc_address FROM asdproject.testing_centers WHERE tc_district_id=?;");
       
            stmt.setInt(1,district);
            ResultSet rs=stmt.executeQuery();
            t_testingcenter.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } 
                                             

        
    }//GEN-LAST:event_cb_districtActionPerformed

    private void b_removehotspotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_removehotspotActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) t_testingcenter.getModel();       
        int RowIndex = t_testingcenter.getSelectedRow();
        String id = t_testingcenter.getModel().getValueAt(RowIndex, 0).toString();
        try
        {
        Connection con = new Connector().getCon();
        PreparedStatement stmt=con.prepareStatement("DELETE FROM asdproject.testing_centers WHERE tc_id=?;");
            stmt.setString(1,id);
            int  rs=stmt.executeUpdate();
            //System.out.println(rs);
            if(rs != 0 )
            {
              JOptionPane.showMessageDialog(null,"Testing Center Removed Successfully");
              model.removeRow(RowIndex);
              tf_removeid.setText("");
              tf_testcentername.setText("");
            }
            else
                JOptionPane.showMessageDialog(null,"Testing Center not Removed");
                
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } 
        
    }//GEN-LAST:event_b_removehotspotActionPerformed

    private void t_testingcenterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_testingcenterMouseClicked
        // TODO add your handling code here:
        int row = t_testingcenter.getSelectedRow();
        TableModel model = t_testingcenter.getModel();
        
        tf_removeid.setText(model.getValueAt(row,0).toString());
        tf_testcentername.setText(model.getValueAt(row,1).toString());
        
    }//GEN-LAST:event_t_testingcenterMouseClicked

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
            java.util.logging.Logger.getLogger(RemoveTestingCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveTestingCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveTestingCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveTestingCenter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveTestingCenter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_removehotspot;
    private javax.swing.JComboBox<String> cb_district;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable t_testingcenter;
    private javax.swing.JTextField tf_removeid;
    private javax.swing.JTextField tf_testcentername;
    // End of variables declaration//GEN-END:variables
    Connection con;
    PreparedStatement stmt;
    String distnames[];
}


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
public class RemoveHotspots extends javax.swing.JFrame {

    /**
     * Creates new form GovtOrders
     */
    public RemoveHotspots() {
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
             cb_rhdistrict.setModel(new javax.swing.DefaultComboBoxModel<>(distnames));
             
            stmt=con.prepareStatement("SELECT type FROM asdproject.localbodytype;");
             rs=stmt.executeQuery();
             size =0;
            if (rs != null) 
            {
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
            }
            rs.first();
            lb_types=new String[size];
             i=0;
            do{
            lb_types[i++]=rs.getString(1);
            }while(rs.next());
             cb_rhlocalbodytype.setModel(new javax.swing.DefaultComboBoxModel<>(lb_types));
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

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cb_rhlocalbodytype = new javax.swing.JComboBox<>();
        cb_rhdistrict = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cb_rhlocalbody = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        b_removehotspot = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_removehotspot = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        tf_removehotspotid = new javax.swing.JTextField();
        b_viewhotspot = new javax.swing.JButton();
        l_search_result = new javax.swing.JLabel();
        l_select_info = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 49, 49));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Remove Hotspots");

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
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        cb_rhlocalbodytype.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cb_rhlocalbodytype.setEnabled(false);
        cb_rhlocalbodytype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_rhlocalbodytypeActionPerformed(evt);
            }
        });

        cb_rhdistrict.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cb_rhdistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_rhdistrictActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel4.setText("Local Body Type");

        cb_rhlocalbody.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        cb_rhlocalbody.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel5.setText("Select Local Body");

        b_removehotspot.setBackground(new java.awt.Color(0, 102, 0));
        b_removehotspot.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_removehotspot.setForeground(new java.awt.Color(255, 255, 255));
        b_removehotspot.setText("Remove from Hotspot List");
        b_removehotspot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_removehotspot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_removehotspotMouseClicked(evt);
            }
        });

        t_removehotspot.setBackground(new java.awt.Color(204, 255, 255));
        t_removehotspot.setModel(new javax.swing.table.DefaultTableModel(
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
        t_removehotspot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_removehotspotMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_removehotspot);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setText("Selected Hotspot");

        tf_removehotspotid.setEditable(false);
        tf_removehotspotid.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        b_viewhotspot.setBackground(new java.awt.Color(51, 51, 255));
        b_viewhotspot.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_viewhotspot.setForeground(new java.awt.Color(255, 255, 255));
        b_viewhotspot.setText("View All Hotspots");
        b_viewhotspot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_viewhotspot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_viewhotspotMouseClicked(evt);
            }
        });
        b_viewhotspot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_viewhotspotActionPerformed(evt);
            }
        });

        l_search_result.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_search_result.setText("Search Result");

        l_select_info.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_select_info.setText("Select row of Hotspot to be removed");
        l_select_info.setEnabled(false);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_rhdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cb_rhlocalbodytype, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54)
                                .addComponent(cb_rhlocalbody, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_search_result, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_select_info)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(b_viewhotspot, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(b_removehotspot, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel6)
                        .addGap(40, 40, 40)
                        .addComponent(tf_removehotspotid, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_rhdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_rhlocalbodytype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_rhlocalbody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(30, 30, 30)
                .addComponent(b_viewhotspot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(l_search_result, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(l_select_info)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tf_removehotspotid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(36, 36, 36)
                .addComponent(b_removehotspot, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void cb_rhdistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_rhdistrictActionPerformed
        // TODO add your handling code here:
        cb_rhlocalbodytype.setEnabled(true);
    }//GEN-LAST:event_cb_rhdistrictActionPerformed

    private void cb_rhlocalbodytypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_rhlocalbodytypeActionPerformed
        // TODO add your handling code here:
        try {
            con = new Connector().getCon();
            dist=cb_rhdistrict.getSelectedItem().toString();
            lb_type=cb_rhlocalbodytype.getSelectedItem().toString();
            if(lb_type.equals("GRAMA PANCHAYATH"))
            {
            lb_type_id=3;
            stmt=con.prepareStatement("SELECT dist_id FROM asdproject.districts where dist_name=? ;");
            stmt.setString(1,dist);        
            ResultSet rs=stmt.executeQuery();
            rs.first();
            dist_id=rs.getInt(1);
            stmt=con.prepareStatement("SELECT p_name,p_id FROM asdproject.panchayaths where d_id=? ;");
            stmt.setString(1,rs.getString(1));
            rs=stmt.executeQuery();
            int size =0;
            if (rs != null) 
            {
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
            }
            rs.first();
            local_body_list=new String[size];
            int i=0;
            do{
            local_body_list[i++]=rs.getString(1);
            }while(rs.next());
             cb_rhlocalbody.setModel(new javax.swing.DefaultComboBoxModel<>(local_body_list));
            }
            cb_rhlocalbody.setEnabled(true);
        }
        catch (SQLException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"sql error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        
        }
    }//GEN-LAST:event_cb_rhlocalbodytypeActionPerformed

    private void b_viewhotspotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_viewhotspotMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_b_viewhotspotMouseClicked

    private void b_removehotspotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_removehotspotMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) t_removehotspot.getModel();       
        int RowIndex = t_removehotspot.getSelectedRow();
        int hotspotid = Integer.parseInt(tf_removehotspotid.getText());
        try
        {
            Connection con = new Connector().getCon();
            PreparedStatement stmt=con.prepareStatement("DELETE FROM asdproject.hotspots WHERE hotspot_id=?;");
            stmt.setInt(1,hotspotid);
            int  rs=stmt.executeUpdate();
            if(rs != 0 )
            {
              JOptionPane.showMessageDialog(null,"Hotspot Removed Succesfully");
              model.removeRow(RowIndex);
              tf_removehotspotid.setText("");
            }
            else
                JOptionPane.showMessageDialog(null,"Hotspot Not Removed");
                
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } 
    }//GEN-LAST:event_b_removehotspotMouseClicked

    private void b_viewhotspotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_viewhotspotActionPerformed
        // TODO add your handling code here:
        int distname = cb_rhdistrict.getSelectedIndex()+1;
        int localbodytype= cb_rhlocalbodytype.getSelectedIndex()+1;
        String localbody = cb_rhlocalbody.getSelectedItem().toString();
        l_search_result.setText("List of Wards which are hotspot in "+localbody+" "+cb_rhlocalbodytype.getSelectedItem().toString()+" of "+cb_rhdistrict.getSelectedItem().toString()+" district:-");
        Connection con;
        PreparedStatement stmt;
        ResultSet rs=null;
        try
        {
             con = new Connector().getCon();
             if(localbodytype==3)
             {
             stmt=con.prepareStatement("SELECT h.hotspot_id,h.hotspot_wardnumber,h.hotspot_added_date from asdproject.hotspots h, asdproject.panchayaths p where h.hotspot_localbody_id=p.p_id and p.p_name=?");
             stmt.setString(1, localbody);
             rs=stmt.executeQuery();
              t_removehotspot.setModel(DbUtils.resultSetToTableModel(rs));
             }
            if(!rs.first())
            {
                l_select_info.setEnabled(false);
            JOptionPane.showMessageDialog(null,"No Hotspots in "+localbody);
            }
            else
                l_select_info.setEnabled(true);

                
                
        }
        catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        } 
    }//GEN-LAST:event_b_viewhotspotActionPerformed

    private void t_removehotspotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_removehotspotMouseClicked
        // TODO add your handling code here:
        int row = t_removehotspot.getSelectedRow();
        TableModel model = t_removehotspot.getModel();
        
        tf_removehotspotid.setText(model.getValueAt(row,0).toString());
    }//GEN-LAST:event_t_removehotspotMouseClicked

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
            java.util.logging.Logger.getLogger(RemoveHotspots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveHotspots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveHotspots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveHotspots.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveHotspots().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_removehotspot;
    private javax.swing.JButton b_viewhotspot;
    private javax.swing.JComboBox<String> cb_rhdistrict;
    private javax.swing.JComboBox<String> cb_rhlocalbody;
    private javax.swing.JComboBox<String> cb_rhlocalbodytype;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l_search_result;
    private javax.swing.JLabel l_select_info;
    private javax.swing.JTable t_removehotspot;
    private javax.swing.JTextField tf_removehotspotid;
    // End of variables declaration//GEN-END:variables
    Connection con;
    PreparedStatement stmt;
    String distnames[];
    String lb_types[];
    String local_body_list[];
    String dist;
    String lb_type;
    String lb_name;
    int dist_id;
    int lb_type_id;
    int lb_name_id;
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asdtemp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author ajayj
 */
public class Communications extends javax.swing.JFrame {

    /**
     * Creates new form FAQ
     */
    public Communications(int id, int key) {
        type = key;
        from_id = id;
        initComponents();
        this.setLocationRelativeTo(null);
        fetch();
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
        l_title = new javax.swing.JLabel();
        img_back = new javax.swing.JLabel();
        p_main = new javax.swing.JPanel();
        l_head1 = new javax.swing.JLabel();
        l_mssgTitle = new javax.swing.JLabel();
        tf_cMessagetitle = new javax.swing.JTextField();
        l_cMessage = new javax.swing.JLabel();
        sp_cMessage = new javax.swing.JScrollPane();
        ta_Message = new javax.swing.JTextArea();
        b_cSend = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        l_head2 = new javax.swing.JLabel();
        tf_citizenID = new javax.swing.JTextField();
        l_emailID = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        l_name = new javax.swing.JLabel();
        l_place = new javax.swing.JLabel();
        tf_place = new javax.swing.JTextField();
        l_ppTitle = new javax.swing.JLabel();
        tf_ppTitle = new javax.swing.JTextField();
        sp_ppMessage = new javax.swing.JScrollPane();
        ta_ppMessage = new javax.swing.JTextArea();
        l_ppMessage = new javax.swing.JLabel();
        b_ppSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_previouspersonal = new javax.swing.JTable();
        l_previousMessage = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        l_previousMessage1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        t_previouscommon = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(46, 49, 49));
        jPanel2.setLayout(null);

        l_title.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        l_title.setForeground(new java.awt.Color(255, 255, 255));
        l_title.setText("Communications");
        jPanel2.add(l_title);
        l_title.setBounds(60, 10, 250, 41);

        img_back.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        img_back.setForeground(new java.awt.Color(255, 255, 255));
        img_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/back2.png"))); // NOI18N
        img_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMouseClicked(evt);
            }
        });
        jPanel2.add(img_back);
        img_back.setBounds(10, 10, 40, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 900, 60);

        p_main.setBackground(new java.awt.Color(232, 236, 241));
        p_main.setMinimumSize(new java.awt.Dimension(900, 700));

        l_head1.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        l_head1.setText("Send a common message");

        l_mssgTitle.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_mssgTitle.setText("Title");

        tf_cMessagetitle.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        l_cMessage.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_cMessage.setText("Message");

        ta_Message.setColumns(20);
        ta_Message.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        ta_Message.setLineWrap(true);
        ta_Message.setRows(5);
        sp_cMessage.setViewportView(ta_Message);

        b_cSend.setBackground(new java.awt.Color(23, 162, 184));
        b_cSend.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_cSend.setText("Send");
        b_cSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_cSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_cSendActionPerformed(evt);
            }
        });

        l_head2.setFont(new java.awt.Font("SansSerif", 0, 24)); // NOI18N
        l_head2.setText("Send to a particular person");

        tf_citizenID.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        tf_citizenID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_citizenIDActionPerformed(evt);
            }
        });

        l_emailID.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_emailID.setText("Enter ID");

        tf_name.setEditable(false);
        tf_name.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        l_name.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_name.setText("Name");

        l_place.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_place.setText("Place");

        tf_place.setEditable(false);
        tf_place.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        l_ppTitle.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_ppTitle.setText("Title");

        tf_ppTitle.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N

        ta_ppMessage.setColumns(20);
        ta_ppMessage.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        ta_ppMessage.setLineWrap(true);
        ta_ppMessage.setRows(5);
        sp_ppMessage.setViewportView(ta_ppMessage);

        l_ppMessage.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        l_ppMessage.setText("Message");

        b_ppSend.setBackground(new java.awt.Color(23, 162, 184));
        b_ppSend.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_ppSend.setText("Send");
        b_ppSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_ppSend.setEnabled(false);
        b_ppSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ppSendActionPerformed(evt);
            }
        });

        t_previouspersonal.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        t_previouspersonal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(t_previouspersonal);

        l_previousMessage.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        l_previousMessage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/bullet.png"))); // NOI18N
        l_previousMessage.setText("Personal Messages Sent");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/bullet.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/bullet.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/bullet.png"))); // NOI18N

        l_previousMessage1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        l_previousMessage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/bullet.png"))); // NOI18N
        l_previousMessage1.setText("Common Messages Sent");

        t_previouscommon.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        t_previouscommon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(t_previouscommon);

        javax.swing.GroupLayout p_mainLayout = new javax.swing.GroupLayout(p_main);
        p_main.setLayout(p_mainLayout);
        p_mainLayout.setHorizontalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_mainLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l_previousMessage1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(l_previousMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35))
            .addGroup(p_mainLayout.createSequentialGroup()
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel4)
                        .addGap(5, 5, 5)
                        .addComponent(l_head1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(8, 8, 8)
                        .addComponent(l_head2, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(l_mssgTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(tf_cMessagetitle, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(177, 177, 177)
                        .addComponent(l_emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(tf_citizenID, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(l_cMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(sp_cMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l_ppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(l_name, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(l_place, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(49, 49, 49)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_place, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(b_cSend, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addComponent(l_ppMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(sp_ppMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(b_ppSend, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_mainLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        p_mainLayout.setVerticalGroup(
            p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_mainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_head1)
                    .addComponent(l_head2)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))))
                .addGap(38, 38, 38)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_mssgTitle)
                    .addComponent(l_emailID)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_cMessagetitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_citizenID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(l_cMessage)
                    .addComponent(sp_cMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addComponent(l_name)
                        .addGap(28, 28, 28)
                        .addComponent(l_place))
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(tf_place, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ppTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(l_ppTitle))))
                .addGap(18, 18, 18)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_mainLayout.createSequentialGroup()
                        .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_mainLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(l_ppMessage))
                            .addComponent(sp_ppMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addComponent(b_ppSend))
                    .addComponent(b_cSend))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_mainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(l_previousMessage1)
                        .addGroup(p_mainLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_mainLayout.createSequentialGroup()
                        .addComponent(l_previousMessage)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103))
        );

        getContentPane().add(p_main);
        p_main.setBounds(0, 60, 900, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_img_backMouseClicked

    private void b_ppSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_ppSendActionPerformed
        String title = tf_ppTitle.getText();
        String message = ta_ppMessage.getText();

        try{
            con = new Connector().getCon();
            ps = con.prepareStatement("INSERT INTO `asdproject`.`messages` (`mess_key`, `mess_from_id`, `mess_to_id`, `date`, `title`, `message`) VALUES (?, ?, ?, ?, ?, ?);");
            ps.setString(1, Integer.toString(type));
            ps.setInt(2, from_id);
            ps.setString(3, tf_citizenID.getText());
            ps.setString(4, fetchDate());
            ps.setString(5, title);
            ps.setString(6, message);
            int rs2 = ps.executeUpdate();
            if(rs2>0){
            JOptionPane.showMessageDialog(null,"Message Successfully Sent to "+tf_name.getText());
            fetch();
            tf_ppTitle.setText("");
            tf_citizenID.setText("");
            ta_ppMessage.setText("");
            tf_name.setText("");
            tf_place.setText("");
            b_ppSend.setEnabled(false);
            }

        }catch (SQLException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"SQL Error. Contact System Admin.");
            //ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        }
    }//GEN-LAST:event_b_ppSendActionPerformed

    private void tf_citizenIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_citizenIDActionPerformed
        String cit_id = tf_citizenID.getText();
        try{
            con = new Connector().getCon();
            ps = con.prepareStatement("SELECT cl.c_fullname, p.p_name FROM `asdproject`.`citizen_list` cl, `asdproject`.`panchayaths` p WHERE cl.c_local_body_name_id=p.p_id AND cl.c_id=?;");
            ps.setString(1, cit_id);
            rs=ps.executeQuery();
            if(rs.next()){
                tf_name.setText(rs.getString(1));
                tf_place.setText(rs.getString(2));
                b_ppSend.setEnabled(true);
            }
        }catch (SQLException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"SQL Error. Contact System Admin.");
            //ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        }

    }//GEN-LAST:event_tf_citizenIDActionPerformed

    private void b_cSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_cSendActionPerformed
        String title = tf_cMessagetitle.getText();
        String message = ta_Message.getText();
        if(title.equals("")||message.equals(""))
            JOptionPane.showMessageDialog(null,"All fields are required!");
        else
        {
        try{
            con = new Connector().getCon();
            ps = con.prepareStatement("INSERT INTO `asdproject`.`messages` (`mess_from_id`, `mess_to_id`, `date`, `title`, `message`, `mess_key`) VALUES (?, ?, ?, ?, ?, ?);");
            ps.setInt(1, from_id);
            ps.setString(2, "0");
            ps.setString(3, fetchDate());
            ps.setString(4, title);
            ps.setString(5, message);
            ps.setInt(6, type);
            int rs2 = ps.executeUpdate();
            if(rs2>0){
            JOptionPane.showMessageDialog(null,"Message Successfully Sent to All Citizen");
            fetch();
            tf_cMessagetitle.setText("");
            ta_Message.setText("");
            }

        }catch (SQLException ex) {
            //ex.printStackTrace();
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"SQL Error. Contact System Admin.");

        } catch (ClassNotFoundException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        }
        }

    }//GEN-LAST:event_b_cSendActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Communications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Communications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Communications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Communications.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Communications().setVisible(true);
//            }
//        });
//    }
    
    private void fetch(){
        try{
            Connection con = new Connector().getCon();
            if(type==0){
                ps = con.prepareStatement("SELECT cl.c_fullname, m.date, m.title, m.message FROM asdproject.citizen_list cl, asdproject.messages m WHERE m.mess_to_id=cl.c_id AND m.mess_from_id=? AND m.mess_key='0';");
                ps.setString(1, Integer.toString(from_id));
                rs = ps.executeQuery();
                t_previouspersonal.setModel(DbUtils.resultSetToTableModel(rs));
                ps = con.prepareStatement("SELECT  date, title, message from asdproject.messages  WHERE mess_to_id=0 AND mess_from_id=? AND mess_key='0';");
                ps.setString(1, Integer.toString(from_id));
                rs = ps.executeQuery();
                t_previouscommon.setModel(DbUtils.resultSetToTableModel(rs));
            }else{
            ps = con.prepareStatement("SELECT cl.c_fullname, m.title, m.message FROM asdproject.citizen_list cl, asdproject.messages m WHERE m.mess_to_id=cl.c_id AND m.mess_from_id=? AND m.mess_key='1';");
            ps.setString(1, Integer.toString(from_id));
            rs = ps.executeQuery();
            
            t_previouspersonal.setModel(DbUtils.resultSetToTableModel(rs));
             ps = con.prepareStatement("SELECT  date, title, message from asdproject.messages  WHERE mess_to_id=0 AND mess_from_id=? AND mess_key='1';");
                ps.setString(1, Integer.toString(from_id));
                rs = ps.executeQuery();
                t_previouscommon.setModel(DbUtils.resultSetToTableModel(rs));
            }
        }catch(Exception e){
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
        }
    }
    private String fetchDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
        LocalDateTime now = LocalDateTime.now();
        String today = dtf.format(now);
        return today;
    }
    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int from_id;
    int to_id=0;
    int type;
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_cSend;
    private javax.swing.JButton b_ppSend;
    private javax.swing.JLabel img_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel l_cMessage;
    private javax.swing.JLabel l_emailID;
    private javax.swing.JLabel l_head1;
    private javax.swing.JLabel l_head2;
    private javax.swing.JLabel l_mssgTitle;
    private javax.swing.JLabel l_name;
    private javax.swing.JLabel l_place;
    private javax.swing.JLabel l_ppMessage;
    private javax.swing.JLabel l_ppTitle;
    private javax.swing.JLabel l_previousMessage;
    private javax.swing.JLabel l_previousMessage1;
    private javax.swing.JLabel l_title;
    private javax.swing.JPanel p_main;
    private javax.swing.JScrollPane sp_cMessage;
    private javax.swing.JScrollPane sp_ppMessage;
    private javax.swing.JTable t_previouscommon;
    private javax.swing.JTable t_previouspersonal;
    private javax.swing.JTextArea ta_Message;
    private javax.swing.JTextArea ta_ppMessage;
    private javax.swing.JTextField tf_cMessagetitle;
    private javax.swing.JTextField tf_citizenID;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_place;
    private javax.swing.JTextField tf_ppTitle;
    // End of variables declaration//GEN-END:variables
}

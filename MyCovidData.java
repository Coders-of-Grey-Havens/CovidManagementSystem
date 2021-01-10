/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdtemp;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author ajayj
 */
public class MyCovidData extends javax.swing.JFrame {

    /**
     * Creates new form CFLTCs
     */
    public MyCovidData(int i) {
        id=i;
        initComponents();
        this.setLocationRelativeTo(null);
        fetch();
    }
private void fetch()
{
     try {
            Connection con = new Connector().getCon();
            PreparedStatement stmt=con.prepareStatement("SELECT tc.tc_name FROM asdproject.testing_centers tc, asdproject.citizen_list ci where tc.tc_district_id=ci.c_district_id and ci.c_id=?;");
            stmt.setInt(1,id);
            ResultSet rs=stmt.executeQuery();
            int size =0;
            if (rs.first()) 
            {
                cb_testing_center.setEnabled(true);
              rs.last();    // moves cursor to the last row
              size = rs.getRow(); // get row id 
              rs.first();
            testing_center_list=new String[size];
            int i=0;
            do{
            testing_center_list[i++]=rs.getString(1);
            }while(rs.next());
             cb_testing_center.setModel(new javax.swing.DefaultComboBoxModel<>(testing_center_list));
            }
            else
            {
               errorpane.setText("No Testing Center Registered "); 
               cb_testing_center.setEnabled(false);
            }
            stmt=con.prepareStatement("SELECT t_request_id, t_test_date,t_request_date, t_status FROM asdproject.test_requests WHERE t_citizen_id=?");
            stmt.setInt(1,id);
            ResultSet rs1=stmt.executeQuery();
            t_previous_test_applications.setModel(DbUtils.resultSetToTableModel(rs1));
            if(!rs.first())
             error2.setText("You have not applied for any covid test yet!");
            stmt=con.prepareStatement("SELECT nr_subject, nr_details, nr_application_date, nr_status, nr_fulfilled_date FROM asdproject.patient_need_requests WHERE c_id=?");
            stmt.setInt(1,id);
            ResultSet rs2=stmt.executeQuery();
            t_previous_requests.setModel(DbUtils.resultSetToTableModel(rs2));
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

        p_toppanel = new javax.swing.JPanel();
        p_title = new javax.swing.JLabel();
        img_back = new javax.swing.JLabel();
        tb_options = new javax.swing.JTabbedPane();
        p_apply_for_test = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cb_testing_center = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        dc_test_date = new com.toedter.calendar.JDateChooser();
        b_apply_for_test = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        t_previous_test_applications = new javax.swing.JTable();
        errorpane = new javax.swing.JLabel();
        error2 = new javax.swing.JLabel();
        p_my_test_result = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tf_test_result = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tf_test_date = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tf_test_center_name = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tf_test_details = new javax.swing.JTextArea();
        jLabel13 = new javax.swing.JLabel();
        tf_test_result_date = new javax.swing.JTextField();
        p_place_requests = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tf_request_subject = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ta_request_details = new javax.swing.JTextArea();
        b_submit_request = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_previous_requests = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        p_toppanel.setBackground(new java.awt.Color(46, 49, 49));

        p_title.setBackground(new java.awt.Color(255, 255, 255));
        p_title.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        p_title.setForeground(new java.awt.Color(255, 255, 255));
        p_title.setText("My Covid Data");

        img_back.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        img_back.setForeground(new java.awt.Color(255, 255, 255));
        img_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/asdtemp/back2.png"))); // NOI18N
        img_back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_toppanelLayout = new javax.swing.GroupLayout(p_toppanel);
        p_toppanel.setLayout(p_toppanelLayout);
        p_toppanelLayout.setHorizontalGroup(
            p_toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_toppanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(img_back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(p_title)
                .addContainerGap(651, Short.MAX_VALUE))
        );
        p_toppanelLayout.setVerticalGroup(
            p_toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_toppanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_back, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p_title))
                .addGap(117, 117, 117))
        );

        getContentPane().add(p_toppanel);
        p_toppanel.setBounds(0, 0, 910, 60);

        tb_options.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tb_optionsStateChanged(evt);
            }
        });
        tb_options.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_optionsMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Select Testing Center");

        cb_testing_center.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Select Testing Date");

        b_apply_for_test.setBackground(new java.awt.Color(0, 153, 0));
        b_apply_for_test.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_apply_for_test.setForeground(new java.awt.Color(255, 255, 255));
        b_apply_for_test.setText("Apply For Test");
        b_apply_for_test.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_apply_for_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_apply_for_testActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Previous Test Applications");

        t_previous_test_applications.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(t_previous_test_applications);

        javax.swing.GroupLayout p_apply_for_testLayout = new javax.swing.GroupLayout(p_apply_for_test);
        p_apply_for_test.setLayout(p_apply_for_testLayout);
        p_apply_for_testLayout.setHorizontalGroup(
            p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_apply_for_testLayout.createSequentialGroup()
                .addGroup(p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_apply_for_testLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p_apply_for_testLayout.createSequentialGroup()
                                .addGroup(p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cb_testing_center, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dc_test_date, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(errorpane, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(p_apply_for_testLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(b_apply_for_test))
                    .addGroup(p_apply_for_testLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        p_apply_for_testLayout.setVerticalGroup(
            p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_apply_for_testLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cb_testing_center, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorpane))
                .addGap(18, 18, 18)
                .addGroup(p_apply_for_testLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(dc_test_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(b_apply_for_test)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(error2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tb_options.addTab("Apply For Test", p_apply_for_test);
        p_apply_for_test.setVisible(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Test Result");

        tf_test_result.setEditable(false);
        tf_test_result.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tested Date");

        tf_test_date.setEditable(false);
        tf_test_date.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Applied Testing Center");

        tf_test_center_name.setEditable(false);
        tf_test_center_name.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tf_test_center_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_test_center_nameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Result Details");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Details Of The Latest Test Result Published");

        tf_test_details.setColumns(20);
        tf_test_details.setLineWrap(true);
        tf_test_details.setRows(5);
        jScrollPane4.setViewportView(tf_test_details);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Result Publish Date");

        tf_test_result_date.setEditable(false);
        tf_test_result_date.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        javax.swing.GroupLayout p_my_test_resultLayout = new javax.swing.GroupLayout(p_my_test_result);
        p_my_test_result.setLayout(p_my_test_resultLayout);
        p_my_test_resultLayout.setHorizontalGroup(
            p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_my_test_resultLayout.createSequentialGroup()
                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p_my_test_resultLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(p_my_test_resultLayout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(tf_test_result))
                            .addGroup(p_my_test_resultLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(tf_test_center_name, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_my_test_resultLayout.createSequentialGroup()
                                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(90, 90, 90)
                                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_test_date)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)))
                            .addGroup(p_my_test_resultLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(tf_test_result_date))))
                    .addGroup(p_my_test_resultLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        p_my_test_resultLayout.setVerticalGroup(
            p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_my_test_resultLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(tf_test_center_name))
                .addGap(18, 18, 18)
                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_test_result))
                .addGap(18, 18, 18)
                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(tf_test_date))
                .addGap(18, 18, 18)
                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(tf_test_result_date))
                .addGap(30, 30, 30)
                .addGroup(p_my_test_resultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71))
        );

        tb_options.addTab("My Test Status", p_my_test_result);
        p_my_test_result.setVisible(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Request Subject");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Request Details");

        tf_request_subject.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        ta_request_details.setColumns(20);
        ta_request_details.setLineWrap(true);
        ta_request_details.setRows(5);
        jScrollPane1.setViewportView(ta_request_details);

        b_submit_request.setBackground(new java.awt.Color(51, 153, 0));
        b_submit_request.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        b_submit_request.setForeground(new java.awt.Color(255, 255, 255));
        b_submit_request.setText("Submit Request");
        b_submit_request.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_submit_requestActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Previous Requests");

        t_previous_requests.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(t_previous_requests);

        javax.swing.GroupLayout p_place_requestsLayout = new javax.swing.GroupLayout(p_place_requests);
        p_place_requests.setLayout(p_place_requestsLayout);
        p_place_requestsLayout.setHorizontalGroup(
            p_place_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_place_requestsLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(p_place_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(p_place_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                    .addComponent(tf_request_subject))
                .addGap(183, 183, 183))
            .addGroup(p_place_requestsLayout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addComponent(b_submit_request, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(p_place_requestsLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(p_place_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 51, Short.MAX_VALUE))
        );
        p_place_requestsLayout.setVerticalGroup(
            p_place_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_place_requestsLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(p_place_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tf_request_subject))
                .addGap(18, 18, 18)
                .addGroup(p_place_requestsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(b_submit_request, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );

        tb_options.addTab("Place A Request", p_place_requests);
        p_place_requests.setVisible(false);

        getContentPane().add(tb_options);
        tb_options.setBounds(80, 110, 640, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_backMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_img_backMouseClicked

    private void tb_optionsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_optionsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_optionsMouseClicked

    private void tb_optionsStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tb_optionsStateChanged
        // TODO add your handling code here:
        
          if(tb_options.getSelectedIndex()==1) 
             
         { 
              try
                {
                    Connection con = new Connector().getCon();
                    PreparedStatement stmt=con.prepareStatement("SELECT tcenter.tc_name, tr.result_status, tr.result_date, treq.t_test_date from asdproject.test_result tr, asdproject.testing_centers tcenter, asdproject.test_requests treq where tr.testcenter_id=tcenter.tc_id and treq.t_citizen_id=tr.citizen_id and tr.citizen_id=?");
                    stmt.setInt(1,id);
                    ResultSet rs=stmt.executeQuery();
                    if(rs.last())
                    {
                    tf_test_center_name.setText(rs.getString(1));
                    tf_test_result.setText(rs.getString(2));
                    tf_test_result_date.setText(rs.getString(3));
                    tf_test_date.setText(rs.getString(4));
                    if(rs.getString(2).equals("Negative"))
                        tf_test_details.setText("Stay Indoors. If found any symptoms, visit nearest heath facility or contact helpline number 1075");
                    else
                        tf_test_details.setText("Stay Safe. Any health issues found, please report to nearest health center");
                    }
                    else
                        
                    {
                        //JOptionPane.showMessageDialog(null, "Test Result not published");
                        tf_test_center_name.setEnabled(false);
                        tf_test_result.setEnabled(false);
                        tf_test_date.setEnabled(false);
                        tf_test_details.setEnabled(false);
                    }
                                               
                }
                catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        
        }
         
         }         
    }//GEN-LAST:event_tb_optionsStateChanged

    private void tf_test_center_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_test_center_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_test_center_nameActionPerformed

    private void b_apply_for_testActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_apply_for_testActionPerformed
        // TODO add your handling code here:
         try
                {
                    Connection con = new Connector().getCon();
                    PreparedStatement stmt=con.prepareStatement("SELECT tc_id from asdproject.testing_centers where tc_name=?");
                    stmt.setString(1,cb_testing_center.getSelectedItem().toString());
                    ResultSet rs=stmt.executeQuery();
                    rs.first();
                    DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");  
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
                    String test_date = dateFormat.format(dc_test_date.getDate()); 
                    LocalDateTime now = LocalDateTime.now();  
                    String today=dtf.format(now); 
                    stmt=con.prepareStatement("INSERT INTO `asdproject`.`test_requests` (`t_citizen_id`, `t_center_id`, `t_test_date`, `t_request_date`) VALUES (?,?,?,?);");     
                    stmt.setInt(1,id);
                    stmt.setInt(2,Integer.valueOf(rs.getString(1)));
                    stmt.setString(3,test_date);
                    stmt.setString(4,today);
                    int r=stmt.executeUpdate();
                    if(r>0)
                        JOptionPane.showMessageDialog(null, "Test Booking Successfull");
                    else
                        JOptionPane.showMessageDialog(null, "Test Booking Failed");
                    fetch();
                            
                }
                catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        
        }
    }//GEN-LAST:event_b_apply_for_testActionPerformed

    private void b_submit_requestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_submit_requestActionPerformed
        // TODO add your handling code here:
       

         try
                {
                    Connection con = new Connector().getCon();
                    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
                    LocalDateTime now = LocalDateTime.now();  
                    String today=dtf.format(now); 
                    PreparedStatement stmt=con.prepareStatement("INSERT INTO `asdproject`.`patient_need_requests` (`c_id`, `nr_subject`, `nr_details`, `nr_application_date`) VALUES (?, ?, ?, ?);");     
                    stmt.setInt(1,id);
                    stmt.setString(2,tf_request_subject.getText());
                    stmt.setString(3,ta_request_details.getText());
                    stmt.setString(4,today);
                    int r=stmt.executeUpdate();
                    if(r>0)
                        JOptionPane.showMessageDialog(null, "Request Submitted");
                    else
                        JOptionPane.showMessageDialog(null, "Request Submission Failed");
                    fetch();
                            
                }
                catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin.");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null,"Class Missing. Contact System Admin.");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin.");
        
        }

        
    }//GEN-LAST:event_b_submit_requestActionPerformed

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
//            java.util.logging.Logger.getLogger(MyCovidData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(MyCovidData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(MyCovidData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(MyCovidData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new MyCovidData().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_apply_for_test;
    private javax.swing.JButton b_submit_request;
    private javax.swing.JComboBox<String> cb_testing_center;
    private com.toedter.calendar.JDateChooser dc_test_date;
    private javax.swing.JLabel error2;
    private javax.swing.JLabel errorpane;
    private javax.swing.JLabel img_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JPanel p_apply_for_test;
    private javax.swing.JPanel p_my_test_result;
    private javax.swing.JPanel p_place_requests;
    private javax.swing.JLabel p_title;
    private javax.swing.JPanel p_toppanel;
    private javax.swing.JTable t_previous_requests;
    private javax.swing.JTable t_previous_test_applications;
    private javax.swing.JTextArea ta_request_details;
    private javax.swing.JTabbedPane tb_options;
    private javax.swing.JTextField tf_request_subject;
    private javax.swing.JTextField tf_test_center_name;
    private javax.swing.JTextField tf_test_date;
    private javax.swing.JTextArea tf_test_details;
    private javax.swing.JTextField tf_test_result;
    private javax.swing.JTextField tf_test_result_date;
    // End of variables declaration//GEN-END:variables
    private int id;
    private String [] testing_center_list;
}

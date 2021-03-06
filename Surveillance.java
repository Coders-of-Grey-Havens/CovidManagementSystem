/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asdtemp;

/**
 *
 * @author harig
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Surveillance extends javax.swing.JFrame {

    /**
     * Creates new form GovtOrders
     */
    public Surveillance(int key) {
        initComponents();
        this.setLocationRelativeTo(null);
        v_id=key;
        fetch();
        action();
    }
    
    public void fetch()
    {
        try
        {
           con=new Connector().getCon();
           ps=con.prepareStatement("SELECT c_local_body_name_id FROM asdproject.citizen_list WHERE c_id=?");
          ps.setString(1,Integer.toString(v_id));
          ResultSet rs1=ps.executeQuery();
          rs1.next();
          v_dist_id=rs1.getInt("c_local_body_name_id");
           ps=con.prepareStatement("SELECT c_id AS ID, c_fullname AS Name, c_phno AS Phone_Number, c_gender AS Gender,c_address AS Address, c_ward_num AS Ward_Number FROM asdproject.citizen_list  WHERE c_local_body_name_id=? and c_covid_status='Positive'; ");
           ps.setString(1,Integer.toString(v_dist_id));
           rs=ps.executeQuery();
                t_surveillance.setModel(DbUtils.resultSetToTableModel(rs));
           if(!rs.first())
               JOptionPane.showMessageDialog(null,"No paitients at your location ");
        }
        catch(ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null,"Class Error. Contact System Admin");
        } catch(SQLException e) {
            //e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Database Error. Contact System Admin");
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin");
        }
    }
    public void action()
    {
        rb_fatigue_no.setActionCommand(rb_fatigue_no.getText());
        rb_fatigue_yes.setActionCommand(rb_fatigue_yes.getText());
        rb_fever_no.setActionCommand(rb_fever_no.getText());
        rb_fever_yes.setActionCommand(rb_fever_yes.getText());
        rb_alteredsmell_no.setActionCommand(rb_alteredsmell_no.getText());
        rb_alteredsmell_yes.setActionCommand(rb_alteredsmell_yes.getText());
        rb_alteredtaste_no.setActionCommand(rb_alteredtaste_no.getText());
        rb_alteredtaste_yes.setActionCommand(rb_alteredtaste_yes.getText());
        rb_breathingissue_no.setActionCommand(rb_breathingissue_no.getText());
        rb_breathingissue_yes.setActionCommand(rb_breathingissue_yes.getText());
        rb_cough_no.setActionCommand(rb_cough_no.getText());
        rb_cough_yes.setActionCommand(rb_cough_yes.getText());
        rb_headache_no.setActionCommand(rb_headache_no.getText());
        rb_headache_yes.setActionCommand(rb_headache_yes.getText());
        rb_nausea_no.setActionCommand(rb_nausea_no.getText());
        rb_nausea_yes.setActionCommand(rb_nausea_yes.getText());
        rb_sorethroat_no.setActionCommand(rb_sorethroat_no.getText());
        rb_sorethroat_yes.setActionCommand(rb_sorethroat_yes.getText());
        rb_vomiting_no.setActionCommand(rb_vomiting_no.getText());
        rb_vomiting_yes.setActionCommand(rb_vomiting_yes.getText());
    }
    public void clearselection()
    {
        alteredsmell.clearSelection();
        alteredtaste.clearSelection();
        breathingissue.clearSelection();
        cough.clearSelection();
        fatigue.clearSelection();
        fever.clearSelection();
        headache.clearSelection();
        nausea.clearSelection();
        sorethroat.clearSelection();
        vomiting.clearSelection();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fever = new javax.swing.ButtonGroup();
        cough = new javax.swing.ButtonGroup();
        headache = new javax.swing.ButtonGroup();
        nausea = new javax.swing.ButtonGroup();
        vomiting = new javax.swing.ButtonGroup();
        fatigue = new javax.swing.ButtonGroup();
        sorethroat = new javax.swing.ButtonGroup();
        breathingissue = new javax.swing.ButtonGroup();
        alteredsmell = new javax.swing.ButtonGroup();
        alteredtaste = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t_surveillance = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        b_clearselection = new javax.swing.JButton();
        b_proceed = new javax.swing.JButton();
        b_updatestatus = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rb_fatigue_no = new javax.swing.JRadioButton();
        rb_sorethroat_no = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        rb_nausea_no = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        rb_sorethroat_yes = new javax.swing.JRadioButton();
        rb_headache_no = new javax.swing.JRadioButton();
        rb_alteredtaste_no = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        rb_nausea_yes = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        rb_breathingissue_no = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rb_cough_yes = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        rb_breathingissue_yes = new javax.swing.JRadioButton();
        rb_vomiting_yes = new javax.swing.JRadioButton();
        rb_fever_no = new javax.swing.JRadioButton();
        rb_alteredsmell_yes = new javax.swing.JRadioButton();
        rb_alteredsmell_no = new javax.swing.JRadioButton();
        rb_headache_yes = new javax.swing.JRadioButton();
        rb_fever_yes = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        rb_alteredtaste_yes = new javax.swing.JRadioButton();
        rb_fatigue_yes = new javax.swing.JRadioButton();
        rb_cough_no = new javax.swing.JRadioButton();
        rb_vomiting_no = new javax.swing.JRadioButton();
        tf_selectedpersonname = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 204));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(46, 49, 49));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Surveillance");

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
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122))
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

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel3.setText("Surveillance List");

        t_surveillance.setBackground(new java.awt.Color(255, 255, 204));
        t_surveillance.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        t_surveillance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_surveillanceMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(t_surveillance);

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jLabel4.setText("Update Status");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel1.setText("Select Person from above Table");

        b_clearselection.setBackground(new java.awt.Color(255, 51, 51));
        b_clearselection.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_clearselection.setForeground(new java.awt.Color(255, 255, 255));
        b_clearselection.setText("Clear Selection");
        b_clearselection.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_clearselection.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_clearselectionMouseClicked(evt);
            }
        });

        b_proceed.setBackground(new java.awt.Color(0, 153, 204));
        b_proceed.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_proceed.setForeground(new java.awt.Color(255, 255, 255));
        b_proceed.setText("Proceed");
        b_proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_proceedActionPerformed(evt);
            }
        });

        b_updatestatus.setBackground(new java.awt.Color(51, 102, 0));
        b_updatestatus.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        b_updatestatus.setForeground(new java.awt.Color(255, 255, 255));
        b_updatestatus.setText("Update Status");
        b_updatestatus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b_updatestatus.setOpaque(false);
        b_updatestatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                b_updatestatusMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mark Symptoms", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Ubuntu", 0, 14), new java.awt.Color(0, 102, 102))); // NOI18N

        fatigue.add(rb_fatigue_no);
        rb_fatigue_no.setText("No");
        rb_fatigue_no.setEnabled(false);

        sorethroat.add(rb_sorethroat_no);
        rb_sorethroat_no.setText("No");
        rb_sorethroat_no.setEnabled(false);

        jLabel16.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel16.setText("Breathing Issue");

        nausea.add(rb_nausea_no);
        rb_nausea_no.setText("No");
        rb_nausea_no.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel13.setText("Fatigue");

        sorethroat.add(rb_sorethroat_yes);
        rb_sorethroat_yes.setText("Yes");
        rb_sorethroat_yes.setEnabled(false);

        headache.add(rb_headache_no);
        rb_headache_no.setText("No");
        rb_headache_no.setEnabled(false);

        alteredtaste.add(rb_alteredtaste_no);
        rb_alteredtaste_no.setText("No");
        rb_alteredtaste_no.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel6.setText("Fever");

        nausea.add(rb_nausea_yes);
        rb_nausea_yes.setText("Yes");
        rb_nausea_yes.setEnabled(false);

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel10.setText("Headache");

        jLabel17.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel17.setText("Altered Smell");

        breathingissue.add(rb_breathingissue_no);
        rb_breathingissue_no.setText("No");
        rb_breathingissue_no.setEnabled(false);

        jLabel14.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel14.setText("Sore Throat");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel12.setText("Vomiting");

        cough.add(rb_cough_yes);
        rb_cough_yes.setText("Yes");
        rb_cough_yes.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel11.setText("Nausea");

        breathingissue.add(rb_breathingissue_yes);
        rb_breathingissue_yes.setText("Yes");
        rb_breathingissue_yes.setEnabled(false);

        vomiting.add(rb_vomiting_yes);
        rb_vomiting_yes.setText("Yes");
        rb_vomiting_yes.setEnabled(false);

        fever.add(rb_fever_no);
        rb_fever_no.setText("No");
        rb_fever_no.setEnabled(false);

        alteredsmell.add(rb_alteredsmell_yes);
        rb_alteredsmell_yes.setText("Yes");
        rb_alteredsmell_yes.setEnabled(false);

        alteredsmell.add(rb_alteredsmell_no);
        rb_alteredsmell_no.setText("No");
        rb_alteredsmell_no.setEnabled(false);

        headache.add(rb_headache_yes);
        rb_headache_yes.setText("Yes");
        rb_headache_yes.setEnabled(false);

        fever.add(rb_fever_yes);
        rb_fever_yes.setText("Yes");
        rb_fever_yes.setEnabled(false);

        jLabel18.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel18.setText("Altered Taste");

        jLabel15.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jLabel15.setText("Cough");

        alteredtaste.add(rb_alteredtaste_yes);
        rb_alteredtaste_yes.setText("Yes");
        rb_alteredtaste_yes.setEnabled(false);

        fatigue.add(rb_fatigue_yes);
        rb_fatigue_yes.setText("Yes");
        rb_fatigue_yes.setEnabled(false);

        cough.add(rb_cough_no);
        rb_cough_no.setText("No");
        rb_cough_no.setEnabled(false);

        vomiting.add(rb_vomiting_no);
        rb_vomiting_no.setText("No");
        rb_vomiting_no.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_fever_yes)
                        .addGap(47, 47, 47)
                        .addComponent(rb_fever_no))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_nausea_yes)
                        .addGap(47, 47, 47)
                        .addComponent(rb_nausea_no))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_fatigue_yes)
                        .addGap(47, 47, 47)
                        .addComponent(rb_fatigue_no))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rb_vomiting_yes)
                            .addGap(47, 47, 47)
                            .addComponent(rb_vomiting_no))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rb_headache_yes)
                            .addGap(47, 47, 47)
                            .addComponent(rb_headache_no))))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_cough_yes)
                        .addGap(47, 47, 47)
                        .addComponent(rb_cough_no))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_breathingissue_yes)
                        .addGap(47, 47, 47)
                        .addComponent(rb_breathingissue_no))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rb_alteredtaste_yes)
                        .addGap(47, 47, 47)
                        .addComponent(rb_alteredtaste_no))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(rb_alteredsmell_yes)
                            .addGap(47, 47, 47)
                            .addComponent(rb_alteredsmell_no))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rb_sorethroat_yes)
                            .addGap(47, 47, 47)
                            .addComponent(rb_sorethroat_no))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rb_fever_yes)
                            .addComponent(rb_fever_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(rb_headache_yes)
                            .addComponent(rb_headache_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(rb_nausea_yes)
                            .addComponent(rb_nausea_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(rb_vomiting_yes)
                            .addComponent(rb_vomiting_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(rb_fatigue_yes)
                            .addComponent(rb_fatigue_no)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(rb_cough_yes)
                            .addComponent(rb_cough_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(rb_sorethroat_yes)
                            .addComponent(rb_sorethroat_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(rb_breathingissue_yes)
                            .addComponent(rb_breathingissue_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(rb_alteredsmell_yes)
                            .addComponent(rb_alteredsmell_no))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(rb_alteredtaste_yes)
                            .addComponent(rb_alteredtaste_no))))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tf_selectedpersonname.setEditable(false);
        tf_selectedpersonname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 864, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tf_selectedpersonname, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_clearselection, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(b_updatestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(246, 246, 246))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(b_proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(347, 347, 347))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_selectedpersonname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(b_proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_clearselection, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_updatestatus, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b_proceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_proceedActionPerformed
        
        rb_fatigue_no.setEnabled(true);
        rb_cough_no.setEnabled(true);
        rb_sorethroat_no.setEnabled(true);
        rb_nausea_no.setEnabled(true);
        rb_headache_no.setEnabled(true);
        rb_alteredtaste_no.setEnabled(true);
        rb_breathingissue_no.setEnabled(true);
        rb_fever_no.setEnabled(true);
        rb_alteredsmell_no.setEnabled(true);
        rb_headache_no.setEnabled(true);
        rb_vomiting_no.setEnabled(true);
        rb_fatigue_yes.setEnabled(true);
        rb_cough_yes.setEnabled(true);
        rb_sorethroat_yes.setEnabled(true);
        rb_nausea_yes.setEnabled(true);
        rb_headache_yes.setEnabled(true);
        rb_alteredtaste_yes.setEnabled(true);
        rb_breathingissue_yes.setEnabled(true);
        rb_fever_yes.setEnabled(true);
        rb_alteredsmell_yes.setEnabled(true);
        rb_headache_yes.setEnabled(true);
        rb_vomiting_yes.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_b_proceedActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void t_surveillanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_surveillanceMouseClicked
        // TODO add your handling code here:
        model = (DefaultTableModel) t_surveillance.getModel();
        RowIndex = t_surveillance.getSelectedRow();
        tf_selectedpersonname.setText(model.getValueAt(RowIndex,1).toString());
        s_citizen_id =Integer.parseInt(model.getValueAt(RowIndex,0).toString());
    }//GEN-LAST:event_t_surveillanceMouseClicked

    private void b_updatestatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_updatestatusMouseClicked
        // TODO add your handling code here:
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MMM-yyyy");  
        LocalDateTime now = LocalDateTime.now();  
        String today=dtf.format(now);
        
        try
        {
            String f=fever.getSelection().getActionCommand();
            String h=headache.getSelection().getActionCommand();
            String v=vomiting.getSelection().getActionCommand();
            String n=nausea.getSelection().getActionCommand();
            String fa=fatigue.getSelection().getActionCommand();
            String c=cough.getSelection().getActionCommand();
            String s=sorethroat.getSelection().getActionCommand();
            String b=breathingissue.getSelection().getActionCommand();
            String as=alteredsmell.getSelection().getActionCommand();
            String at=alteredtaste.getSelection().getActionCommand();
           con=new Connector().getCon();
           ps=con.prepareStatement("INSERT INTO `asdproject`.`surveillance` (`scitizen_id`, `s_date`, `fever`, `headache`, `nausea`, `vomiting`, `fatigue`, `cough`, `sorethroat`, `breathingissue`, `alteredsmell`, `alteredtaste`, `svolunteer_id`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?);");
           ps.setInt(1, s_citizen_id);
           ps.setString(2,today);
           ps.setString(3,f);
           ps.setString(4,h);
           ps.setString(5,n);
           ps.setString(6,v);
           ps.setString(7,fa);
           ps.setString(8,c);
           ps.setString(9,s);
           ps.setString(10,b);
           ps.setString(11,as);
           ps.setString(12,at);
           ps.setInt(13,v_id);
           int rs=ps.executeUpdate();
           if(rs!=0)
           {
              JOptionPane.showMessageDialog(null,"Surveillance report added");
              model.removeRow(RowIndex);
              tf_selectedpersonname.setText("");
              clearselection();
           }
           else
               JOptionPane.showMessageDialog(null," Error Surveillance report not added ");   
        }
        catch(NullPointerException nu)
        {
            JOptionPane.showMessageDialog(null,"Please mark all feilds");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unknown Error. Contact System Admin");
        }
    }//GEN-LAST:event_b_updatestatusMouseClicked

    private void b_clearselectionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_b_clearselectionMouseClicked
        // TODO add your handling code here:
        clearselection();
    }//GEN-LAST:event_b_clearselectionMouseClicked

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
            java.util.logging.Logger.getLogger(Surveillance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Surveillance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Surveillance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Surveillance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alteredsmell;
    private javax.swing.ButtonGroup alteredtaste;
    private javax.swing.JButton b_clearselection;
    private javax.swing.JButton b_proceed;
    private javax.swing.JButton b_updatestatus;
    private javax.swing.ButtonGroup breathingissue;
    private javax.swing.ButtonGroup cough;
    private javax.swing.ButtonGroup fatigue;
    private javax.swing.ButtonGroup fever;
    private javax.swing.ButtonGroup headache;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup nausea;
    private javax.swing.JRadioButton rb_alteredsmell_no;
    private javax.swing.JRadioButton rb_alteredsmell_yes;
    private javax.swing.JRadioButton rb_alteredtaste_no;
    private javax.swing.JRadioButton rb_alteredtaste_yes;
    private javax.swing.JRadioButton rb_breathingissue_no;
    private javax.swing.JRadioButton rb_breathingissue_yes;
    private javax.swing.JRadioButton rb_cough_no;
    private javax.swing.JRadioButton rb_cough_yes;
    private javax.swing.JRadioButton rb_fatigue_no;
    private javax.swing.JRadioButton rb_fatigue_yes;
    private javax.swing.JRadioButton rb_fever_no;
    private javax.swing.JRadioButton rb_fever_yes;
    private javax.swing.JRadioButton rb_headache_no;
    private javax.swing.JRadioButton rb_headache_yes;
    private javax.swing.JRadioButton rb_nausea_no;
    private javax.swing.JRadioButton rb_nausea_yes;
    private javax.swing.JRadioButton rb_sorethroat_no;
    private javax.swing.JRadioButton rb_sorethroat_yes;
    private javax.swing.JRadioButton rb_vomiting_no;
    private javax.swing.JRadioButton rb_vomiting_yes;
    private javax.swing.ButtonGroup sorethroat;
    private javax.swing.JTable t_surveillance;
    private javax.swing.JTextField tf_selectedpersonname;
    private javax.swing.ButtonGroup vomiting;
    // End of variables declaration//GEN-END:variables
    int v_id,s_citizen_id,v_dist_id;
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultTableModel model;
    int RowIndex;
}

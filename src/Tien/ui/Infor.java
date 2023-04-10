/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Tien.ui;

import dao.UserDAO;
import static swave.Login.user;
import utils.Auth;

/**
 *
 * @author HP
 */
public class Infor extends javax.swing.JPanel {

    private UserDAO uDao = new UserDAO();

    public Infor() {
        initComponents();
        setInf();
    }

    public void setInf() {
        user = uDao.selectById(Auth.user.getUserID());
        lblName.setText(user.getFullname());
        txtName.setText(lblName.getText());
        cboDay.setSelectedItem(user.getBirthDate().getDay());
        cboMonth.setSelectedItem(user.getBirthDate().getMonth());
        cboYear.setSelectedItem(user.getBirthDate().getYear());
        if (user.isGender()) {
            rdoMale.setSelected(true);
        } else {
            rdoFemale.setSelected(true);
        }
        txtEmail.setText(user.getEmail());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        cboDay = new javax.swing.JComboBox<>();
        cboMonth = new javax.swing.JComboBox<>();
        cboYear = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtEmail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        jLabel4.setBackground(new java.awt.Color(55, 2, 53));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(55, 2, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 100.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 37, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");
        lblName.setPreferredSize(new java.awt.Dimension(136, 58));
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 650, -1));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1283, 210));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 30));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(700, 29));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Thông tin cá nhân.png"))); // NOI18N
        jLabel7.setPreferredSize(new java.awt.Dimension(700, 29));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);

        jPanel4.setOpaque(false);
        jPanel4.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(67, 67, 67));
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(255, 255, 255));
        txtName.setText("Name");
        txtName.setBorder(null);
        txtName.setOpaque(true);
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 2, 540, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 101 (1).png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jLabel6.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel4);

        jPanel5.setOpaque(false);
        jPanel5.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboDay.setBackground(new java.awt.Color(67, 67, 67));
        cboDay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboDay.setForeground(new java.awt.Color(255, 255, 255));
        cboDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cboDay.setSelectedIndex(1);
        cboDay.setBorder(null);
        cboDay.setOpaque(true);
        jPanel5.add(cboDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 2, 130, 30));

        cboMonth.setBackground(new java.awt.Color(67, 67, 67));
        cboMonth.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboMonth.setForeground(new java.awt.Color(255, 255, 255));
        cboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cboMonth.setSelectedIndex(1);
        cboMonth.setBorder(null);
        cboMonth.setOpaque(true);
        jPanel5.add(cboMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 2, 130, 30));

        cboYear.setBackground(new java.awt.Color(67, 67, 67));
        cboYear.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboYear.setForeground(new java.awt.Color(255, 255, 255));
        cboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Năm", "2023", "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", " " }));
        cboYear.setSelectedIndex(1);
        cboYear.setBorder(null);
        cboYear.setOpaque(true);
        jPanel5.add(cboYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(472, 2, 200, 30));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 102.png"))); // NOI18N
        jLabel8.setText("jLabel6");
        jLabel8.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel5);

        jPanel6.setOpaque(false);
        jPanel6.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rdoMale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rdoMale);
        rdoMale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdoMale.setForeground(new java.awt.Color(255, 255, 255));
        rdoMale.setSelected(true);
        rdoMale.setText("Nam");
        rdoMale.setEnabled(false);
        rdoMale.setOpaque(true);
        jPanel6.add(rdoMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 90, 40));

        rdoFemale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdoFemale.setForeground(new java.awt.Color(255, 255, 255));
        rdoFemale.setText("Nữ");
        rdoFemale.setEnabled(false);
        rdoFemale.setOpaque(true);
        jPanel6.add(rdoFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 80, 40));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 103 (1).png"))); // NOI18N
        jLabel9.setText("jLabel6");
        jLabel9.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel6);

        jPanel7.setOpaque(false);
        jPanel7.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtEmail.setEditable(false);
        txtEmail.setBackground(new java.awt.Color(67, 67, 67));
        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setText("name1@bt.vn");
        txtEmail.setBorder(null);
        txtEmail.setOpaque(true);
        jPanel7.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 540, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 104.png"))); // NOI18N
        jLabel10.setText("jLabel6");
        jLabel10.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel7);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1283, 345));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboDay;
    private javax.swing.JComboBox<String> cboMonth;
    private javax.swing.JComboBox<String> cboYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lblName;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

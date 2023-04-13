/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Tien.ui;

import dao.UserDAO;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import static swave.Login.user;
import utils.Auth;
import utils.XDate;

/**
 *
 * @author HP
 */
public class EditInf extends javax.swing.JPanel {

    private UserDAO uDao = new UserDAO();
    File fAvt;

    public EditInf() {
        initComponents();
        pnlEditAvt.setVisible(false);
        if (Auth.user != null) {
            setInf();
        }
    }

    public void setInf() {
        try {
            user = uDao.selectById(Auth.user.getUserID());
            lblName.setText(user.getFullname());
            txtName.setText(lblName.getText());
            String date = XDate.toString(user.getBirthDate(), "dd-MM-yyyy");
            String[] day = date.split("-");
            cboDay.setSelectedItem(day[0]);
            cboMonth.setSelectedItem(day[1]);
            cboYear.setSelectedItem(day[2]);
            if (user.isGender()) {
                rdoMale.setSelected(true);
            } else {
                rdoFemale.setSelected(true);
            }
            txtMail.setText(user.getEmail());
            if (user.getAvt() != null) {
                File path = new File("src/img/avt", user.getAvt());
                BufferedImage img = ImageIO.read(path);
                Area clip = new Area(new Rectangle(0, 0, img.getWidth(), img.getHeight()));
                Area oval = new Area(new Ellipse2D.Double(0, 0, img.getWidth() - 1, img.getHeight() - 1));
                clip.subtract(oval);
                Graphics g2d = img.createGraphics();
                g2d.setClip(clip);
                g2d.setColor(new Color(55, 2, 53));
                g2d.fillRect(0, 0, img.getWidth(), img.getHeight());
                ImageIcon im = new ImageIcon(img.getScaledInstance(131, 125, Image.SCALE_DEFAULT));
                lblAvt.setIcon(im);
            }
        } catch (IOException ex) {
            Logger.getLogger(EditInf.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlEditAvt = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblChooseAvatar = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblEditAvt = new javax.swing.JLabel();
        lblAvt = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEdit = new javax.swing.JLabel();
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
        txtMail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();

        jLabel4.setBackground(new java.awt.Color(55, 2, 53));

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEditAvt.setBackground(new java.awt.Color(0, 0, 0));
        pnlEditAvt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlEditAvtMouseExited(evt);
            }
        });
        pnlEditAvt.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 33.png"))); // NOI18N
        jLabel11.setText("Chụp ảnh");
        jLabel11.setPreferredSize(new java.awt.Dimension(136, 24));
        pnlEditAvt.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 140, 30));

        lblChooseAvatar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblChooseAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lblChooseAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 32.png"))); // NOI18N
        lblChooseAvatar.setText("Chọn file ảnh");
        lblChooseAvatar.setPreferredSize(new java.awt.Dimension(136, 24));
        lblChooseAvatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblChooseAvatarMouseClicked(evt);
            }
        });
        pnlEditAvt.add(lblChooseAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Rectangle 35 (1).png"))); // NOI18N
        pnlEditAvt.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 90));

        add(pnlEditAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 200, 90));

        jPanel1.setBackground(new java.awt.Color(55, 2, 53));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEditAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-edit-48 3.png"))); // NOI18N
        lblEditAvt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditAvtMouseClicked(evt);
            }
        });
        jPanel1.add(lblEditAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));

        lblAvt.setBackground(new java.awt.Color(55, 2, 53));
        lblAvt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 100.png"))); // NOI18N
        jPanel1.add(lblAvt, new org.netbeans.lib.awtextra.AbsoluteConstraints(88, 37, 131, 125));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lblName.setForeground(new java.awt.Color(255, 255, 255));
        lblName.setText("Name");
        lblName.setPreferredSize(new java.awt.Dimension(136, 58));
        jPanel1.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 630, -1));

        lblEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnEdit.png"))); // NOI18N
        lblEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEditMouseClicked(evt);
            }
        });
        jPanel1.add(lblEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 120, 190, -1));

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
        cboDay.setEditable(true);
        cboDay.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboDay.setForeground(new java.awt.Color(255, 255, 255));
        cboDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ngày", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        cboDay.setSelectedIndex(1);
        cboDay.setBorder(null);
        cboDay.setOpaque(true);
        jPanel5.add(cboDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 2, 130, 30));

        cboMonth.setBackground(new java.awt.Color(67, 67, 67));
        cboMonth.setEditable(true);
        cboMonth.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        cboMonth.setForeground(new java.awt.Color(255, 255, 255));
        cboMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tháng", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        cboMonth.setSelectedIndex(1);
        cboMonth.setBorder(null);
        cboMonth.setOpaque(true);
        jPanel5.add(cboMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 2, 130, 30));

        cboYear.setBackground(new java.awt.Color(67, 67, 67));
        cboYear.setEditable(true);
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
        rdoMale.setOpaque(true);
        jPanel6.add(rdoMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 90, 40));

        rdoFemale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(rdoFemale);
        rdoFemale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        rdoFemale.setForeground(new java.awt.Color(255, 255, 255));
        rdoFemale.setText("Nữ");
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

        txtMail.setBackground(new java.awt.Color(67, 67, 67));
        txtMail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtMail.setForeground(new java.awt.Color(255, 255, 255));
        txtMail.setText("name1@bt.vn");
        txtMail.setBorder(null);
        txtMail.setOpaque(true);
        jPanel7.add(txtMail, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 540, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Frame 104.png"))); // NOI18N
        jLabel10.setText("jLabel6");
        jLabel10.setPreferredSize(new java.awt.Dimension(673, 36));
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.add(jPanel7);

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1283, 345));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditMouseClicked
        // TODO add your handling code here:
        if (txtName.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập tên!");
            txtName.requestFocus();
        } else if (cboDay.getSelectedIndex() == 0 || cboMonth.getSelectedIndex() == 0 || cboYear.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Chưa chọn ngày/tháng/năm sinh!");
        } else if (!rdoMale.isSelected() && !rdoFemale.isSelected()) {
            JOptionPane.showMessageDialog(this, "Chưa chọn giới tính!");
        } else if (txtMail.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Chưa nhập email!");
            txtMail.requestFocus();
        } else {
            user.setFullname(txtName.getText());
            user.setEmail(txtMail.getText());
            if (rdoFemale.isSelected()) {
                user.setGender(false);
            } else {
                user.setGender(true);
            }
            String date = cboYear.getSelectedItem().toString() + "-" + cboMonth.getSelectedItem().toString() + "-" + cboDay.getSelectedItem().toString();
            user.setBirthDate(XDate.toDate(date, "yyyy-MM-dd"));
            user.setAccount(Auth.user.getUserID());
            user.setAvt(user.getAccount() + ".png");
            uDao.update(user);
            lblName.setText(user.getFullname());
            JOptionPane.showMessageDialog(this, "Chỉnh sửa thông tin thành công");
            File file = new File("src/img/avt", user.getAvt());
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }

            if (fAvt != null) {
                Path from = Paths.get(fAvt.getAbsolutePath());
                Path to = Paths.get(file.getAbsolutePath());
                try {
                    Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
                } catch (IOException ex) {
                    Logger.getLogger(EditInf.class.getName()).log(Level.SEVERE, null, ex);
                }
            }

        }
    }//GEN-LAST:event_lblEditMouseClicked

    private void lblEditAvtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEditAvtMouseClicked
        pnlEditAvt.setVisible(true);
    }//GEN-LAST:event_lblEditAvtMouseClicked

    private void lblChooseAvatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblChooseAvatarMouseClicked
        pnlEditAvt.setVisible(false);
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            try {
                fAvt = fileChooser.getSelectedFile();
                BufferedImage img = ImageIO.read(fAvt);
                Area clip = new Area(new Rectangle(0, 0, img.getWidth(), img.getHeight()));
                Area oval = new Area(new Ellipse2D.Double(0, 0, img.getWidth() - 1, img.getHeight() - 1));
                clip.subtract(oval);
                Graphics g2d = img.createGraphics();
                g2d.setClip(clip);
                g2d.setColor(new Color(55, 2, 53));
                g2d.fillRect(0, 0, img.getWidth(), img.getHeight());
                ImageIcon im = new ImageIcon(img.getScaledInstance(131, 125, Image.SCALE_DEFAULT));
                lblAvt.setIcon(im);
            } catch (IOException ex) {
                Logger.getLogger(EditInf.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_lblChooseAvatarMouseClicked

    private void pnlEditAvtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlEditAvtMouseExited
//        double x = evt.getXOnScreen();
//        double y = evt.getYOnScreen();
//        double minXLocation = pnlEditAvt.getLocation().getX() + 320;
//        double maxXLocation = pnlEditAvt.getLocation().getX() + pnlEditAvt.getWidth() + 320;
//        double minYLocation = pnlEditAvt.getLocation().getY();
//        double maxYLocation = pnlEditAvt.getLocation().getY() + pnlEditAvt.getHeight();
//        System.out.println(x + " - " + y);
//        System.out.println(minXLocation + " _ " + maxXLocation);
//        if (!(x > minXLocation && x < maxXLocation)
//                || !(y > minYLocation && y < maxYLocation)) {
//
//        }

        try {
            if (((evt.getX() < pnlEditAvt.getLocation().getX()) || (evt.getX() > pnlEditAvt.getLocation().getX()))
                    && (pnlEditAvt.getMousePosition().getX() < pnlEditAvt.getLocation().getX())) {
            }
        } catch (Exception e) {
            pnlEditAvt.setVisible(false);
        }
    }//GEN-LAST:event_pnlEditAvtMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cboDay;
    private javax.swing.JComboBox<String> cboMonth;
    private javax.swing.JComboBox<String> cboYear;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lblAvt;
    private javax.swing.JLabel lblChooseAvatar;
    private javax.swing.JLabel lblEdit;
    private javax.swing.JLabel lblEditAvt;
    private javax.swing.JLabel lblName;
    private javax.swing.JPanel pnlEditAvt;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtMail;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}

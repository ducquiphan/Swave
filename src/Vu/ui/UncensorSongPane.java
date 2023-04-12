/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Vu.ui;

import AdminToolUtils.ListSongItemAddSongPanel;
import dao.SongDAO;
import entity.Song;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.HeadlessException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import swing.utilcomponent.ScrollBarCustom;
import utils.MsgBox;

/**
 *
 * @author Admin
 */
public class UncensorSongPane extends javax.swing.JPanel {

    /**
     * Creates new form UncensorSongPane
     */
    private SongDAO sdao = new SongDAO();
    private ArrayList<Song> songList;

    public UncensorSongPane() {
        initComponents();
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());
        fillTableNotAllowedSong();
        jPanel4.setOpaque(false);
        jPanel4.setBackground(new Color(0, 0, 0, 255));
        pnlListSong.setOpaque(true);
        pnlListSong.setBackground(new Color(0, 0, 0, 255));
        jScrollPane1.setOpaque(false);
        jScrollPane1.setBackground(new Color(0, 0, 0, 255));
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
        jPanel2 = new javax.swing.JPanel();
        findTextField2 = new AdminToolUtils.FindTextField();
        comboBoxPanel1 = new AdminToolUtils.ComboBoxPanel();
        cboSong = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        pnlTitle = new javax.swing.JPanel();
        lblNumber = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        lblStatus = new javax.swing.JLabel();
        lblOption = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlListSong = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(36, 36, 36));
        jPanel1.setPreferredSize(new java.awt.Dimension(1220, 807));

        jPanel2.setBackground(new java.awt.Color(36, 36, 36));

        findTextField2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        cboSong.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        cboSong.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bài hát chưa kiểm duyệt", "Tất cả bài hát" }));
        cboSong.setBorder(null);
        cboSong.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboSongItemStateChanged(evt);
            }
        });
        cboSong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSongActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout comboBoxPanel1Layout = new javax.swing.GroupLayout(comboBoxPanel1);
        comboBoxPanel1.setLayout(comboBoxPanel1Layout);
        comboBoxPanel1Layout.setHorizontalGroup(
            comboBoxPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboBoxPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(cboSong, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        comboBoxPanel1Layout.setVerticalGroup(
            comboBoxPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(comboBoxPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboSong, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(findTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(comboBoxPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboBoxPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(findTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
        );

        jPanel4.setBackground(new java.awt.Color(36, 36, 36));

        pnlTitle.setBackground(new java.awt.Color(36, 36, 36));
        pnlTitle.setPreferredSize(new java.awt.Dimension(1073, 52));

        lblNumber.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(199, 199, 199));
        lblNumber.setText("STT");

        lblName.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblName.setForeground(new java.awt.Color(199, 199, 199));
        lblName.setText("Tên người dùng");

        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblUser.setForeground(new java.awt.Color(199, 199, 199));
        lblUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUser.setText("Nhạc sĩ");

        lblStatus.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblStatus.setForeground(new java.awt.Color(199, 199, 199));
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("Tùy chọn");

        lblOption.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblOption.setForeground(new java.awt.Color(199, 199, 199));
        lblOption.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOption.setText("Ca sĩ");

        javax.swing.GroupLayout pnlTitleLayout = new javax.swing.GroupLayout(pnlTitle);
        pnlTitle.setLayout(pnlTitleLayout);
        pnlTitleLayout.setHorizontalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblNumber)
                .addGap(64, 64, 64)
                .addComponent(lblName)
                .addGap(255, 255, 255)
                .addComponent(lblUser)
                .addGap(190, 190, 190)
                .addComponent(lblOption)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                .addComponent(lblStatus)
                .addGap(84, 84, 84))
        );
        pnlTitleLayout.setVerticalGroup(
            pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTitleLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnlTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumber)
                    .addComponent(lblName)
                    .addComponent(lblUser)
                    .addComponent(lblStatus)
                    .addComponent(lblOption))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator2.setBackground(new java.awt.Color(199, 199, 199));
        jSeparator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        pnlListSong.setBackground(new java.awt.Color(36, 36, 36));
        pnlListSong.setLayout(new java.awt.GridBagLayout());
        jScrollPane1.setViewportView(pnlListSong);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                            .addGap(1202, 1202, 1202))
                        .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 598, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 807, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cboSongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSongActionPerformed
        // TODO add your handling code here:
        if (cboSong.getSelectedIndex() == 0) {
            fillTableNotAllowedSong();
        } else if (cboSong.getSelectedIndex() == 1) {
            fillTable();
        }
    }//GEN-LAST:event_cboSongActionPerformed

    private void cboSongItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboSongItemStateChanged
        // TODO add your handling code here:
        if (cboSong.getSelectedIndex() == 0) {
            fillTableNotAllowedSong();
        } else if (cboSong.getSelectedIndex() == 1) {
            fillTable();
        }
    }//GEN-LAST:event_cboSongItemStateChanged

    public void fillPnlListSong(Song song, Integer index) {
        // Fill pnlListSongDetails

        int position = pnlListSong.getComponentCount();

        GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = position;
        addSongToPnlListSong(song, gridBagConstraints, index);

        // 4 dòng dưới để khiến cho panel có height của các components nằm bên trong
        pnlListSong.setPreferredSize(null);
        pnlListSong.setMaximumSize(new Dimension(pnlListSong.getMaximumSize().width, pnlListSong.getPreferredSize().height));
        pnlListSong.validate();
        pnlListSong.repaint();

        pnlListSong.setOpaque(true);
        pnlListSong.setBackground(new Color(0, 0, 0, 255));

        // set height của scroll pane 
        jScrollPane1.setPreferredSize(new Dimension(pnlListSong.getMaximumSize().width, 320));
        jScrollPane1.setVerticalScrollBar(new ScrollBarCustom());

        jScrollPane1.setOpaque(false);
        jScrollPane1.setBackground(new Color(0, 0, 0, 255));
    }

    public void addSongToPnlListSong(Song song, GridBagConstraints gridBagConstraints, Integer index) {
        ListSongItemAddSongPanel listSongItemAddSongPanel = new ListSongItemAddSongPanel(song);
        listSongItemAddSongPanel.getLblPosition().setText(String.valueOf(gridBagConstraints.gridy+1));
        if (index == 0) {
            listSongItemAddSongPanel.getLblEdit().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    updateSong(song);
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    setCursor(new Cursor(Cursor.HAND_CURSOR));
                    listSongItemAddSongPanel.getLblEdit().setForeground(new Color(165, 43, 168));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                    listSongItemAddSongPanel.getLblEdit().setForeground(Color.white);
                }

            });
        } else {
            listSongItemAddSongPanel.getLblEdit().setVisible(false);
            listSongItemAddSongPanel.getjSeparator1().setVisible(false);
        }

        listSongItemAddSongPanel.getLblDelete().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                deleteSong(song, index);
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                setCursor(new Cursor(Cursor.HAND_CURSOR));
                listSongItemAddSongPanel.getLblDelete().setForeground(new Color(165, 43, 168));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
                listSongItemAddSongPanel.getLblDelete().setForeground(Color.white);
            }

        });
        pnlListSong.add(listSongItemAddSongPanel, gridBagConstraints);
    }

    public void deleteSong(Song song, Integer index) {
        if (MsgBox.confirm(this, "Bạn thực sự muốn xóa yêu cầu này? Có rất là nhiều người sẽ muốn thưởng thức nó")) {
            try {
                sdao.delete(song.getSongID());
                if (index == 0) {
                    this.fillTableNotAllowedSong();
                }else{
                    this.fillTable();
                }
                MsgBox.alert(this, "Xóa thành công!");
            } catch (HeadlessException e) {
                MsgBox.alert(this, "Xóa thất bại!");
                e.printStackTrace();
            }
        }
    }

    public void updateSong(Song song) {
        try {
            song.setStatus(true);
            sdao.update(song);
            this.fillTableNotAllowedSong();
            MsgBox.alert(this, "Duyệt thành công!");
        } catch (HeadlessException e) {
            MsgBox.alert(this, "Duyệt thất bại!");
            e.printStackTrace();
        }
    }

    public void fillTableNotAllowedSong() {
        pnlListSong.removeAll();
        try {
            songList = (ArrayList<Song>) sdao.selectAllSongNotAllowed();
            for (Song song : songList) {
                System.out.println(song.toString());
                fillPnlListSong(song, 0);
            }
            repaint();
            revalidate();
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }

    }

    public void fillTable() {
        pnlListSong.removeAll();
        try {
            songList = (ArrayList<Song>) sdao.selectAll();
            for (Song song : songList) {
                System.out.println(song.toString());
                fillPnlListSong(song, 1);
            }
            repaint();
            revalidate();
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu!");
            e.printStackTrace();
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboSong;
    private AdminToolUtils.ComboBoxPanel comboBoxPanel1;
    private AdminToolUtils.FindTextField findTextField2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNumber;
    private javax.swing.JLabel lblOption;
    private javax.swing.JLabel lblStatus;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPanel pnlListSong;
    private javax.swing.JPanel pnlTitle;
    // End of variables declaration//GEN-END:variables
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package swing;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

/**
 *
 * @author NGUYEN VAN SI
 */
public class lyricItem extends javax.swing.JPanel {

    /**
     * Creates new form lyricItem
     */
    public lyricItem(String text) {
        initComponents();
        this.setBackground(new Color(67, 67, 67));
        lblLyricItem.setText(text);
    }

    public JLabel getLblLyricItem() {
        return lblLyricItem;
    }

    public void setLblLyricItem(JLabel lblLyricItem) {
        this.lblLyricItem = lblLyricItem;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLyricItem = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1283, 80));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        lblLyricItem.setFont(new java.awt.Font("Segoe UI", 0, 28)); // NOI18N
        lblLyricItem.setForeground(new java.awt.Color(255, 255, 255));
        lblLyricItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLyricItem.setText("Mùa thu mang giấc mơ quay về");
        lblLyricItem.setPreferredSize(new java.awt.Dimension(342, 80));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLyricItem, javax.swing.GroupLayout.DEFAULT_SIZE, 1283, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblLyricItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        this.setBackground(new Color(98, 66, 96));
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        this.setBackground(new Color(67, 67, 67));
    }//GEN-LAST:event_formMouseExited



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblLyricItem;
    // End of variables declaration//GEN-END:variables
}
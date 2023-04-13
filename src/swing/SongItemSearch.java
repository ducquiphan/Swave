package swing;

import javax.swing.JLabel;
import entity.Song;
import components.borderImage;
import javax.swing.ImageIcon;

/**
 *
 * @author NGUYEN VAN SI
 */
public class SongItemSearch extends javax.swing.JPanel {

    /**
     * Creates new form PlaylistItem
     */
    Song data;
    
    public SongItemSearch(Song data) {
        this.data = data;
        initComponents();
        setOpaque(false);
        lblAVT.setIcon(new ImageIcon(getClass().getResource("/img/song/"+data.getAVT())));
        lblSongName.setText(data.getNameSong());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAVT = new components.borderImage();
        lblSongName = new javax.swing.JLabel();

        setOpaque(false);
        setPreferredSize(new java.awt.Dimension(256, 300));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAVT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAVTMouseClicked(evt);
            }
        });
        add(lblAVT, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 11, 220, 220));

        lblSongName.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSongName.setForeground(new java.awt.Color(253, 178, 255));
        lblSongName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSongName.setText("Playlist name");
        lblSongName.setPreferredSize(new java.awt.Dimension(151, 29));
        add(lblSongName, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblAVTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAVTMouseClicked
       
    }//GEN-LAST:event_lblAVTMouseClicked

    public Song getData() {
        return data;
    }

    public void setData(Song data) {
        this.data = data;
    }

    public borderImage getLblAVT() {
        return lblAVT;
    }

    public void setLblAVT(borderImage lblAVT) {
        this.lblAVT = lblAVT;
    }

    public JLabel getLblSongName() {
        return lblSongName;
    }

    public void setLblSongName(JLabel setLblSongName) {
        this.lblSongName = setLblSongName;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.borderImage lblAVT;
    private javax.swing.JLabel lblSongName;
    // End of variables declaration//GEN-END:variables
}

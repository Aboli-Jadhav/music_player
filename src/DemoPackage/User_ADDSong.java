/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPackage;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class User_ADDSong extends javax.swing.JFrame {

    /**
     * Creates new form User_ADDSong
     */
    User_pathGetter pg=new User_pathGetter();
    public User_ADDSong() {
        initComponents();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        add_song_list = new javax.swing.JList<String>();
        add_song = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(153, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 9, 76));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("   ADD SONG");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 153), new java.awt.Color(0, 0, 153)));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 864, 39);

        try{
            pg.demo();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        add_song_list.setModel(pg.listmodel);
        add_song_list.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153)));
        add_song_list.setFont(new java.awt.Font("Times New Roman", 3, 16)); // NOI18N
        add_song_list.setForeground(new java.awt.Color(10, 100, 109));
        add_song_list.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(add_song_list);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 56, 864, 429);

        add_song.setBackground(new java.awt.Color(153, 137, 211));
        add_song.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        add_song.setForeground(new java.awt.Color(0, 0, 153));
        add_song.setText("ADD SONG");
        add_song.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add_song.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_songActionPerformed(evt);
            }
        });
        getContentPane().add(add_song);
        add_song.setBounds(723, 496, 151, 48);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DemoPackage/arrow.png"))); // NOI18N
        jLabel2.setText("BACK");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 153, 255), 2));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 496, 130, 48);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DemoPackage/beat-153442_1280.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 880, 560);

        setBounds(0, 0, 900, 601);
    }// </editor-fold>//GEN-END:initComponents

    private void add_songActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_songActionPerformed
        try {
            String usernm=LoginUser.getData();
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abmusicplayerdb","root","");
            String songnm=add_song_list.getSelectedValue();
            String qry="Insert into "+usernm.toLowerCase()+" (SongNames) values (?) ";
            PreparedStatement ps=con.prepareStatement(qry);
            ps.setString(1, songnm);
            int rs=ps.executeUpdate();
            if(rs>0)
            {
                JOptionPane.showMessageDialog(null, "Song Added Successfullly!!");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Failed to add Song  !!");               
            }
            
        } 
        catch (ClassNotFoundException ex)
        {
            Logger.getLogger(User_ADDSong.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(User_ADDSong.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_add_songActionPerformed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        this.dispose();
        new UserLoginWindow().setVisible(true);
        
    }//GEN-LAST:event_jLabel2MouseReleased

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_song;
    private javax.swing.JList<String> add_song_list;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPackage;

import java.awt.SystemColor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class forgot_password_Frame extends javax.swing.JFrame {

    /**
     * Creates new form forgot_password_Frame
     */
    String pass;
    demoCheckUserName ck=new demoCheckUserName();

    public forgot_password_Frame() {
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
        jLabel2 = new javax.swing.JLabel();
        username_txt = new javax.swing.JTextField();
        btn_get_Password = new javax.swing.JButton();
        lbl_msg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 60)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("FORGOT PASSWORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(100, 38, 615, 110);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Select UserName :");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(170, 189, 162, 30);

        username_txt.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        username_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                username_txtActionPerformed(evt);
            }
        });
        getContentPane().add(username_txt);
        username_txt.setBounds(380, 190, 230, 30);

        btn_get_Password.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn_get_Password.setForeground(new java.awt.Color(0, 51, 102));
        btn_get_Password.setText("GET YOUR PASSWORD");
        btn_get_Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_get_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_get_PasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btn_get_Password);
        btn_get_Password.setBounds(250, 260, 220, 40);

        lbl_msg.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lbl_msg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(lbl_msg);
        lbl_msg.setBounds(44, 364, 690, 60);

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DemoPackage/arrow.png"))); // NOI18N
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(10, 10, 60, 30);

        setBounds(0, 0, 816, 539);
    }// </editor-fold>//GEN-END:initComponents

    private void username_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_username_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_username_txtActionPerformed

    private void btn_get_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_get_PasswordActionPerformed
        try 
        {
            // TODO add your handling code here:
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/abmusicplayerdb", "root", "");
            String unm=username_txt.getText();
            String qry="Select Password,VerifyCode from userlogin where UserName=? ";
            PreparedStatement stmt=con.prepareStatement(qry);
            stmt.setString(1, unm);
            ResultSet rs=stmt.executeQuery(); 
            try{
            if(username_txt.getForeground()!=SystemColor.controlShadow)
            {
                rs.next();
                int vc=rs.getInt("VerifyCode");
                if(vc==1)
                {
                    pass=rs.getString("Password");
                    if(pass!=null)
                    {
                        lbl_msg.setText("Password : "+pass);
                    }
                    else
                    {
                        lbl_msg.setText("Error Occrued !!");
                    }
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "User is not Verified !!");
                }
            }
            
            }catch(Exception e)
            {
                if(username_txt.getText().isEmpty())
                {
                                    JOptionPane.showMessageDialog(null, "Enter username");
                }
                else
                {
                    JOptionPane.showMessageDialog(null, "UserName is not Registered!!");
                }
            }
            
            
            
           
            
            
        } 
        catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(forgot_password_Frame.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(forgot_password_Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_get_PasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new LoginUser().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_get_Password;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel lbl_msg;
    private javax.swing.JTextField username_txt;
    // End of variables declaration//GEN-END:variables
}

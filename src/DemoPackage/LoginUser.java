/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemoPackage;

import com.mysql.jdbc.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author DELLCross
 */
public class LoginUser extends javax.swing.JFrame {

    /**
     * Creates new form LoginUser
     */
    demoCheckUserName1 db=new demoCheckUserName1();
    public static String pass;
    public static String unm;
    public LoginUser() {
        initComponents();
    }

    public static   String getData()
    {
        System.out.print(unm);
        return unm;
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
        txt_usernm = new javax.swing.JTextField();
        txt_usrepass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btn_reset = new javax.swing.JButton();
        btn_login = new javax.swing.JButton();
        lbl_register = new javax.swing.JLabel();
        lbl_forgot_pass = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("UserName");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 160, 161, 35);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Password");
        jLabel2.setToolTipText("password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 250, 161, 36);

        txt_usernm.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        txt_usernm.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usernm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernmActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usernm);
        txt_usernm.setBounds(530, 160, 180, 35);

        txt_usrepass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        txt_usrepass.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_usrepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usrepassActionPerformed(evt);
            }
        });
        getContentPane().add(txt_usrepass);
        txt_usrepass.setBounds(530, 250, 180, 36);

        jLabel3.setBackground(new java.awt.Color(204, 204, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 3, 40)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USER LOGIN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 4, 1020, 50);

        btn_reset.setBackground(new java.awt.Color(153, 153, 255));
        btn_reset.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(51, 51, 255));
        btn_reset.setText("RESET");
        btn_reset.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        getContentPane().add(btn_reset);
        btn_reset.setBounds(290, 340, 100, 36);

        btn_login.setBackground(new java.awt.Color(153, 153, 255));
        btn_login.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        btn_login.setForeground(new java.awt.Color(51, 51, 255));
        btn_login.setText("LOGIN");
        btn_login.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 153), 2, true));
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(580, 340, 100, 36);

        lbl_register.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbl_register.setForeground(new java.awt.Color(51, 51, 255));
        lbl_register.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_register.setText("/ REGISTER");
        lbl_register.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_registerMouseReleased(evt);
            }
        });
        getContentPane().add(lbl_register);
        lbl_register.setBounds(690, 340, 125, 35);

        lbl_forgot_pass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        lbl_forgot_pass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_forgot_pass.setText("Forgot Password");
        lbl_forgot_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                lbl_forgot_passMouseReleased(evt);
            }
        });
        getContentPane().add(lbl_forgot_pass);
        lbl_forgot_pass.setBounds(590, 430, 229, 32);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.setBorder(new javax.swing.border.MatteBorder(null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(920, 20, 80, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DemoPackage/user3.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 1030, 590);

        setBounds(0, 0, 1040, 621);
    }// </editor-fold>//GEN-END:initComponents

    public static Connection connectDatabase()
    {
            Connection con=null;

        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
             con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/abmusicplayerdb", "root", "");
                    
        } catch (ClassNotFoundException ex) 
        {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    private void txt_usernmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernmActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        try {
            // TODO add your handling code here:
            PreparedStatement ps;
            ResultSet rs;
            unm=txt_usernm.getText();
            pass=String.valueOf(txt_usrepass.getPassword());
            String qry="SELECT * from userlogin where UserName=? AND Password=?";
            
            ps=connectDatabase().prepareStatement(qry);
            ps.setString(1, unm);
            ps.setString(2, pass);
            rs=ps.executeQuery();
            
            if(unm.equals("")||pass.equals(""))
            {
                JOptionPane.showMessageDialog(null, "Fill all the details!!");
            }
            else if(!db.checkUsername(unm))
            {
                JOptionPane.showMessageDialog(null, "UserName is not Valid!!");
                txt_usernm.setText("");;
                txt_usrepass.setText("");
            }
            else if(rs.next())
            {
                int vc=rs.getInt("VerifyCode");               
                if(vc==1)
                {
                    JOptionPane.showMessageDialog(null,"Successful!!");
                    this.hide();
                    UserLoginWindow ulw=new UserLoginWindow();
                    ulw.setVisible(true);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"User is not Verified!!");

                }
            }
            else
            {
                                System.out.print(unm+" "+pass);

                                JOptionPane.showMessageDialog(null,"FAIL!!");

            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        // TODO add your handling code here:
        txt_usernm.setText("");;
        txt_usrepass.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void txt_usrepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usrepassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usrepassActionPerformed

    private void lbl_registerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_registerMouseReleased
        // TODO add your handling code here:
        this.hide();
        RegisterUser ru=new RegisterUser();
        ru.setVisible(true);
    }//GEN-LAST:event_lbl_registerMouseReleased

    private void lbl_forgot_passMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_forgot_passMouseReleased
        // TODO add your handling code here:
        this.hide();
        forgot_password_Frame p1=new forgot_password_Frame();
        p1.setVisible(true);
    }//GEN-LAST:event_lbl_forgot_passMouseReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new MainFrame().setVisible(true);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lbl_forgot_pass;
    private javax.swing.JLabel lbl_register;
    private javax.swing.JTextField txt_usernm;
    private javax.swing.JPasswordField txt_usrepass;
    // End of variables declaration//GEN-END:variables
}

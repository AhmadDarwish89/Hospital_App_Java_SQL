/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.darwish.hospital.view;

import com.darwish.hospital.db.dao.UserDetailsDao;
import com.darwish.hospital.db.dao.UsersDao;
import com.darwish.hospital.db.type.UsersType;
import com.darwish.hospital.db.vo.UserDetailsVo;
import com.darwish.hospital.db.vo.UsersVo;
import com.darwish.hospital.validation.Validation;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ahmad
 */
public class UsersView extends javax.swing.JFrame {
   public static byte [] imageByte ;
    /**
     * Creates new form UserView
     */
    public UsersView() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        cUserType = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtFirstName = new javax.swing.JTextField();
        txtFatherName = new javax.swing.JTextField();
        txtMobile = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txtImagePath = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("ID");

        jLabel2.setText("User name");

        jLabel3.setText("Password");

        jLabel4.setText("UserType");

        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        cUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "admin", "doctor", "nurse" }));
        cUserType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cUserTypeActionPerformed(evt);
            }
        });

        jLabel5.setText("first Name");

        jLabel6.setText("father Name");

        jLabel7.setText("mobile");

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        jButton4.setText("Choose Image");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUserName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(cUserType, 0, 273, Short.MAX_VALUE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtId, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                    .addComponent(txtMobile))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtImagePath))
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(txtId)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit)
                    .addComponent(txtPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtImagePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFatherName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobile, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void cUserTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cUserTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cUserTypeActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        boolean isTextEmpty = Validation.isEmpty(txtId.getText(),txtFirstName.getText(),txtFatherName.getText(),txtPassword.getText(),txtUserName.getText(),txtMobile.getText());
        boolean isEmpty =Validation.isEmpty(cUserType.getSelectedIndex());
        boolean isDigit =Validation.isDigit(txtId.getText(),txtMobile.getText(),txtPassword.getText());
        boolean isText = Validation.isText(txtUserName.getText(),txtFirstName.getText(),txtFatherName.getText());
        if(isTextEmpty ==true || isEmpty==true){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
            return; 
        }
        if (isDigit ==false|| isText ==false){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
             return;
        }
        int id =Integer.valueOf(txtId.getText());
        String userName =txtUserName.getText();
        String Password =txtPassword.getText();
        UsersType usersType =UsersType.getUserTypeByType(cUserType.getSelectedItem().toString().toLowerCase());
        UsersVo usersVo =new UsersVo();
        usersVo.setId(id);
        usersVo.setUsername(userName);
        usersVo.setPassword(Password);
        
        usersVo.setUserTYpe(usersType);
        
        String firstName =txtFirstName.getText();
        String fatherName =txtFatherName.getText();
        String mobile = txtMobile.getText();
        UserDetailsVo userDetailsVo =new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        userDetailsVo.setFirstName(firstName);
        userDetailsVo.setFatherName(fatherName);
        userDetailsVo.setMobile(mobile);
        userDetailsVo.setImage(imageByte);
        try{
            //int usersCount = UsersDao.getInstance().insert(usersVo);
            int Count = UserDetailsDao.getInstance().insert(userDetailsVo);
            if(Count==1){
                JOptionPane.showMessageDialog(null,"Insert Successfully");
                reset();
            } else { 
                JOptionPane.showMessageDialog(null, "Insert Not Successfully");
                JOptionPane.showMessageDialog(null, "hhhhhhh");
            }
        } catch (Exception ex){
         JOptionPane.showMessageDialog(null, "catch");}
          
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFatherNameActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        boolean isTextEmpty = Validation.isEmpty(txtId.getText());
         boolean isDigit =Validation.isDigit(txtId.getText());
        if(isTextEmpty ==true ){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
            return; 
        }
        if (isDigit ==false){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
            return;
        }
        int id =Integer.valueOf(txtId.getText());
        UsersVo usersVo =new UsersVo();
        usersVo.setId(id);
   
        UserDetailsVo userDetailsVo =new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        try{
            UsersVo uv = UsersDao.getInstance().getDataById(id);
            if (uv==null){
                JOptionPane.showMessageDialog(null,"Please Enter Valid ID");
                return;
                
            }
            int Count = UserDetailsDao.getInstance().delete(userDetailsVo);
            if(Count==1){
                JOptionPane.showMessageDialog(null,"Delete Successfully");
                reset();
            } else { 
                JOptionPane.showMessageDialog(null, "Delete Not Successfully");
            }
        } catch (Exception ex){}
        
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        boolean isTextEmpty = Validation.isEmpty(txtId.getText());
        boolean isDigit =Validation.isDigit(txtId.getText());
        if(isTextEmpty ==true){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
            return; 
        }
        if (isDigit ==false){
            JOptionPane.showMessageDialog(null, "Please Enter Valid Data");
            return;
        }
        int id =Integer.valueOf(txtId.getText());
        String userName =txtUserName.getText();
        String Password =txtPassword.getText();
        UsersType usersType =UsersType.getUserTypeByType(cUserType.getSelectedItem().toString().toLowerCase());
        UsersVo usersVo =new UsersVo();
        usersVo.setId(id);
        usersVo.setUsername(userName);
        usersVo.setPassword(Password);
        
        usersVo.setUserTYpe(usersType);
        
        String firstName =txtFirstName.getText();
        String fatherName =txtFatherName.getText();
        String mobile = txtMobile.getText();
        UserDetailsVo userDetailsVo =new UserDetailsVo();
        userDetailsVo.setUsersVo(usersVo);
        userDetailsVo.setFirstName(firstName);
        userDetailsVo.setFatherName(fatherName);
        userDetailsVo.setMobile(mobile);
        
        try{
             int Count = UserDetailsDao.getInstance().update(userDetailsVo);
           
            if(Count==1){
                JOptionPane.showMessageDialog(null,"Update Successfully");
                reset();
            } else { 
                JOptionPane.showMessageDialog(null, "Update Not Successfully");
            }
        } catch (Exception ex){}
        
        {}
        
          

    }//GEN-LAST:event_btnEditActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       JFileChooser jfilechooser = new JFileChooser();
       jfilechooser.showOpenDialog(null);
       File file = jfilechooser.getSelectedFile();
       String ImagePath = file.getAbsolutePath();
       txtImagePath.setText(ImagePath);
       try{
           File file2= new File (ImagePath);
           FileInputStream fis= new FileInputStream(file2);
           ByteArrayOutputStream baos= new ByteArrayOutputStream();
           byte[] length = new byte[1024];
           for (int i ;(i=fis.read(length))!=-1;){
           baos.write(length,0,i);
             }
           imageByte=baos.toByteArray();
       }
       catch(Exception ex){}
           
      
    }//GEN-LAST:event_jButton4ActionPerformed
    protected void reset(){
        txtId.setText("");
        txtUserName.setText("");
        txtFirstName.setText("");
        txtPassword.setText("");
        txtFatherName.setText("");
        txtMobile.setText("");
        cUserType.setSelectedIndex(-1);
        txtImagePath.setText("");
    }
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
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsersView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsersView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JComboBox<String> cUserType;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtImagePath;
    private javax.swing.JTextField txtMobile;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}

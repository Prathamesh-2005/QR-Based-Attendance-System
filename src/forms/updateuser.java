/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import dao.connectionprovider;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import utility.BDutility;
import java.sql.Connection;
import java.sql.ConnectionBuilder;
import java.sql.*;
import java.sql.Statement;
import java.util.Objects;
import javax.swing.JDialog;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author venne
 */
public class updateuser extends javax.swing.JFrame {

    /**
     * Creates new form updateuser
     */
    String uniqueReq = null;
String existingImageName = null;
BufferedImage originalImage = null;
File selectedFile = null;
    public updateuser() {
        initComponents();
        this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.white));
        BDutility.setImage(this,"images/blackb.jpeg",1000,700);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        radiomale = new javax.swing.JRadioButton();
        radiofemale = new javax.swing.JRadioButton();
        txtemail = new javax.swing.JTextField();
        txtcontact = new javax.swing.JTextField();
        txtaddress = new javax.swing.JTextField();
        txtstate = new javax.swing.JTextField();
        txtcountry = new javax.swing.JTextField();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        lblimage = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        exit.setText("x");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Update");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gender");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Contact");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("State");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Country");

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        radiomale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radiomale.setForeground(new java.awt.Color(255, 255, 255));
        radiomale.setText("Male");
        radiomale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiomaleItemStateChanged(evt);
            }
        });
        radiomale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiomaleActionPerformed(evt);
            }
        });

        radiofemale.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        radiofemale.setForeground(new java.awt.Color(255, 255, 255));
        radiofemale.setText("Female");
        radiofemale.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                radiofemaleItemStateChanged(evt);
            }
        });
        radiofemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiofemaleActionPerformed(evt);
            }
        });

        txtemail.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtcontact.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtaddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtaddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaddressActionPerformed(evt);
            }
        });

        txtstate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtcountry.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jInternalFrame1.setVisible(true);

        lblimage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblimageMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jInternalFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        search.setText("Search");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(103, 103, 103)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(radiomale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(49, 49, 49)
                                    .addComponent(radiofemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(34, 34, 34)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(348, 348, 348)
                .addComponent(exit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(exit))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jInternalFrame1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Clear)
                            .addComponent(update)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiomale)
                            .addComponent(radiofemale))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtcountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
      dispose();
    }//GEN-LAST:event_exitActionPerformed

    private void radiomaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiomaleItemStateChanged
        // TODO add your handling code here:
        if(radiomale.isSelected()){
            radiofemale.setSelected(false);
        }

    }//GEN-LAST:event_radiomaleItemStateChanged

    private void radiomaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiomaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiomaleActionPerformed

    private void radiofemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiofemaleActionPerformed
        // TODO add your handling code here:
        if(radiofemale.isSelected()){
            radiomale.setSelected(false);
        }
    }//GEN-LAST:event_radiofemaleActionPerformed
     
    private void lblimageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblimageMouseClicked
        // TODO add your handling code here:
        JDialog dialog = new JDialog();
dialog.setUndecorated(true);
dialog.setSize(600, 400);
JFileChooser fileChooser = new JFileChooser();
FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG Images", "jpg");
fileChooser.setFileFilter(filter);
fileChooser.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
if (e.getActionCommand().equals(JFileChooser.APPROVE_SELECTION)) {
selectedFile = fileChooser.getSelectedFile();
try {
originalImage = ImageIO.read(selectedFile);
int originalWidth = originalImage.getWidth();
int originalHeight = originalImage.getHeight();
int labelWidth = lblimage.getWidth();
int labelHeight = lblimage.getHeight();
double scaleX = (double) labelWidth / originalWidth;
double scaleY = (double) labelHeight / originalHeight;
double scale = Math.min(scaleX, scaleY);
int scaledWidth = (int) (originalWidth * scale);
int scaledHeight = (int) (originalHeight * scale);
Image scaledImage = originalImage.getScaledInstance(scaledWidth, scaledHeight, Image.SCALE_SMOOTH);
ImageIcon icon = new ImageIcon(scaledImage);
lblimage.setIcon(icon);
} catch (IOException ex) {
ex.printStackTrace();
}
}
dialog.dispose();
}
});
   dialog.add(fileChooser);
   dialog.setLocationRelativeTo(this);
   dialog.setVisible(true);
    }//GEN-LAST:event_lblimageMouseClicked
   String uniquereg=null;
   
    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
      String email = txtemail.getText().trim();
      String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
       if (!email.matches (emailRegex)) 
       { 
           JOptionPane.showMessageDialog(null, "Invalid Email", "Invalid", JOptionPane. ERROR_MESSAGE);
       return;
     }
     try {
      Connection con = connectionprovider.getcon();
      Statement st = con.createStatement();
     ResultSet rs = st.executeQuery("select * from userdetails where email='" + email + "'");
    if (rs.next()) {
       txtname.setText(rs.getString("name"));
if (rs.getString("gender").equalsIgnoreCase("Male")) {
radiomale.setSelected(true);
radiofemale.setSelected(false);
} else {
radiofemale.setSelected(true);
radiomale.setSelected(false);
}
txtcontact.setText(rs.getString("contact"));
txtaddress.setText(rs.getString("address"));
txtstate.setText(rs.getString("state"));
txtcountry.setText(rs.getString("country"));
uniquereg = rs.getString("uniqueregid");
String imageNameDB = rs.getString("imagename");
existingImageName = Objects.isNull(imageNameDB) || imageNameDB.isEmpty() ? null : imageNameDB;
if (!Objects.isNull(existingImageName)) {
String imagePath = BDutility.getPath("images" + File.separator + existingImageName);
File imageFile = new File(imagePath);
if (imageFile.exists()) {
ImageIcon icon = new ImageIcon(imagePath);
Image image = icon.getImage().getScaledInstance(322, 286, Image.SCALE_SMOOTH);
ImageIcon resizeIcon = new ImageIcon(image);
lblimage.setIcon(resizeIcon);
} else {
lblimage.setIcon(null);
}
}else {
lblimage.setIcon(null);
}
} 
else {
JOptionPane.showMessageDialog(null, "Email not found.", "Not Found", JOptionPane. WARNING_MESSAGE);
}
     }catch(Exception ex){
         ex.printStackTrace();
         JOptionPane.showMessageDialog(null,ex);
     }

       
  
    }//GEN-LAST:event_searchActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        clearForm();

    }//GEN-LAST:event_ClearActionPerformed
  private void clearForm(){
      txtname.setText("");
txtemail.setText("");
txtcontact.setText("");
txtaddress.setText("");
txtstate.setText("");
txtcountry.setText("");
radiomale.setSelected(false);
radiofemale.setSelected(false);
lblimage.setIcon(null);
  }
    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        try {
String name = txtname.getText().toString();
String gender = "";
if (radiomale.isSelected()){
gender = "Male";
} else if (radiofemale.isSelected()) {
gender = "Female";
}
String email = txtemail.getText().toString();
String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
if (!email.matches(emailRegex)) {
    JOptionPane.showMessageDialog(null, "Invalid Email", "Invalid", JOptionPane.ERROR_MESSAGE);
    return;
}

String contact = txtcontact.getText().toString();
String contactRegex = "^\\d{10}$";
if (!contact.matches(contactRegex)) {
    JOptionPane.showMessageDialog(null, "Invalid contact number.", "Invalid", JOptionPane.ERROR_MESSAGE);
    return;
}
String address = txtaddress.getText().toString();
String state = txtstate.getText().toString();
String country = txtcountry.getText().toString();
if (name.isEmpty() || email.isEmpty() || contact.isEmpty() || address.isEmpty() || state.isEmpty() || country.isEmpty() || gender.isEmpty()) {
JOptionPane.showMessageDialog(null, "One or more fields are empty.", "Field Empty", JOptionPane.WARNING_MESSAGE);
return;
}
Connection connection = connectionprovider.getcon();
try {
    Statement st = connection.createStatement();
    ResultSet rs = st.executeQuery("select * from userdetails where email = '" + email + "'");
    if (!rs.next()) {
        JOptionPane.showMessageDialog(null, "Email not found.", "Not Found", JOptionPane.INFORMATION_MESSAGE);
        return;
    }
} catch (Exception ex) {
    JOptionPane.showMessageDialog(null, ex);
}
String imageName = saveImage(email);

String updateQuery;
if (imageName != null) {
updateQuery = "UPDATE userdetails SET name=?, gender=?, contact=?, address=?, state=?, country=?, imagename=? where uniqueregid=?";
} else {
updateQuery = "UPDATE userdetails SET name=?, gender=?, contact=?, address=?, state=?, country=? where uniqueregid=?";
}
PreparedStatement preparedStatement = connection.prepareStatement(updateQuery);
preparedStatement.setString(1, name);
preparedStatement.setString(2, gender);
preparedStatement.setString(3, contact);
preparedStatement.setString(4, address);
preparedStatement.setString(5, state);
preparedStatement.setString(6, country);
if (imageName != null) {
preparedStatement.setString(7, imageName);
preparedStatement.setString(8, uniquereg);
} else {
preparedStatement.setString(7, uniquereg);
}
preparedStatement.executeUpdate();
JOptionPane.showMessageDialog(null, "User Updated Successfully.", "Confirmation", JOptionPane.INFORMATION_MESSAGE);
clearForm();
        }catch (Exception ex) {
ex.printStackTrace();
}
    }//GEN-LAST:event_updateActionPerformed
private String saveImage(String email) {
    if (originalImage != null && selectedFile != null) {
        try {
            String savePath = BDutility.getPath("images\\");
            String extension = BDutility.getFileExtension(selectedFile.getName());
            String imageName = email + "." + extension;
            File saveFile = new File(savePath + imageName);
            BufferedImage scaledImage = BDutility.scaleImage(originalImage, ImageIO.read(selectedFile));
            ImageIO.write(scaledImage, extension, saveFile);
            return imageName;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    return null;
}
    private void txtaddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaddressActionPerformed

    private void radiofemaleItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_radiofemaleItemStateChanged
        // TODO add your handling code here:
        if(radiomale.isSelected()){
            radiofemale.setSelected(false);
        }
    }//GEN-LAST:event_radiofemaleItemStateChanged

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
            java.util.logging.Logger.getLogger(updateuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(updateuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(updateuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(updateuser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new updateuser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton exit;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblimage;
    private javax.swing.JRadioButton radiofemale;
    private javax.swing.JRadioButton radiomale;
    private javax.swing.JButton search;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtcountry;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstate;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}

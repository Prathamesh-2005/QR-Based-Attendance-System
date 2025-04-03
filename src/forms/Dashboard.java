/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package forms;

import java.awt.Color;
import utility.BDutility;
import javax.swing.JOptionPane;
import javax.swing.BorderFactory;

/**
 *
 * @author venne
 */
public class Dashboard extends javax.swing.JFrame {

    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        BDutility.setImage(this,"images/blackb.jpg", 1366, 768);
       this.getRootPane().setBorder(BorderFactory.createMatteBorder(4,4,4,4,Color.white));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        register = new javax.swing.JButton();
        view = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        generateqr = new javax.swing.JButton();
        viewqr = new javax.swing.JButton();
        markattendance = new javax.swing.JButton();
        viewattendance = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 768));
        setUndecorated(true);

        register.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        register.setText("Register user");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });

        view.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        view.setText("View user");
        view.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewActionPerformed(evt);
            }
        });

        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setText("Update user");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setText("Delete user");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        generateqr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        generateqr.setText("Generate Qr");
        generateqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateqrActionPerformed(evt);
            }
        });

        viewqr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewqr.setText("View Qr");
        viewqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewqrActionPerformed(evt);
            }
        });

        markattendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        markattendance.setText("Mark Attendance");
        markattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markattendanceActionPerformed(evt);
            }
        });

        viewattendance.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        viewattendance.setText("View Attendance");
        viewattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewattendanceActionPerformed(evt);
            }
        });

        exit.setText("x");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exit)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(register, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                    .addComponent(generateqr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(view, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(viewqr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(145, 145, 145)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(markattendance, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(viewattendance, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(exit)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(register)
                    .addComponent(view)
                    .addComponent(update)
                    .addComponent(delete))
                .addGap(206, 206, 206)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(generateqr)
                    .addComponent(viewqr)
                    .addComponent(markattendance)
                    .addComponent(viewattendance))
                .addContainerGap(452, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void markattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markattendanceActionPerformed
        // TODO add your handling code here:
        BDutility.openForm(MarkingAttendance.class.getSimpleName(), new MarkingAttendance());
    }//GEN-LAST:event_markattendanceActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
      BDutility.openForm(userregistration.class.getSimpleName(), new userregistration());        // TODO add your handling code here:
    }//GEN-LAST:event_registerActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
              BDutility.openForm(updateuser.class.getSimpleName(), new updateuser());        
    }//GEN-LAST:event_updateActionPerformed

    private void viewqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewqrActionPerformed
        // TODO add your handling code here:
          BDutility.openForm(ViewQr.class.getSimpleName(),new ViewQr());
    }//GEN-LAST:event_viewqrActionPerformed

    private void viewattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewattendanceActionPerformed
        // TODO add your handling code here:
        BDutility.openForm(ViewAttendance.class.getSimpleName(),new ViewAttendance());
    }//GEN-LAST:event_viewattendanceActionPerformed

    private void viewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewActionPerformed
        // TODO add your handling code here:
        BDutility.openForm(viewuser.class.getSimpleName(),new viewuser());
    }//GEN-LAST:event_viewActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
         BDutility.openForm(Deleteuser.class.getSimpleName(),new Deleteuser());
    }//GEN-LAST:event_deleteActionPerformed

    private void generateqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateqrActionPerformed
        // TODO add your handling code here:
           BDutility.openForm(GenerateQr.class.getSimpleName(),new GenerateQr());
    }//GEN-LAST:event_generateqrActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_exitActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton exit;
    private javax.swing.JButton generateqr;
    private javax.swing.JButton markattendance;
    private javax.swing.JButton register;
    private javax.swing.JButton update;
    private javax.swing.JButton view;
    private javax.swing.JButton viewattendance;
    private javax.swing.JButton viewqr;
    // End of variables declaration//GEN-END:variables
}

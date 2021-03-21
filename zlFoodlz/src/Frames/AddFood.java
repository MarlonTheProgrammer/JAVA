/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import Manage.FoodManagement;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author sofik
 */
public class AddFood extends javax.swing.JFrame {

   private String name ;
   private String price ;
   
  
   
    public AddFood() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        TableNumber = new javax.swing.JLabel();
        FoodName = new javax.swing.JLabel();
        textFoodname = new javax.swing.JTextField();
        Price = new javax.swing.JLabel();
        textPrice = new javax.swing.JTextField();
        Beginning = new javax.swing.JButton();
        Add = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel.setPreferredSize(new java.awt.Dimension(1000, 600));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableNumber.setBackground(new java.awt.Color(0, 0, 0));
        TableNumber.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        TableNumber.setForeground(new java.awt.Color(255, 255, 255));
        TableNumber.setText("Add Food");
        Panel.add(TableNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 210, 60));

        FoodName.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        FoodName.setForeground(new java.awt.Color(255, 255, 255));
        FoodName.setText("Food Name");
        Panel.add(FoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        textFoodname.setBackground(new java.awt.Color(0, 0, 0));
        textFoodname.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        textFoodname.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(textFoodname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 250, 30));

        Price.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Price.setForeground(new java.awt.Color(255, 255, 255));
        Price.setText("Price");
        Panel.add(Price, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 140, -1));

        textPrice.setBackground(new java.awt.Color(0, 0, 0));
        textPrice.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        textPrice.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(textPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 250, 30));

        Beginning.setBackground(new java.awt.Color(0, 0, 0));
        Beginning.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Beginning.setForeground(new java.awt.Color(255, 255, 255));
        Beginning.setText("Beginning");
        Beginning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeginningActionPerformed(evt);
            }
        });
        Panel.add(Beginning, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));

        Add.setBackground(new java.awt.Color(0, 0, 0));
        Add.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(255, 255, 255));
        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        Panel.add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 390, 130, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        Background.setText("jLabel1");
        Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 0, -1, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BeginningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeginningActionPerformed
        new Beginning().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BeginningActionPerformed

    // Situa el puntero del archivo al final del mismo y escribe en el archivo Menu las comidas.
    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       FoodManagement z = new FoodManagement();
       ClientMenu x = new ClientMenu();
       name = textFoodname.getText();
       price = textPrice.getText();
       try {
           z.setName(name);
           z.setPrice(price);
           z.addMenu();
       } catch (IOException ex) {
           Logger.getLogger(AddFood.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_AddActionPerformed

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
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddFood.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddFood().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Beginning;
    private javax.swing.JLabel FoodName;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Price;
    private javax.swing.JLabel TableNumber;
    private javax.swing.JTextField textFoodname;
    private javax.swing.JTextField textPrice;
    // End of variables declaration//GEN-END:variables
}

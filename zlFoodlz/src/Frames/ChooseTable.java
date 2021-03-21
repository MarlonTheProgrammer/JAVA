package Frames;


import Manage.ClientManagement;
import Manage.TableManagement;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ChooseTable extends javax.swing.JFrame {
    
    Beginning z = new Beginning();
  
    public ChooseTable() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        Table = new javax.swing.JLabel();
        TextTableNumber = new javax.swing.JTextField();
        Choose = new javax.swing.JButton();
        Beginning = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Table.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Table.setForeground(new java.awt.Color(255, 255, 255));
        Table.setText("Table");
        Panel.add(Table, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, -1, -1));

        TextTableNumber.setBackground(new java.awt.Color(0, 0, 0));
        TextTableNumber.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        TextTableNumber.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(TextTableNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 60, 40));

        Choose.setBackground(new java.awt.Color(0, 0, 0));
        Choose.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Choose.setForeground(new java.awt.Color(255, 255, 255));
        Choose.setText("Choose");
        Choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseActionPerformed(evt);
            }
        });
        Panel.add(Choose, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        Beginning.setBackground(new java.awt.Color(0, 0, 0));
        Beginning.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        Beginning.setForeground(new java.awt.Color(255, 255, 255));
        Beginning.setText("Beginning");
        Beginning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeginningActionPerformed(evt);
            }
        });
        Panel.add(Beginning, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Recupera  el numero de la compra, las ordenes realizadas y el valor total a pagar.
    private void ChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseActionPerformed
        TableManagement x = new TableManagement();
        ClientManagement h = new ClientManagement();
        String table = TextTableNumber.getText();
        String purchase = h.getPurchase();
        ClientMenu.table = table;
        if (x.comproveTable(table)==1) {
            try {
                h.searchTable(table); // Recupera los datos del cliente y returna 1 si la mesa se encuentra ocupada, 0 si de lo contrario no hay clientes.
                ClientMenu.clientName = h.getName(); 
                int purchaseNumber = Integer.parseInt(h.getPurchase());
                purchaseNumber++;
                ClientMenu.purchase = Integer.toString(purchaseNumber);
                x.checkBill(); // Recupera las ordenes de comida realizadas.
                x.totalValue(table); // Revisa si el archivo se encuentra vacio, si no es asi, recupera las ordenes de comida y le asigna el valor total.
                new ClientMenu().setVisible(true);
            } catch (IOException ex) {
                Logger.getLogger(ChooseTable.class.getName()).log(Level.SEVERE, null, ex);
            }
                this.dispose();                
        }
        else {
          z.cleanText(Panel);
          JOptionPane.showMessageDialog(null, "The table "+table+" is not occupied");
        }
    }//GEN-LAST:event_ChooseActionPerformed
    
    // Abre el frame Beginning y cierra el frame ChooseTable.
    private void BeginningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeginningActionPerformed
        new Beginning().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BeginningActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(ChooseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChooseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChooseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChooseTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChooseTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Beginning;
    private javax.swing.JButton Choose;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel Table;
    private javax.swing.JTextField TextTableNumber;
    // End of variables declaration//GEN-END:variables

}

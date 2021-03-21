
package Frames;

import Manage.ClientManagement;
import Manage.FoodManagement;
import Manage.TableManagement;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClientMenu extends javax.swing.JFrame{

    public static String table ;
    public static String dates ;
    public static String purchase;
    public static String clientName;
    public static String totalValue = "0";
    
    
    Beginning c = new Beginning();
    
    public ClientMenu() {
        initComponents();
        TextPurchase.setText(purchase);
        TableNumber.setText("Table "+table);
        TextBill.setText(dates);
        ClientName.setText(clientName);
        TextTotalValue.setText(totalValue);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        FoodName = new javax.swing.JLabel();
        Order = new javax.swing.JButton();
        PrintBill = new javax.swing.JButton();
        PurchaseNumber = new javax.swing.JLabel();
        TextPurchase = new javax.swing.JTextField();
        Beginning = new javax.swing.JButton();
        ChangeTable = new javax.swing.JButton();
        TableNumber = new javax.swing.JLabel();
        ScrollTextBill = new javax.swing.JScrollPane();
        TextBill = new javax.swing.JTextArea();
        Lot = new javax.swing.JLabel();
        TextLot = new javax.swing.JTextField();
        Observation1 = new javax.swing.JLabel();
        TextObservation = new javax.swing.JTextField();
        textFoodName = new javax.swing.JComboBox<>();
        ClientName = new javax.swing.JLabel();
        TextPriceFood = new javax.swing.JTextField();
        PriceFood = new javax.swing.JLabel();
        TotalValue = new javax.swing.JLabel();
        TextTotalValue = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FoodName.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        FoodName.setForeground(new java.awt.Color(255, 255, 255));
        FoodName.setText("Food Name");
        Panel.add(FoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        Order.setBackground(new java.awt.Color(0, 0, 0));
        Order.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Order.setForeground(new java.awt.Color(255, 255, 255));
        Order.setText("Order");
        Order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OrderActionPerformed(evt);
            }
        });
        Panel.add(Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 120, -1));

        PrintBill.setBackground(new java.awt.Color(0, 0, 0));
        PrintBill.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        PrintBill.setForeground(new java.awt.Color(255, 255, 255));
        PrintBill.setText("Print Bill");
        PrintBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintBillActionPerformed(evt);
            }
        });
        Panel.add(PrintBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 530, -1, -1));

        PurchaseNumber.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        PurchaseNumber.setForeground(new java.awt.Color(255, 255, 255));
        PurchaseNumber.setText("Purchase");
        Panel.add(PurchaseNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        TextPurchase.setEditable(false);
        TextPurchase.setBackground(new java.awt.Color(0, 0, 0));
        TextPurchase.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextPurchase.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(TextPurchase, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 250, 30));

        Beginning.setBackground(new java.awt.Color(0, 0, 0));
        Beginning.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Beginning.setForeground(new java.awt.Color(255, 255, 255));
        Beginning.setText("Beginning");
        Beginning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BeginningActionPerformed(evt);
            }
        });
        Panel.add(Beginning, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 540, -1, -1));

        ChangeTable.setBackground(new java.awt.Color(0, 0, 0));
        ChangeTable.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ChangeTable.setForeground(new java.awt.Color(255, 255, 255));
        ChangeTable.setText("Change Table");
        ChangeTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeTableActionPerformed(evt);
            }
        });
        Panel.add(ChangeTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 540, -1, -1));

        TableNumber.setBackground(new java.awt.Color(0, 0, 0));
        TableNumber.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        TableNumber.setForeground(new java.awt.Color(255, 255, 255));
        TableNumber.setText("Table 00");
        Panel.add(TableNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 180, 60));

        TextBill.setEditable(false);
        TextBill.setBackground(new java.awt.Color(0, 0, 0));
        TextBill.setColumns(20);
        TextBill.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextBill.setForeground(new java.awt.Color(255, 255, 255));
        TextBill.setRows(5);
        ScrollTextBill.setViewportView(TextBill);

        Panel.add(ScrollTextBill, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 120, 390, 330));

        Lot.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Lot.setForeground(new java.awt.Color(255, 255, 255));
        Lot.setText("Lot of Food");
        Panel.add(Lot, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 120, -1));

        TextLot.setBackground(new java.awt.Color(0, 0, 0));
        TextLot.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextLot.setForeground(new java.awt.Color(255, 255, 255));
        TextLot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextLotActionPerformed(evt);
            }
        });
        Panel.add(TextLot, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 250, 30));

        Observation1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        Observation1.setForeground(new java.awt.Color(255, 255, 255));
        Observation1.setText("Observation");
        Panel.add(Observation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        TextObservation.setBackground(new java.awt.Color(0, 0, 0));
        TextObservation.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextObservation.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(TextObservation, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 250, 30));

        textFoodName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Pizza", "Hamburguer", "Sausage", "Hotdog", "Taco", "Nuggets", "Cup of Wine", "Soda 300 ml", "Lemonade Glass ", "Coconut lemonade Glass", "Beer Glass", "Natural Juice Glass" }));
        textFoodName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFoodNameActionPerformed(evt);
            }
        });
        Panel.add(textFoodName, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 250, 30));

        ClientName.setBackground(new java.awt.Color(0, 0, 0));
        ClientName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ClientName.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(ClientName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 30, 270, 40));

        TextPriceFood.setEditable(false);
        TextPriceFood.setBackground(new java.awt.Color(0, 0, 0));
        TextPriceFood.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextPriceFood.setForeground(new java.awt.Color(255, 255, 255));
        TextPriceFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextPriceFoodActionPerformed(evt);
            }
        });
        Panel.add(TextPriceFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 250, 30));

        PriceFood.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        PriceFood.setForeground(new java.awt.Color(255, 255, 255));
        PriceFood.setText("Price");
        Panel.add(PriceFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 120, -1));

        TotalValue.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TotalValue.setForeground(new java.awt.Color(255, 255, 255));
        TotalValue.setText("Total Value");
        Panel.add(TotalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 480, 140, -1));

        TextTotalValue.setEditable(false);
        TextTotalValue.setBackground(new java.awt.Color(0, 0, 0));
        TextTotalValue.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        TextTotalValue.setForeground(new java.awt.Color(255, 255, 255));
        Panel.add(TextTotalValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 480, 220, 30));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Background.jpg"))); // NOI18N
        Panel.add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

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
    // Se limpian tanto el cuadro de ordenes como el de valor total, abre el frame Beginning y cierra el frame ClientMenu.
    private void BeginningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BeginningActionPerformed
        dates = "";
        totalValue = "0";
        new Beginning().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BeginningActionPerformed

    // Se limpian tanto el cuadro de ordenes como el de valor total, abre el frame ChooseTable y cierra el frame ClientMenu.
    private void ChangeTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeTableActionPerformed
        dates = "";
        totalValue = "0";
        new ChooseTable().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChangeTableActionPerformed
    
    // Guarda la orden y la muestra con su respectivo valor total.
    private void OrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OrderActionPerformed
        TableManagement z = new TableManagement();  
        FoodManagement h = new FoodManagement();
        String dateFoodName = (String) textFoodName.getSelectedItem(); // Le asigna a la variable dateFoodName lo que se encuentre seleccionado en textFoodName(ComboBox).
        z.setFoodName(dateFoodName);
        z.setLot(TextLot.getText());
        z.setObservation(TextObservation.getText());
        try {
            z.addOrder(table); // Situa el puntero del archivo al final del mismo y escribe en el archivo la orden que se tomo.
            z.checkBill(); // Recupera la orden tomada y se la manda al atributo dates de la clase ClientMenu.
            TextBill.setText(dates); // Le asigna al componente del frame (ClientMenu) TextBill el atributo dates.
            z.totalValue(table); // Revisa si el archivo se encuentra vacio, si no es asi, recupera las ordenes de comida y le asigna el valor total.
            TextTotalValue.setText(totalValue); 
        } catch (IOException ex) {
            Logger.getLogger(ClientMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Vacia los cuadros de texto Price, foodname, lot y observation.
        TextLot.setText("");
        TextObservation.setText("");
        textFoodName.setSelectedIndex(0);
        TextPriceFood.setText(null);
    }//GEN-LAST:event_OrderActionPerformed
    
    // Le suma al numero de compras si se realizo una orden, de lo controrario no y borra el archivo table.
    private void PrintBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintBillActionPerformed
        TableManagement z = new TableManagement();
        try {
            z.payTable();
        } catch (IOException ex) {
            Logger.getLogger(ClientMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        dates = "";
        totalValue = "0";
        this.dispose();
        new Beginning().setVisible(true);
    }//GEN-LAST:event_PrintBillActionPerformed
    
    private void TextLotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextLotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextLotActionPerformed

    private void TextPriceFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextPriceFoodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPriceFoodActionPerformed

    // Muestra la lista de comidas disponibles para seleccionar y su respectivo precio.
    private void textFoodNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFoodNameActionPerformed
        FoodManagement x = new FoodManagement();
        String TextBox = textFoodName.getSelectedItem().toString();
        try {
            x.searchFood(TextBox);
        } catch (IOException ex) {
            Logger.getLogger(ClientMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        TextPriceFood.setText(x.getPrice());
    }//GEN-LAST:event_textFoodNameActionPerformed
    
    public String getTable() {
        return table;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getPurchase() {
        return purchase;
    }
    
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
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientMenu().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton Beginning;
    private javax.swing.JButton ChangeTable;
    private javax.swing.JLabel ClientName;
    private javax.swing.JLabel FoodName;
    private javax.swing.JLabel Lot;
    private javax.swing.JLabel Observation1;
    private javax.swing.JButton Order;
    private javax.swing.JPanel Panel;
    private javax.swing.JLabel PriceFood;
    private javax.swing.JButton PrintBill;
    private javax.swing.JLabel PurchaseNumber;
    private javax.swing.JScrollPane ScrollTextBill;
    private javax.swing.JLabel TableNumber;
    private javax.swing.JTextArea TextBill;
    private javax.swing.JTextField TextLot;
    private javax.swing.JTextField TextObservation;
    private javax.swing.JTextField TextPriceFood;
    private javax.swing.JTextField TextPurchase;
    private javax.swing.JTextField TextTotalValue;
    private javax.swing.JLabel TotalValue;
    private javax.swing.JComboBox<String> textFoodName;
    // End of variables declaration//GEN-END:variables

}

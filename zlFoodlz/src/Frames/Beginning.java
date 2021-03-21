package Frames;

import Manage.ClientManagement;
import Manage.TableManagement;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Beginning extends javax.swing.JFrame {

   
    public Beginning() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new javax.swing.JPanel();
        ChooseTable = new javax.swing.JButton();
        TextIdentificationLogin = new javax.swing.JTextField();
        Login = new javax.swing.JLabel();
        Register = new javax.swing.JButton();
        TextName = new javax.swing.JTextField();
        TextTableNumber = new javax.swing.JTextField();
        SignUp = new javax.swing.JLabel();
        TableNumber = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        IdentificationSign = new javax.swing.JLabel();
        Join = new javax.swing.JButton();
        IdentificationLogin = new javax.swing.JLabel();
        Welcome = new javax.swing.JLabel();
        TextIdentificationSign = new javax.swing.JTextField();
        addFood = new javax.swing.JButton();
        Exit = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ChooseTable.setBackground(new java.awt.Color(0, 0, 0));
        ChooseTable.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        ChooseTable.setForeground(new java.awt.Color(255, 255, 255));
        ChooseTable.setText("Choose Table");
        ChooseTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChooseTableActionPerformed(evt);
            }
        });
        Panel.add(ChooseTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 470, -1, -1));

        TextIdentificationLogin.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Panel.add(TextIdentificationLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 300, 130, -1));

        Login.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        Login.setForeground(new java.awt.Color(255, 255, 255));
        Login.setText("Login");
        Panel.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 210, 110, 60));

        Register.setBackground(new java.awt.Color(204, 0, 0));
        Register.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Register.setForeground(new java.awt.Color(255, 255, 255));
        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        Panel.add(Register, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        TextName.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Panel.add(TextName, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 130, -1));

        TextTableNumber.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Panel.add(TextTableNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, 130, 30));

        SignUp.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("Sign up");
        Panel.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 130, 80));

        TableNumber.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        TableNumber.setForeground(new java.awt.Color(255, 255, 255));
        TableNumber.setText("Table Number");
        Panel.add(TableNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 350, -1, -1));

        Name.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Name.setForeground(new java.awt.Color(255, 255, 255));
        Name.setText("Name");
        Panel.add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 50, 20));

        IdentificationSign.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        IdentificationSign.setForeground(new java.awt.Color(255, 255, 255));
        IdentificationSign.setText("Identification");
        Panel.add(IdentificationSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, 120, 20));

        Join.setBackground(new java.awt.Color(204, 0, 0));
        Join.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        Join.setForeground(new java.awt.Color(255, 255, 255));
        Join.setText("Join");
        Join.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JoinActionPerformed(evt);
            }
        });
        Panel.add(Join, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 420, -1, -1));

        IdentificationLogin.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        IdentificationLogin.setForeground(new java.awt.Color(255, 255, 255));
        IdentificationLogin.setText("Identification");
        Panel.add(IdentificationLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 310, 120, 20));

        Welcome.setFont(new java.awt.Font("Times New Roman", 3, 60)); // NOI18N
        Welcome.setForeground(new java.awt.Color(255, 255, 255));
        Welcome.setText("Welcome");
        Panel.add(Welcome, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 240, 50));

        TextIdentificationSign.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Panel.add(TextIdentificationSign, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 130, 30));

        addFood.setBackground(new java.awt.Color(0, 0, 0));
        addFood.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        addFood.setForeground(new java.awt.Color(255, 255, 255));
        addFood.setText("Add Food");
        addFood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFoodActionPerformed(evt);
            }
        });
        Panel.add(addFood, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 130, 30));

        Exit.setBackground(new java.awt.Color(0, 0, 0));
        Exit.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        Panel.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 30, -1, -1));

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
    // Guarda La identificacion y el nombre de la persona a registrar, se le asigna un numero de compras inicial. 
    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        ClientManagement x = new ClientManagement(); // Instancia una variable de tipo ClientManagement para usar sus metodos o atributos.
        String dateIdentification = TextIdentificationSign.getText(); 
        x.setName(TextName.getText()); 
        x.setIdentification(dateIdentification);
        x.setPurchase("0");
        x.setTableNumber("0");
        try {
            x.addClient(); // ejecuta el metodo addClient de la clase ClientManagement.
        } catch (IOException ex) {
            Logger.getLogger(Beginning.class.getName()).log(Level.SEVERE, null, ex);
        }
        cleanText(Panel); // Limpia el Texto de todos los elementos del Panel.
        TextIdentificationLogin.setText(dateIdentification);        
    }//GEN-LAST:event_RegisterActionPerformed

    // Crea la mesa y se le pasan los datos del numero de compras y nombre del cliente a la clase ClientMenu, ademas de eso comprueba si el cliente se encuentra registrado y si la mesa ya se encuentra ocupada o no,por ultimo avisa si el cliente tiene descuento por tener un cierto numero de compras realizadas.
    private void JoinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JoinActionPerformed
        ClientManagement x = new ClientManagement();
        TableManagement z = new TableManagement();
        String dateTable = TextTableNumber.getText();
        String dateIdentification = TextIdentificationLogin.getText(); 
        try {
            if(comproveLogin()==1){   //// Returna 1 si TextIdentificationLogin y TextTableNumber contienen texto, returna 0 si ambos o alguno de los dos se encuentra vacio.
                if(x.searchClient(dateIdentification)==1){  // Compara la identificacion que se digito con la que se encuentra registrada en el archivo Client.
                  if(z.comproveTable(dateTable)==0){ // returna 1 si el archivo table (numero de mesa con el cual entro) existe, de lo contrario returna 0.
                      z.beginTable(dateTable); // Crea el archivo Table(dateTable).
                      x.modifyTable(dateTable,dateIdentification); //Recorre el archivo y compara el numero de identificacion que entra con el que se encuentra guardado en el archivo para poder asignarle el numero de mesa a la persona.
                      ClientMenu.clientName = x.getName(); // Le asigna al atributo clientName de la clase ClientMenu el atributo name de la clase ClientManagement. 
                      int purchaseNumber = Integer.parseInt(x.getPurchase()); // Convierte de String a entero.
                      purchaseNumber++; // le suma al numero de compras.
                      ClientMenu.purchase = Integer.toString(purchaseNumber); 
                      if (ClientMenu.purchase.equals("5")) JOptionPane.showMessageDialog(null, "You will receive 10% discount in this purchase");
                      ClientMenu.table = dateTable; // Le asigna al atributo table el numero de mesa que se digito (dateTable).
                      new ClientMenu().setVisible(true); // Hace que el frame ClientMenu sea visible.
                      this.dispose(); // Cierra el frame Beginning.
                    }
                    else JOptionPane.showMessageDialog(null, "The table is occupied yet");
                }
                else JOptionPane.showMessageDialog(null, "The client "+TextIdentificationLogin.getText()+" is not registered");
            }
        } catch (IOException ex) {
            Logger.getLogger(Beginning.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_JoinActionPerformed
    
    // Abre el frame ChooseTable y cierra Beginning.
    private void ChooseTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChooseTableActionPerformed
        new ChooseTable().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ChooseTableActionPerformed
    
    // Abre el frame AddFood y cierra Beginning.
    private void addFoodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFoodActionPerformed
        new AddFood().setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_addFoodActionPerformed
    
    // Sale del Programa
    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed
    
    // Limpia todos los campos de texto del frame.
    public void cleanText(JPanel panel){
        for(int i = 0; panel.getComponents().length > i; i++){
            if(panel.getComponents()[i] instanceof JTextField){
                ((JTextField)panel.getComponents()[i]).setText("");
            }
        }
    }
    
    // Returna 1 si ambos campos contienen texto, returna 0 si ambos o alguno de los dos se encuentra vacio.
    public int comproveLogin(){
        if((TextIdentificationLogin.getText().equals(""))||(TextTableNumber.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please complete the fields");
            return 0;
        } 
        return 1;
    }
    
    //Returna 1 si ambos campos contienen texto, returna 0 si ambos o alguno de los dos se encuentra vacio.
    public int comproveSign(){
        if((TextIdentificationSign.getText().equals(""))||(TextName.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Please complete the fields");
            return 0;
        } 
        return 1;
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
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Beginning.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Beginning().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton ChooseTable;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel IdentificationLogin;
    private javax.swing.JLabel IdentificationSign;
    private javax.swing.JButton Join;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Register;
    private javax.swing.JLabel SignUp;
    private javax.swing.JLabel TableNumber;
    private javax.swing.JTextField TextIdentificationLogin;
    private javax.swing.JTextField TextIdentificationSign;
    private javax.swing.JTextField TextName;
    private javax.swing.JTextField TextTableNumber;
    private javax.swing.JLabel Welcome;
    private javax.swing.JButton addFood;
    // End of variables declaration//GEN-END:variables

}

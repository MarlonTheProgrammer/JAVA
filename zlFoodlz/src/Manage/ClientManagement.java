package Manage;

import Frames.ClientMenu;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class ClientManagement {
    private String identification;
    private String name;
    private String purchase;
    private String tableNumber;
    
    String nameFileClient = "Client.dbf";
    RandomAccessFile file;
    
    public ClientManagement(){}
    
    public ClientManagement(String dateIdentification, String dateName, String datePurchase, String dateTableNumber){
        identification = dateIdentification;
        name = dateName;
        purchase = datePurchase;
        tableNumber = dateTableNumber;
    }
    
    // Situa el puntero del archivo al final del mismo y escribe en el archivo la orden que se tomo.
    public void addClient()throws IOException {    
            File fileClient = new File (nameFileClient); 
            file = new RandomAccessFile(nameFileClient, "rw" );
            if (!fileClient.exists())
                fileClient.createNewFile();
            file.seek( file.length() );  
            saveClient();
            file.close();
            JOptionPane.showMessageDialog(null, "Client "+identification+" created successfully");
     }
    // Escribe en el archivo los atributos de la clase ClientManagement.
    public void saveClient() throws IOException {
         file.writeUTF( identification );       
         file.writeUTF( name ); 
         file.writeUTF( purchase );
         file.writeUTF( tableNumber );
   }
    // Returna 1 si la variable que entra es igual a la que se encuentra guardada en el archivo Client.
    public int searchClient(String dateIdentification) throws IOException {  
       File fileClient = new File (nameFileClient);
       boolean flag = false;
       file = new RandomAccessFile(nameFileClient, "rw" );
       if (fileClient.exists()){   
               while (file.getFilePointer() < file.length()){
                   recoverClient(); // Los atributos de la clase ClientManagement toman el valor de lo que se encuentra digitado en el archivo.
                   if (getIdentification().equals(dateIdentification)) flag = true;
                   }
                }
       file.close();
       if (flag) return 1;
        else return 0;
        }
    
    // Recupera los datos del cliente y returna 1 si la mesa se encuentra ocupada, 0 si de lo contrario no hay clientes.
    public int searchTable(String dateTableNumber) throws IOException{
       File fileClient = new File (nameFileClient);
       boolean flag = false;
       file = new RandomAccessFile(nameFileClient, "rw" );
       if (fileClient.exists()){  
               while (!flag && (file.getFilePointer() < file.length())){
                   recoverClient(); //Los atributos de la clase ClientManagement toman el valor de lo que se encuentra digitado en el archivo.
                   if (getTableNumber().equals(dateTableNumber)) flag = true;
                   }
                }
               file.close();
        if (flag) return 1;
        else return 0;
        }
    
    // Entra al archivo Client y le suma 1 al numero de compras.
    public void plusPurchase (String dateIdentification)  throws IOException {
        File fileClient = new File (nameFileClient);
       if (fileClient.exists()) { 
           boolean b = false;    
           long ap;              
           file =  new RandomAccessFile( nameFileClient, "rw" );  
           file.seek(0);       
           while ((!b) && (file.getFilePointer() < file.length())){ 
               ap = file.getFilePointer();
               recoverClient();
               if (getIdentification().equals(dateIdentification)) {
                   int offerNumber = Integer.parseInt(getPurchase());
                   System.out.println(offerNumber);
                   offerNumber++;
                   if(offerNumber == 5){
                       setPurchase("0");                      
                   } 
                   else{ 
                       String offer = Integer.toString(offerNumber);
                       setPurchase(offer);                       
                   }
                   System.out.println(offerNumber);
                   file.seek(ap);
                   saveClient();                   
                   System.out.println(offerNumber);
                   b = true;
                  }
              }
           file.close();
           }
     }
    
    // Entra al archivo Client y le resta 1 al numero de compras.
    public void lessPurchase (String dateIdentification)  throws IOException {
        File fileClient = new File (nameFileClient);
       if (fileClient.exists()) { 
           boolean b = false;    
           long ap;              
           file =  new RandomAccessFile( nameFileClient, "rw" );  
           file.seek(0);       
           while ((!b) && (file.getFilePointer() < file.length())){ 
               ap = file.getFilePointer();
               recoverClient();
               if (getIdentification().equals(dateIdentification)) {
                   int offerNumber = Integer.parseInt(getPurchase());
                       offerNumber--;  
                       String offer = Integer.toString(offerNumber);
                       setPurchase(offer);                        
                   file.seek(ap);
                   saveClient();                   
                   b = true;
                  }
              }
           file.close();
           }
     }
    
    //  Recorre el archivo y compara el numero de identificacion que entra con el que se encuentra guardado en el archivo para poder asignarle el numero de mesa a la persona.
    public void modifyTable(String dateTableNumber, String dateIdentification)throws IOException{
        File fileClient = new File (nameFileClient);
        file =  new RandomAccessFile( nameFileClient, "rw" );
        boolean b = false;    
        long ap; 
       if (fileClient.exists()) {              
           file.seek(0);     
           while ((!b) && (file.getFilePointer() < file.length())){ 
               ap = file.getFilePointer(); // La variable ap toma el valor que contenga el puntero en el archivo.
               recoverClient(); //Los atributos de la clase ClientManagement toman el valor de lo que se encuentra digitado en el archivo.
               if (getIdentification().equals(dateIdentification)) {
                   setTableNumber(dateTableNumber); // Le pone al atributo TableNumber el numero de mesa que se digito.
                   file.seek(ap);    
                   saveClient(); //Escribe en el archivo los atributos de la clase ClientManagement.                   
                   b = true;
                  }
              }
           file.close();  
           }
    }
    
    // Los atributos de la clase ClientManagement toman el valor de lo que se encuentra digitado en el archivo Client.
    public void recoverClient () throws IOException {
         identification = file.readUTF();       
         name = file.readUTF();  
         purchase = file.readUTF();
         tableNumber = file.readUTF();
   }
    
    public String getIdentification() {
        return identification;
    }

    public String getName() {
        return name;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPurchase(String purchase) {
        this.purchase = purchase;
    }

    public String getPurchase() {
        return purchase;
    }

    public String getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(String tableNumber) {
        this.tableNumber = tableNumber;
    }   
}

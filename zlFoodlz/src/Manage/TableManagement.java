package Manage;

import Frames.ClientMenu;
import static Frames.ClientMenu.table;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

public class TableManagement { 
    private  String foodName;
    private  String lot;
    private  String observation;
    
    String nameFileClient = "Client.dbf";
    RandomAccessFile file;
    
    public TableManagement(){}
    
    public TableManagement(String dateFoodName, String dateLot, String dateObservation){
        foodName = dateFoodName;
        lot = dateLot;
        observation = dateObservation;
    }
    
    // Crea el archivo Table.
    public void beginTable(String tableNumber) throws IOException{
        String nameFileTable = "table "+tableNumber+".dbf";
        File fileTable = new File (nameFileTable);
        if (!fileTable.exists()) {
            fileTable.createNewFile();
        }
    }
    
    // Situa el puntero del archivo al final del mismo y escribe en el archivo la orden que se tomo.
    public void addOrder(String tableNumber)throws IOException{
        String nameFileTable = "table "+tableNumber+".dbf";
        file = new RandomAccessFile(nameFileTable, "rw" );
        file.seek( file.length() );  
        saveOrder();
        file.close();
        JOptionPane.showMessageDialog(null, "successful order");
    }
    
    // Le suma al numero de compras si se realizo una orden, de lo controrario no y borra el archivo table.
    public void payTable() throws IOException {
        String nameFileTable = "table "+table+".dbf";        
        ClientManagement k = new ClientManagement();
        String table = ClientMenu.table;
        int total = Integer.parseInt(ClientMenu.totalValue);
        File fileTable = new File (nameFileTable);
        k.searchTable(table); // llama a la funcion buscar mesa con la variable table.
        k.modifyTable("0",k.getIdentification()); // cambia el numero de mesa (lo deja en cero nuevamente).
        if(!ClientMenu.totalValue.equals("0")){
            if(ClientMenu.purchase.equals("5")){
                k.plusPurchase(k.getIdentification());  //Entra al archivo Client y le suma 1 al numero de compras.
                total -= (total*0.1);
                ClientMenu.totalValue = Integer.toString(total);
                JOptionPane.showMessageDialog(null, "You have 10% discount, Total Value : "+ ClientMenu.totalValue);
            }
            else k.plusPurchase(k.getIdentification());
        } 
        if(fileTable.delete()) JOptionPane.showMessageDialog(null, "successful deleted"); //Borra el archivo Table.
    } 
    
    // Escribe en el archivo los atributos de la clase TableManagement.
    public void saveOrder() throws IOException {
         file.writeUTF ( foodName );       
         file.writeUTF( lot );
         file.writeUTF( observation );
   }
    
    // returna 1 si el archivo table (numero de mesa con el cual entro) existe, de lo contrario returna 0.
    public int comproveTable(String tableNumber){
        String nameFileTable = "table "+tableNumber+".dbf";
        File fileTable = new File (nameFileTable);
        if (fileTable.exists()) return 1;
        else return 0;
    }   
    
    // Recupera la orden tomada y se la manda al atributo dates de la clase ClientMenu.
    public void checkBill()  throws IOException {
       ClientMenu x = new ClientMenu();
       String dates = "";
       String nameFileTable = "table "+x.getTable()+".dbf";
       file = new RandomAccessFile( nameFileTable, "r" );
       File fileTable = new File(nameFileTable);
       if (fileTable.exists()){
            file.seek(0);
            while (file.getFilePointer() < file.length()) {
                recoverOrder();
                dates += "Name Food: "+getFoodName()+".\nLot: "+getLot()+".\nObservation: "+getObservation()+".\n-------------------------------\n";
               }
            ClientMenu.dates = dates;
            file.close();
        }     
    }
    
     // Los atributos de la clase TableManagement toman el valor de lo que se encuentra digitado en el archivo Table.
    public void recoverOrder () throws IOException {  
         foodName = file.readUTF();
         lot = file.readUTF();       
         observation = file.readUTF();             
   }
    
    // Revisa si el archivo se encuentra vacio, si no es asi, recupera las ordenes de comida y le asigna el valor total.
    public void totalValue(String dateTableNumber)throws IOException{
        String nameFileTable = "table "+dateTableNumber+".dbf";
        ClientManagement x = new ClientManagement();
        FoodManagement z = new FoodManagement();
        int total = 0;
        file = new RandomAccessFile(nameFileTable, "rw" );
        long size = file.length();
        long zero = 0;
        if (size!=zero){ 
            while (file.getFilePointer() < file.length()){
            recoverOrder();
            String dateFoodName = foodName;
            z.searchFood(dateFoodName); 
            int price = Integer.parseInt(z.getPrice());
            int lotFood = Integer.parseInt(getLot());
            total = total + (price*lotFood);
             } 
        }
        String totalValue = Integer.toString(total);
        ClientMenu.totalValue = totalValue;
        file.close();
    }
    
    // Revisa si el archivo Table se encuentra vacio en este caso returna 1 si contiene algo returna 0.
    public int comproveFile()throws IOException{ 
        ClientManagement s = new ClientManagement();
        String nameFileTable = "table "+ClientMenu.table+".dbf";
        File fileTable = new File (nameFileTable);
        file =  new RandomAccessFile( nameFileTable, "rw" );
        long size = file.length();
        long zero = 0;
        if (size==zero){ 
            return 1;
        }  
        file.close();
        return 0;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public void setLot(String lot) {
        this.lot = lot;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getFoodName() {
        return foodName;
    }

    public String getLot() {
        return lot;
    }

    public String getObservation() {
        return observation;
    }
    
}


package Manage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;


public class FoodManagement {
    private String name;
    private String price;

    
    String nameFileMenu= "Menu.dbf";
    RandomAccessFile file;
    
    public FoodManagement(){
    }

    public FoodManagement(String name, String lot, String price) {
        this.name = name;
        this.price = price;
    }
    
    // Situa el puntero del archivo al final del mismo y escribe en el archivo Menu las comidas.
    public void addMenu()throws IOException {    
            File fileMenu = new File (nameFileMenu); 
            file = new RandomAccessFile(nameFileMenu, "rw" );
            if (!fileMenu.exists())
                fileMenu.createNewFile();
            file.seek( file.length() );  
            saveMenu();
            file.close();
            JOptionPane.showMessageDialog(null, "Succesful add");
     }
    
    // Recorre el archivo Menu y compara el nombre de la comida que entra con el del archivo, si coinciden returna 1, si no returna 0.
    public int searchFood(String dateName)throws IOException  {
      File fileClient = new File (nameFileMenu);
       boolean flag = false;
       file = new RandomAccessFile(nameFileMenu, "r" );
       if (fileClient.exists()){  
               while (!flag && (file.getFilePointer() < file.length())){
                   recoverMenu();
                   if (getName().equals(dateName)) flag = true;
                   }
                }
               file.close();
        if (flag) return 1;
        else return 0;
  }
    
    // Escribe en el archivo los atributos de la clase FoodManagement.
    public void saveMenu() throws IOException {
         file.writeUTF( name );       
         file.writeUTF( price );
   }
    
    // Los atributos de la clase FoodManagement toman el valor de lo que se encuentra digitado en el archivo Menu.
    public void recoverMenu () throws IOException {
         name = file.readUTF();              
         price = file.readUTF();
   }
   
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    
    
    
}

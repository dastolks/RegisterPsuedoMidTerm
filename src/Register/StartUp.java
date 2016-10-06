/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

/**
 *
 * @author Alec
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        DataStore db = new ArrayDatabase();
        
        
        Register register = new Register();
        register.startNewSale("C100", db);
        register.AddProductToSale("1", 3);
        register.AddProductToSale("2", 1);
        register.endSale(new ConsoleReceiptOutput());
        
        register.startNewSale("C101", db);
        register.AddProductToSale("3", 2);
        register.AddProductToSale("1", 30);
        register.endSale(new ConsoleReceiptOutput());
        
    }
    
}

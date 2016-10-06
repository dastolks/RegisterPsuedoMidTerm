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
public class Register {
    private Receipt receipt;
    
    
    public Register(){
        
    }
    public final void startNewSale(String id, DataStore db){
        this.receipt = new Receipt(id, db);
    }
    
    public final void AddProductToSale(String s, int i) {
        receipt.AddProductToSale(s, i);
    }

    public final void endSale(FormatterManager fm, ReceiptOutputManager rom) {
        receipt.endSale(fm, rom);
    }
    
}

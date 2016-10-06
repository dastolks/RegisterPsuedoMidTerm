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
public class Receipt {
    private Customer customer;
    private DataStore db;
    private LineItem[] items;
    
    public Receipt(String id, DataStore db) {
        this.db = db;
        customer = findCustomerById(id);
        items = new LineItem[0];
    }
    public final Customer findCustomerById(String id){   
        return this.db.findCustomerById(id);
    }
    
    public final void AddProductToSale(String s, int q){
        LineItem[] temp = new LineItem[items.length+1];
        System.arraycopy(items, 0, temp, 0, items.length);
        temp[temp.length-1] = new LineItem(db.findProductById(s),q);
        items = temp;
        temp = null;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final LineItem[] getItems() {
        return items;
    }
    
    public final LineItem getLineItemFromPoint(int i){
        return items[i];      
    }
    public final void endSale(FormatterManager fm, ReceiptOutputManager rom){
        StringBuilder sb = new StringBuilder(); //total string built for the output.      
        sb.append(fm.formatRegisterText(this, rom));
        rom.outputFinalResults(sb.toString());

    }    

}

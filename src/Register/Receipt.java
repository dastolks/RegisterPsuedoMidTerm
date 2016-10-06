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

    public Customer getCustomer() {
        return customer;
    }

    public LineItem[] getItems() {
        return items;
    }
    
    public final LineItem getLineItemFromPoint(int i){
        return items[i];      
    }
    public final void endSale(FormatterManager fm, ReceiptOutputManager rom){
        StringBuilder sb = new StringBuilder(); //total string built for the output.
//        double basePriceTotal = 0;  // base price added up
//        double discountPriceTotal = 0;  // discount/total price added up
//        String messagePromptAppend; //string used for formatting
//        
//        messagePromptAppend = String.format("%s %s %s %s \n %s \n", rom.THANK_YOU, rom.STORE_NAME, customer.getFirstName(),customer.getLastName(), rom.RECEIPT);
//        sb.append(messagePromptAppend);
//        
//        messagePromptAppend = String.format("%-20s %-7s %-20s %-20s \n", rom.PRODUCT, rom.AMOUNT, rom.BASE_PRICE, rom.SALE_PRICE);
//        sb.append(messagePromptAppend);
//        for(int i = 0; i < items.length; i++){
//            messagePromptAppend = String.format("%-20s %-7s %18s $ %18s $ \n", items[i].getProduct().getName(), items[i].getQuanity(), items[i].getBaseAmount(), items[i].getDiscountAmount());
//            basePriceTotal += items[i].getBaseAmount();
//            discountPriceTotal += items[i].getDiscountAmount();
//            sb.append(messagePromptAppend);
//        }
//        messagePromptAppend = String.format("%-15s %20s$ \n%-15s %20s$ \n \n", rom.BASE_PRICE_TOTAL, basePriceTotal, rom.SALE_PRICE_TOTAL, discountPriceTotal);
//        sb.append(messagePromptAppend);
//        
        sb.append(fm.formatRegisterText(this, rom));
        rom.outputFinalResults(sb.toString());
        
        
    }    

}

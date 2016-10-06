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
public class SimpleFormatter implements FormatterManager {
    
    public SimpleFormatter(){
        
    }
    
    @Override
    public final String formatRegisterText(Receipt r, ReceiptOutputManager rom){
        StringBuilder sb = new StringBuilder(); //total string built for the output.
        double basePriceTotal = 0;  // base price added up
        double discountPriceTotal = 0;  // discount/total price added up
        String messagePromptAppend; //string used for formatting
        
        messagePromptAppend = String.format("%s %s %s %s \n %s \n", rom.THANK_YOU, rom.STORE_NAME, r.getCustomer().getFirstName(), r.getCustomer().getLastName(), rom.RECEIPT);
        sb.append(messagePromptAppend);
        
        messagePromptAppend = String.format("%-20s %-7s %-20s %-20s \n", rom.PRODUCT, rom.AMOUNT, rom.BASE_PRICE, rom.SALE_PRICE);
        sb.append(messagePromptAppend);
        for(int i = 0; i < r.getItems().length; i++){
            messagePromptAppend = String.format("%-20s %-7s %18s $ %18s $ \n", r.getLineItemFromPoint(i).getProduct().getName(), r.getLineItemFromPoint(i).getQuanity(), r.getLineItemFromPoint(i).getBaseAmount(), r.getLineItemFromPoint(i).getDiscountAmount());
            basePriceTotal += r.getLineItemFromPoint(i).getBaseAmount();
            discountPriceTotal += r.getLineItemFromPoint(i).getDiscountAmount();
            sb.append(messagePromptAppend);
        }
        messagePromptAppend = String.format("%-15s %20s$ \n%-15s %20s$ \n \n", rom.BASE_PRICE_TOTAL, basePriceTotal, rom.SALE_PRICE_TOTAL, discountPriceTotal);
        sb.append(messagePromptAppend);
        
        return sb.toString();
    }
    
}

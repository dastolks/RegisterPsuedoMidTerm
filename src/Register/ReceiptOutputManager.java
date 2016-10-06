/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

/**
 *
 * @author aschindler1
 */
public interface ReceiptOutputManager {
    
    public final String THANK_YOU = "Thank you for shopping at";
    public final String STORE_NAME = "Kohl's";
    public final String RECEIPT = "Your receipt is as follows:";
    public final String PRODUCT = "Product:";
    public final String AMOUNT = "Amount:";
    public final String BASE_PRICE = "Base Price:";
    public final String SALE_PRICE = "Sale Price:";
    public final String BASE_PRICE_TOTAL = "Base Total:";
    public final String SALE_PRICE_TOTAL = "Sale Total:";  
    public final String AMOUNT_SAVED = "Amount Saved:";
    public final String SEE_YOU_AGAIN = "We hope to see you again!";
    public final String CUSTOMER_ID = "Customer ID:";
            
            
            
    public abstract void outputFinalResults(String s);
    
}

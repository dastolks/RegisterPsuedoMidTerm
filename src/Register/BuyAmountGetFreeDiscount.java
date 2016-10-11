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
public class BuyAmountGetFreeDiscount implements DiscountProduct {
    private double discount; 
    
    public BuyAmountGetFreeDiscount(double d){
        if(d <= 0){
            d = 1;      
        }
        discount = d;
    }
    
    @Override
    public final double getDiscount() {
        return discount;
    }
    @Override
    public final void setDiscount(double discount) {
        this.discount = discount;
    }   
    @Override
    public final double getCostWithDiscount(double price, double qty) {
        double totalCost = 0;
        double amountNeed = 0;
        for(int i = 0; i < qty; i++){
            if(amountNeed == discount){
                amountNeed = 0;
            }
            else{
              totalCost += price;  
              amountNeed++;
            }
        }
        
        return totalCost;
    }


    
}

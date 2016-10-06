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
        discount = d;
    }
    
    @Override
    public double getDiscount() {
        return discount;
    }
    @Override
    public void setDiscount(double discount) {
        this.discount = discount;
    }   
    @Override
    public double getCostWithDiscount(double price, double qty) {
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
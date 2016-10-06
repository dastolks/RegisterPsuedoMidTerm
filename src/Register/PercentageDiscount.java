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
public class PercentageDiscount implements DiscountProduct {
    private double discount;
    
    public PercentageDiscount(double d){
        discount = d;
    }
    @Override
    public final double getDiscount(){            
        return discount;
    }

    @Override
    public final void setDiscount(double d) {
        discount = d;
    }

    @Override
    public final double getCostWithDiscount(double price, double qty) {
        return price*qty - price*qty*discount; 
    }
    
}

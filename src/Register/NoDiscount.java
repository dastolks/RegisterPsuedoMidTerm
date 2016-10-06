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
public class NoDiscount implements DiscountProduct {   
    private double discount;
    private final double ZERO_VALUE = 0;
    
    public NoDiscount(){
        discount = ZERO_VALUE;
    }
    @Override
    public final double getDiscount(){            
        return ZERO_VALUE;
    }
    @Override
    public final void setDiscount(double d) {
        discount = ZERO_VALUE;
    }
    @Override
    public final double getCostWithDiscount(double price, double qty) {
        return price * qty;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Register;

import javax.swing.JOptionPane;

/**
 *
 * @author Alec
 */
public class PercentageDiscount implements DiscountProduct {
    private double discount;
    
    public PercentageDiscount(double d){
        if(d < 0 || d > 1){
            JOptionPane.showMessageDialog(null, "Discount must be above 0 and 1 or below! Defaulting to .10");
            d = .10;
        }
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

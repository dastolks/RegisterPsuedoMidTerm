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
public interface DiscountProduct {

    public abstract double getDiscount();

    public abstract void setDiscount(double d);

    public abstract double getCostWithDiscount(double price, double qty);
}

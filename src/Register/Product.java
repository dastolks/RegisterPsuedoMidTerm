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
public class Product {
    private String prodId;
    private String name;
    private double cost;
    private DiscountProduct discount;
    
    public Product(String prodId, String name, double cost, DiscountProduct dp) {
        this.prodId = prodId;
        this.name = name;
        this.cost = cost;
        this.discount = dp;
    }

    public final String getProdId() {
        return prodId;
    }

    public final void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final double getCost() {
        return cost;
    }

    public final void setCost(double cost) {
        this.cost = cost;
    }

    public final DiscountProduct getDiscount() {
        return discount;
    }

    public final void setDiscount(DiscountProduct discount) {
        this.discount = discount;
    }
    
    
}

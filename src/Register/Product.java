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

    public String getProdId() {
        return prodId;
    }

    public void setProdId(String prodId) {
        this.prodId = prodId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public DiscountProduct getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountProduct discount) {
        this.discount = discount;
    }
    
    
}

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
public class LineItem {
    private Product product;
    private int quantity;
    
    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public final Product getProduct() {
        return product;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public final int getQuanity() {
        return quantity;
    }

    public final void setQuanity(int quanity) {
        this.quantity = quanity;
    }
    
    public final double getBaseAmount(){
        return product.getCost() * quantity; 
    }
    public final double getDiscountAmount(){
        //add validation
        return product.getDiscount().getCostWithDiscount(product.getCost(),quantity);
    }
    
}

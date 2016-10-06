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
public class ArrayDatabase implements DataStore {
    private Customer[] customers ={
        new Customer("Smith", "John", "C100"),
        new Customer("Doe", "Bob", "C101"),
        new Customer("Jones", "Sally", "C102")
    };
    private Product[] products = {
        new Product("1", "Men's shirt", 8.00, new BuyAmountGetFreeDiscount(2)),  
        new Product("2", "Men's jeans", 10.00, new PercentageDiscount(0.15)),  
        new Product("3", "Women's shirt", 13.00, new NoDiscount()), 
    };

    public ArrayDatabase() {
    
    }
    
    @Override
    public final Customer findCustomerById(String custID){
        Customer customer = null;
        for(Customer c: customers){
            if(custID.equals(c.getCustomerNo())){
                customer = c;
                break;
            }    
        }
        
        return customer;
    }
    public final Product findProductById(String prodID){
        Product product = null;
        for(Product p: products){
            if(prodID.equals(p.getProdId())){
                product = p;
                break;
            }    
        }
        
        return product;        
        
    }
}

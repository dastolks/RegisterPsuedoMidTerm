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
public interface DataStore {

    public abstract Customer findCustomerById(String custID);
    public abstract Product findProductById(String prodID);
}

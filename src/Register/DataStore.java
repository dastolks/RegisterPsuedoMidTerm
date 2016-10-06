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

    Customer findCustomerById(String custID);
    Product findProductById(String prodID);
}

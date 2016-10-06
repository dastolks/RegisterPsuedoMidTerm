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
public class ConsoleReceiptOutput implements ReceiptOutputManager {
    
    
    
    @Override
    public final void outputFinalResults(String s){
        System.out.println(s);
    }
    
}

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
public class JOptionPaneReceiptOutput implements ReceiptOutputManager {
    
    JOptionPane jop = new JOptionPane();
    @Override
    public final void outputFinalResults(String s) {
        JOptionPane.showMessageDialog(jop, s);
    }
    
}

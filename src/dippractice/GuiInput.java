
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author LPM
 */
public class GuiInput implements InputStrategy {
    @Override
    public String getInputMsg() {
        
        return JOptionPane.showInputDialog("Enter a message:");
    }
    
}

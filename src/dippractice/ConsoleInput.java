
package dippractice;

import java.util.Scanner;

/**
 *
 * @author LPM
 */
public class ConsoleInput implements InputStrategy {

    @Override
    public String getInputMsg() {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Enter a message: ");
        
        return keyboard.nextLine();
    }
    
}


package dippractice;

/**
 *
 * @author LPM
 */
public class DIPPractice {

    
    public static void main(String[] args) {
        
        //Select one Input Strategy - Gui or Console and
        //comment the one not selected
        
        //Select one Output Strategy - Gui or Console and
        //comment the one not selected
        
        //There are 4 possible input/output combinations
        //to mix or match 
        // - GuiInput and GuiOutput
        // - GuiInput and ConsoleOutput
        // - ConsoleInput and ConsoleOutput
        // - ConsoleInput and GuiOutput
        
        InputStrategy inStrategy = new GuiInput();
        //InputStrategy inStrategy = new ConsoleInput();
        MessageService msgService = new MessageService();
        msgService.getInput(inStrategy);
        
        OutputStrategy outStrategy = new GuiOutput();
        //OutputStrategy outStrategy = new ConsoleOutput();
        msgService.outputMsg(outStrategy);       
        
    }
}

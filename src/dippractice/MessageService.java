
package dippractice;

/**
 *
 * @author LPM
 */
public class MessageService {
    //private static final String MSG = "Hello";
    private String msg;
    
    public void getInput (InputStrategy in){
       msg = in.getInputMsg();
    }
    
    public void outputMsg(OutputStrategy out){
       out.outputMsg("Here is the message that you entered: " + msg);
        
    }
    
}

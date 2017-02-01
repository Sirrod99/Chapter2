/**
 * 
 */
package madlib;
import javax.swing.JOptionPane;
/**
 * @author ZD131147
 *
 */
public class MadLib1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Mad Libbs
        String color, wordEst, bodyPartPlural, noun, pluralNoun, wholeNumber, noun2;
        int a = 5; 
       
        int b;
        
        int c;
        
        color = JOptionPane.showInputDialog(null, "What is your favorite color");
        
        wordEst = JOptionPane.showInputDialog(null, "Pick a word that ends in Est");
         
        bodyPartPlural = JOptionPane.showInputDialog(null, "Plural body part");
        
        noun = JOptionPane.showInputDialog(null, "A noun");
        
        pluralNoun = JOptionPane.showInputDialog(null, "Name a plural noun");
        
        noun2 = JOptionPane.showInputDialog(null, "Name a another noun");
        
        wholeNumber = JOptionPane.showInputDialog(null, "Give me a number that is a whole number, no decimals.");
        b = Integer.parseInt(wholeNumber);
        
        c= a + b;
        
        JOptionPane.showMessageDialog(null, "The " + color + " Alien is the " + wordEst + " Alien out of everyone. " + " He has " + c + " long " + bodyPartPlural + " , and head shaped like a " + noun + " It loves to kill " + pluralNoun + " but it will eat everything in its path. " + " Also it has a huge " + noun2 + " so be careful");
	}

}

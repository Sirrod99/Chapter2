/**
 * 
 */
package quartstogallons;
import javax.swing.JOptionPane;
/**
 * @author ZD131147
 *
 */
public class QuartsToGallons {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int Quarts_To_Gallon = 4;
		String quartsTold;
		int quartsNumber;
		int quartsRemainder;
		int gallonShow;
		
		quartsTold = JOptionPane.showInputDialog(null, "How many quarts are would you like sir or madam?", "Dialog 1", JOptionPane.INFORMATION_MESSAGE);
		quartsNumber = Integer.parseInt(quartsTold);
		gallonShow = quartsNumber/Quarts_To_Gallon;
		quartsRemainder = quartsNumber % gallonShow;
		System.out.println("A job that needs " + quartsNumber + " quarts requires " + gallonShow + " gallons and " + quartsRemainder + " quarts left over ");
		

	}

}

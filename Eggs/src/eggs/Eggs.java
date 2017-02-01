/**
 * 
 */
package eggs;
import javax.swing.JOptionPane;
/**
 * @author ZD131147
 *January 20th, 2017
 */
public class Eggs {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// Number of eggs to buy and the amount left over
		String Answers;
		double dozenEggsCost = 3.25;
		double remainderEggCost = .45;
	    int dozenEggs = 12;
	    int remainderEggs;
		int numDozenEggs;
		int totalOfEggsOrdered;
		double totalCost;
		
		Answers = JOptionPane.showInputDialog(null, "How many eggs would you like Sir or Madam.", JOptionPane.QUESTION_MESSAGE);
		totalOfEggsOrdered = Integer.parseInt(Answers);
		
		numDozenEggs = totalOfEggsOrdered / dozenEggs;
		remainderEggs = totalOfEggsOrdered % dozenEggs;
		
		totalCost = numDozenEggs * dozenEggsCost + remainderEggs * remainderEggCost;
		
		JOptionPane.showMessageDialog(null, "You ordered " + totalOfEggsOrdered + " eggs");
		JOptionPane.showMessageDialog(null,"Your total cost is " + totalCost);
		
		
		
		

	}

}

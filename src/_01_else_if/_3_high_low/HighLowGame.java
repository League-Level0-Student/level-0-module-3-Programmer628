
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random(1).nextInt(101);
		
		// 2. Print out the random variable above

		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		while(true) {
			String guess = JOptionPane.showInputDialog("Guess");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int guessAsInt = Integer.parseInt(guess);
			
			// 5. if the guess is correct
			if(guessAsInt == random) {
				JOptionPane.showMessageDialog(null, "Great job you got it correct!");
				System.exit(0);
			} else if(guessAsInt > random) {
				JOptionPane.showMessageDialog(null, "Sorry the answer you put in was too high. Better luck next time!");
			} else if(guessAsInt < random) {
				JOptionPane.showMessageDialog(null, "Sorry the answer you put in was too low. Better luck next time!");
			}
		
	}		// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose
		
	}

}



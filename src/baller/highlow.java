package baller;

import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class highlow {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random(1).nextInt(100);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {

			// 1. ask the user for a guess using a pop-up window, and save their
			// response
			String guess = JOptionPane.showInputDialog("What is your guess?");
			// 4. convert the users’ answer to an int (Integer.parseInt(string))
			int bacon = Integer.parseInt(guess);
			// 5. if the guess is correct
			if (bacon == random) {
				JOptionPane.showMessageDialog(null, "YOU WIN!!!!");

			}
			// 6. win
			// 7. if the guess is high
			if (bacon > random) {
				JOptionPane.showMessageDialog(null, "Your guess is too high!");
				JOptionPane.showMessageDialog(null, "You lose!");
			}
			// 8. tell them it's too high
			// 9. if the guess is low
			if (bacon < random) {
				JOptionPane.showMessageDialog(null, "Your guess is too low!");
				JOptionPane.showMessageDialog(null, "You lose!");
			}
			// 10. tell them it's too low

			// 12. tell them they lose
		}
	}

}

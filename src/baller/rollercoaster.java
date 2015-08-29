package baller;

import javax.swing.JOptionPane;

public class rollercoaster {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Welcome to Ian's Roller Coaster! You must be 4 feet to ride.");
		String height = JOptionPane
				.showInputDialog("How tall are you?(in inches)");
		int heightt = Integer.parseInt(height);
		if (heightt >= 48) {
			JOptionPane.showMessageDialog(null,
					"You may ride the roller coaster!");

		} else
			JOptionPane.showMessageDialog(null,
					"Sorry! You are too short to ride the roller coaster :(");
	}
}

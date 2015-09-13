import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class translator implements ActionListener {
	JFrame frame;
	JButton translate;
	JTextField input;
	JTextField output;
	JPanel panel;

	public static void main(String[] args) {
		translator x = new translator();
	}

	translator() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.setVisible(true);
		input = new JTextField(20);
		translate = new JButton("translate");
		output = new JTextField(20);
		panel.add(input);
		panel.add(translate);
		panel.add(output);
		frame.add(panel);
		frame.pack();
		frame.setSize(800, 100);
		translate.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String inputWord = input.getText();

		StringBuilder fro = new StringBuilder(inputWord);
		for (int i = 0; i < inputWord.length(); i++) {

			if (inputWord.charAt(i) == 'a') {
				fro.setCharAt(i, 'b');
			}
			if (inputWord.charAt(i) == 'b') {
				fro.setCharAt(i, 'c');
			}
			if (inputWord.charAt(i) == 'c') {
				fro.setCharAt(i, 'd');
			}
			if (inputWord.charAt(i) == 'd') {
				fro.setCharAt(i, 'e');
			}
			if (inputWord.charAt(i) == 'e') {
				fro.setCharAt(i, 'f');
			}
			if (inputWord.charAt(i) == 'f') {
				fro.setCharAt(i, 'g');
			}
			if (inputWord.charAt(i) == 'g') {
				fro.setCharAt(i, 'h');
			}
			if (inputWord.charAt(i) == 'h') {
				fro.setCharAt(i, 'i');
			}
			if (inputWord.charAt(i) == 'i') {
				fro.setCharAt(i, 'j');
			}
			if (inputWord.charAt(i) == 'j') {
				fro.setCharAt(i, 'k');
			}
			if (inputWord.charAt(i) == 'k') {
				fro.setCharAt(i, 'l');
			}
			if (inputWord.charAt(i) == 'l') {
				fro.setCharAt(i, 'm');
			}
			if (inputWord.charAt(i) == 'm') {
				fro.setCharAt(i, 'n');
			}
			if (inputWord.charAt(i) == 'n') {
				fro.setCharAt(i, 'o');
			}
			if (inputWord.charAt(i) == 'o') {
				fro.setCharAt(i, 'p');
			}
			if (inputWord.charAt(i) == 'p') {
				fro.setCharAt(i, 'q');
			}
			if (inputWord.charAt(i) == 'q') {
				fro.setCharAt(i, 'r');
			}
			if (inputWord.charAt(i) == 'r') {
				fro.setCharAt(i, 's');
			}
			if (inputWord.charAt(i) == 's') {
				fro.setCharAt(i, 't');
			}
			if (inputWord.charAt(i) == 't') {
				fro.setCharAt(i, 'u');
			}
			if (inputWord.charAt(i) == 'u') {
				fro.setCharAt(i, 'v');
			}
			if (inputWord.charAt(i) == 'v') {
				fro.setCharAt(i, 'w');
			}
			if (inputWord.charAt(i) == 'w') {
				fro.setCharAt(i, 'x');
			}
			if (inputWord.charAt(i) == 'x') {
				fro.setCharAt(i, 'y');
			}
			if (inputWord.charAt(i) == 'y') {
				fro.setCharAt(i, 'z');
			}
			if (inputWord.charAt(i) == 'z') {
				fro.setCharAt(i, 'a');
			
			}
		output.setText(fro.toString());
		}
	}
}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
			Random random = new Random();
			int x = random.nextInt(1000000);
			char p = (char) x;
			if (inputWord.charAt(i) == 'a') {
				fro.setCharAt(i,p);
			}
			if (inputWord.charAt(i) == 'b') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'c') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'd') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'e') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'f') {
				fro.setCharAt(i,p);
			}
			if (inputWord.charAt(i) == 'g') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'h') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'i') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'j') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'k') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'l') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'm') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'n') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'o') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'p') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'q') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'r') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 's') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 't') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'u') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'v') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'w') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'x') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'y') {
				fro.setCharAt(i, p);
			}
			if (inputWord.charAt(i) == 'z') {
				fro.setCharAt(i, p);
			
			}
		output.setText(fro.toString());
		}
	}
}
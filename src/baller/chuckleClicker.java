package baller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class chuckleClicker implements ActionListener {
	JFrame frame;
	JButton joke;
	JButton punchline;
	JPanel panel;

	public static void main(String[] args) {

		chuckleClicker chuckle = new chuckleClicker();
	}

	chuckleClicker() {
		makeButtons();
	}

	void makeButtons() {
		frame = new JFrame();
		panel = new JPanel();
		frame.setVisible(true);
		joke = new JButton("joke");
		punchline = new JButton("punchline");
		panel.add(joke);
		panel.add(punchline);
		frame.add(panel);
		joke.addActionListener(this);
		punchline.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == joke) {
			JOptionPane
					.showMessageDialog(null,"How did the basket ball court get wet?");
			
		}
		if (e.getSource() == punchline) {
			JOptionPane.showMessageDialog(null, "It's because they dribbled all over the court!");
		}
	}

}

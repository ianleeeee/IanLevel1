
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class whackamole implements ActionListener {
	int s = 0;
	int q = 0;

	public static void main(String[] args) {
		whackamole x = new whackamole();
	}

	whackamole() {
		Random z = new Random();
		int y = z.nextInt(23);
		drawButtons(y);
	}

	void drawButtons(int y) {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(375, 250);
		panel.removeAll();
		for (int i = 0; i < 24; i++) {
			JButton b1 = new JButton();
			b1.addActionListener(this);
			panel.add(b1);
			if (y == i) {
				b1.setText("Mole!");
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton j = (JButton) e.getSource();
		if (j.getText().equals("Mole!")) {

			Random z = new Random();
			int y = z.nextInt(23);
			drawButtons(y);
			s = s + 1;
			if (s == 10) {
				endGame(new Date(System.currentTimeMillis()), s);

			}
		} else {
			q = q + 1;
			if (q <= 1 || q>=5) {
				speak("Dork");
			}
			if (q == 2) {
				speak("You are an idiot");
			}
			if (q == 3) {
				speak("Moron");
			}
			if(q==4){
				speak("You are a waste of atoms");
			}
			
		}
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void endGame(Date timeAtStart, int molesWhacked) {
		Date timeAtEnd = new Date();
		JOptionPane.showMessageDialog(null, "Your whack rate is "
				+ ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked) + " moles per second.");
	}

}

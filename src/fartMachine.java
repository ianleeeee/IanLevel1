
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.media.jfxmedia.AudioClip;

public class fartMachine implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	/// JTextField num1 = new JTextField(7);
	/// JTextField num2 = new JTextField(7);
	JButton f1 = new JButton("song 1");
	JButton f2 = new JButton("song 2");
	JButton f3 = new JButton("song 3");

	public static void main(String[] args) {
		fartMachine x = new fartMachine();
	}

	fartMachine() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(f1);
		panel.add(f2);
		panel.add(f3);
		f1.addActionListener(this);
		f2.addActionListener(this);
		f3.addActionListener(this);
		frame.setSize(225, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == (f1)) {
			playSound("revolution.wav");
		}
		if (e.getSource() == (f2)) {
			playSound("song2.wav");
		}
		if (e.getSource() == (f3)) {
			playSound("song3.wav");
		}
	}

	private void playSound(String fileName) {
		java.applet.AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	
	}
}

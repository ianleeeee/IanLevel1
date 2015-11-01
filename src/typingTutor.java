import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class typingTutor implements KeyListener{
	JFrame frame;
	JLabel randomLetter;
	JPanel panel;
	char currentLetter;
	JLabel typed;
	public static void main(String[] args) {
		typingTutor x = new typingTutor();
	}

	typingTutor() {
	char currentLetter = generateRandomLetter();
	frame = new JFrame("Type or Die");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	randomLetter = new JLabel("Random Letter:"+currentLetter);
	panel = new JPanel();
	typed = new JLabel("",10);
	frame.setVisible(true);
	frame.add(panel);
	panel.add(randomLetter);
	panel.add(typed);
	frame.setSize(300,200);
	randomLetter.setFont(randomLetter.getFont().deriveFont(28.0f));
	randomLetter.setHorizontalAlignment(JLabel.CENTER);	
	typed.setFont(typed.getFont().deriveFont(28.0f));
	typed.setHorizontalAlignment(JLabel.CENTER);	
	frame.addKeyListener(this);
	}
	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'A');
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char c = (char)e.getKeyCode();
		typed.setText("You Typed:"+c);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		char currentLetter = generateRandomLetter();
		randomLetter.setText("Random letter:"+currentLetter);
	}
}

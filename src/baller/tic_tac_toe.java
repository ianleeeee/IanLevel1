package baller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class tic_tac_toe implements ActionListener {
	JFrame frame;
	JPanel panel;
	JButton submit;
	JTextField one;
	JTextField two;
	JTextField three;
	JTextField four;
	JTextField five;
	JTextField six;
	JTextField seven;
	JTextField eight;
	JTextField nine;

	public static void main(String[] args) {
		tic_tac_toe x = new tic_tac_toe();
	}

	tic_tac_toe() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		submit = new JButton("Submit");
		one = new JTextField(1);
		two = new JTextField(1);
		three = new JTextField(1);
		four = new JTextField(1);
		five = new JTextField(1);
		six = new JTextField(1);
		seven = new JTextField(1);
		eight = new JTextField(1);
		nine = new JTextField(1);
		frame.add(panel);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(submit);
		frame.setSize(115, 150);
		submit.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = one.getText();
		String b = two.getText();
		String c = three.getText();
		String d = four.getText();
		String ee = five.getText();
		String f = six.getText();
		String g = seven.getText();
		String h = eight.getText();
		String i = nine.getText();
		if (e.getSource()==submit) {
			if (a.equals(b) && a.equals(c) || a.equals(d) && a.equals(g) || a.equals(ee) && a.equals(i)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (b.equals(a) && b.equals(c) || b.equals(ee) && b.equals(h)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (c.equals(b) && c.equals(a) || c.equals(f) && c.equals(i) || c.equals(ee) && c.equals(g)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (d.equals(a) && d.equals(g) || d.equals(ee) && d.equals(f)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (ee.equals(a) && ee.equals(i) || ee.equals(c) && ee.equals(g) || ee.equals(b) && ee.equals(h) || ee.equals(d) && ee.equals(f)){
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (f.equals(d) && f.equals(ee) || f.equals(c) && f.equals(i)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (g.equals(a) && g.equals(d) || g.equals(h) && g.equals(i) || g.equals(ee) && g.equals(c)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (h.equals(ee) && h.equals(b) || h.equals(g) && h.equals(i)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			if (i.equals(c) && i.equals(f) || i.equals(g) && i.equals(h) || i.equals(ee) && i.equals(a)) {
				JOptionPane.showMessageDialog(null, "Win");
			}
			else{
				JOptionPane.showMessageDialog(null,"Lose");
			}
		}

	}
}

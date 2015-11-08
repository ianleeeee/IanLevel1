import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class addMult implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField num1 = new JTextField(7);
	JTextField num2 = new JTextField(7);
	JButton add1 = new JButton("ADD");
	JButton mult = new JButton("MULTIPLY");

	public static void main(String[] args) {
		addMult x = new addMult();
	}

	addMult() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(num1);
		panel.add(num2);
		panel.add(add1);
		panel.add(mult);
		add1.addActionListener(this);
		mult.addActionListener(this);
		frame.setSize(225, 100);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==(add1)){
			String x = num1.getText();
			String y = num2.getText();
			int a = Integer.parseInt(x);
			int b = Integer.parseInt(y);
			JOptionPane.showMessageDialog(null,"The sum of your numbers is "+(a+b));
		}
		if (e.getSource()==(mult)) {
			String x = num1.getText();
			String y = num2.getText();
			int a = Integer.parseInt(x);
			int b = Integer.parseInt(y);
			JOptionPane.showMessageDialog(null,"The sum of your numbers is "+a*b);
		}
	}
}

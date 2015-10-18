package baller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class method implements ActionListener{
	JFrame frame;
	JPanel panel;
	JButton add;
	JButton print;
	JButton random;
	public static void main(String[] args) {
		method m = new method();
	}
	method(){
		frame = new JFrame();
		panel = new JPanel();
		add = new JButton("add");
		print = new JButton("print");
		random = new JButton("random");
		frame.setVisible(true);
		frame.add(panel);
		panel.add(add);
		panel.add(print);
		panel.add(random);
		frame.pack();
		add.addActionListener(this);
		print.addActionListener(this);
		random.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==add) {
			addB();
		}

	}
	void addB(){
			String one = JOptionPane.showInputDialog("Enter a number:");
			String second = JOptionPane.showInputDialog("Enter another number:");
			int f = Integer.parseInt(one);
			int d = Integer.parseInt(second);
			int l = d+f;
			JOptionPane.showMessageDialog(null,"The sum of your numbers is "+l);
		}
	}


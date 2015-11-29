package baller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class pop implements ActionListener{
	JButton up = new JButton("UP");
	JButton down = new JButton("DOWN");
	JButton right = new JButton("RIGHT");
	JButton left = new JButton("LEFT");
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	String direction;
	public static void main(String[] args) {
		pop x = new pop();
	}

	pop() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(up);
		panel.add(down);
		panel.add(right);
		panel.add(left);
		frame.pack();
		up.addActionListener(this);
		right.addActionListener(this);
		down.addActionListener(this);
		left.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==up) {
			
			if (direction == "up") {
				
			}
			else{
				System.out.println("UP");
				String direction = "up";
			}
			
		}
		if (e.getSource()==down) {
			
			if (direction == "down") {
				
			}
			else{
				System.out.println("DOWN");
				String direction = "down";
			}
			
		}
		if (e.getSource()==left) {
			
			if (direction == "left") {
				
			}
			else{
				System.out.println("LEFT");
				String direction = "left";
			}
			
		}
		if (e.getSource()==right) {
			
			if (direction == "right") {
				
			}
			else{
				System.out.println("RIGHT");
				String direction = "right";
			}
			
		}
		
	}

}

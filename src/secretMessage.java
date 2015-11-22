import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class secretMessage implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button = new JButton("Translate");
	JTextField text1 = new JTextField(10);

	public static void main(String[] args) {
		///secretMessage x = new secretMessage();
		int i =0;
		while(true){
			char c = (char) i ;
			System.out.println(i+" "+c);
			i++;
		}
	}

	secretMessage() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(button);
		panel.add(text1);
		frame.setSize(200, 200);
		button.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			String y = text1.getText();
			JOptionPane.showMessageDialog(null,convert(y));
			
		}

	}
	String convert(String a){
		String tran = "";
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			c+=1034;
			tran+=c;
			
		}
		return tran;
	}
}

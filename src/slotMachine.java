import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class slotMachine implements ActionListener {

	int total = 1000;
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel money = new JLabel("total:" + total);
	JButton spin = new JButton("SPIN");

	JLabel betwrd = new JLabel("Bet:");
	JTextField bet = new JTextField(15);
	JTextField num1 = new JTextField(10);
	JTextField num2 = new JTextField(10);
	JTextField num3 = new JTextField(10);

	public static void main(String[] args) {
		slotMachine f = new slotMachine();
	}

	slotMachine() {
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(200, 250);
		panel.add(betwrd);
		panel.add(bet);
		panel.add(money);
		panel.add(spin);
		panel.add(num1);
		panel.add(num2);
		panel.add(num3);
		frame.setVisible(true);

		spin.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String betmoney = bet.getText();
		int n = Integer.parseInt(betmoney);
		if (n > total) {
			JOptionPane.showMessageDialog(null,
					"Do not bet more than you have!");

		} else {
			Random random = new Random();
			int rand = random.nextInt(10);
			String a = "" + rand;
			Random random2 = new Random();
			int rand2 = random.nextInt(10);
			random2.nextInt(2);
			String b = "" + rand2;
			Random random3 = new Random();
			int rand3 = random.nextInt(10);
			random3.nextInt(2);
			String c = "" + rand3;
			num1.setText(a);
			num2.setText(b);
			num3.setText(c);
			if (a.equals(b) && a.equals(c)) {
				total += 2 * n;
				money.setText("Total:" + total);
				JOptionPane
						.showMessageDialog(null,
								"You win! Your bet will now be doubled and added to your total");
			}
			if (!a.equals(b) && !a.equals(c) && !b.equals(c) && !b.equals(a)
					&& !c.equals(a) && !c.equals(b)) {
				total = total - n;
				money.setText("Total:" + total);
				JOptionPane
						.showMessageDialog(null,
								"Too bad! You lose! Your bet will now be subtracted from your total");
			}
		}
	}
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class diceRoller implements ActionListener {
	int totalPoints = 0;
	JFrame frame;
	JPanel panel;
	JButton four;
	JButton twenty;
	JButton six;
	JButton eight;
	JButton ten;
	JButton twelve;
	JButton clear;
	JLabel roll;
	JLabel total;
	JTextField modifier;
	JLabel mod;
	public static void main(String[] args) {
		diceRoller x = new diceRoller();
	}

	diceRoller() {

		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		four = new JButton("4");
		six = new JButton("6");
		eight = new JButton("8");
		ten = new JButton("10");
		twelve = new JButton("12");
		twenty = new JButton("20");
		roll = new JLabel("Last roll: Haven't rolled");
		total = new JLabel("Total:0");
		clear = new JButton("Clear");
		mod = new JLabel("Modifier:");
		modifier = new JTextField(5);
		frame.setVisible(true);
		frame.add(panel);
		panel.add(four);
		panel.add(six);
		panel.add(eight);
		panel.add(ten);
		panel.add(twelve);
		panel.add(twenty);
		panel.add(roll);
		panel.add(total);
		panel.add(clear);
		panel.add(mod);
		panel.add(modifier);
		frame.setSize(150,500);
		four.addActionListener(this);
		six.addActionListener(this);
		eight.addActionListener(this);
		ten.addActionListener(this);
		twelve.addActionListener(this);
		twenty.addActionListener(this);
		clear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == four) {
			int z = rollFour();
			String c = modifier.getText();
			int v = Integer.parseInt(c);
			roll.setText("Last roll:"+z);
			totalPoints=totalPoints+z+v;
			total.setText("Total:"+totalPoints);
		}
		if (e.getSource()==six) {
			int q = rollSix();
			String c = modifier.getText();
			int v = Integer.parseInt(c);
			roll.setText("Last roll:"+q);
			totalPoints=totalPoints+q+v;
			total.setText("Total:"+totalPoints);

		}
		if (e.getSource()==eight) {
			int y = rollEight();
			String c = modifier.getText();
			int v = Integer.parseInt(c);
			roll.setText("Last roll:"+y);
			totalPoints=totalPoints+y+v;
			total.setText("Total:"+totalPoints);

		}
		if (e.getSource()==ten) {
			int p = rollTen();
			String c = modifier.getText();
			int v = Integer.parseInt(c);
			roll.setText("Last roll:"+p);
			totalPoints=totalPoints+p+v;
			total.setText("Total:"+totalPoints);

		}
		if (e.getSource()==twelve) {
			int o = rollTwelve();
			String c = modifier.getText();
			int v = Integer.parseInt(c);
			roll.setText("Last roll:"+o);
			totalPoints=totalPoints+o+v;
			total.setText("Total:"+totalPoints);

		}
		if (e.getSource()==twenty) {
			int r = rollTwenty();
			String c = modifier.getText();
			int v = Integer.parseInt(c);
			roll.setText("Last roll:"+r);
			totalPoints=totalPoints+r+v;
			total.setText("Total:"+totalPoints);

		}
		if (e.getSource()==clear) {
			totalPoints=0;
			total.setText("Total:0");
			roll.setText("Last roll: Haven't rolled");
		}
	
	}

	int rollFour() {
		
		Random random4 = new Random();
		int a = random4.nextInt(4)+1;
		return (a);
	}

	int rollSix() {
		Random random6 = new Random();
		int b = random6.nextInt(6)+1;
		return (b);
	}

	int rollEight() {
		Random random8 = new Random();
		int c = random8.nextInt(8)+1;
		return (c);
	}

	int rollTen() {
		Random random10 = new Random();
		int d = random10.nextInt(10)+1;
		return (d);
	}

	int rollTwelve() {
		Random random12 = new Random();
		int e = random12.nextInt(12)+1;
		return (e);
	}

	int rollTwenty() {
		Random random20 = new Random();
		int f = random20.nextInt(20)+1;
		return (f);
	}
}
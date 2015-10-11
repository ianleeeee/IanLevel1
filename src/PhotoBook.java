import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PhotoBook implements ActionListener{
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton next = new JButton("NEXT");
	JButton previous = new JButton("PREVIOUS");
	JButton random = new JButton("RANDOM");
	ImagePanel ip = new ImagePanel("imgres.jpg",350,350);
	ImagePanel ip2 = new ImagePanel("imgres-2.jpg",350,350);
	ImagePanel ip3 = new ImagePanel("imgres-1.jpg",350,350);
	ImagePanel ip4 = new ImagePanel("imgres-5.jpg",350,350);
	ImagePanel ip5 = new ImagePanel("imgres-4.jpg",350,350);
	ImagePanel ip6 = new ImagePanel("imgres-3.jpg",350,350);
	ImagePanel ip7 = new ImagePanel("imgres.png",350,350);
	ImagePanel ip8 = new ImagePanel("MrKrabs.png",350,350);
	public static void main(String[] args) {
		PhotoBook C = new PhotoBook();

	}

	PhotoBook() {
		
		frame.setVisible(true);
		frame.setLayout(null);
		panel.setBounds(0,0,100,100);
		ip.setBounds(100,0,200,200);
		frame.add(panel);
		frame.add(ip);
		
		
		panel.add(next);
		panel.add(previous);
		panel.add(random);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(400,400);
		next.addActionListener(this);
		previous.addActionListener(this);
		random.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==next) {
			panel.add(ip);
		}
	}
}

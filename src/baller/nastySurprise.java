package baller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class nastySurprise implements ActionListener {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton trick = new JButton("Trick");
	JButton treat = new JButton("Treat");

	public static void main(String[] args) {
		nastySurprise x = new nastySurprise();
	}

	nastySurprise() {
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		panel.add(trick);
		panel.add(treat);
		trick.addActionListener(this);
		treat.addActionListener(this);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==trick){
			showPictureFromTheInternet("http://my10online.com/wp-content/uploads/2011/09/4480604.jpg");
		}
		if(e.getSource()==treat){
			showPictureFromTheInternet("https://i.ytimg.com/vi/Gpb_2oPO5WM/maxresdefault.jpg");
		}
	}
	private void showPictureFromTheInternet(String imageUrl) {
		try {
			URL url = new URL(imageUrl);
			Icon icon = new ImageIcon(url);
			JLabel imageLabel = new JLabel(icon);
			JFrame frame = new JFrame();
			frame.add(imageLabel);
			frame.setVisible(true);
			frame.pack();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}

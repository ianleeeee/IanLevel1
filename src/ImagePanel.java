import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ImagePanel extends JPanel {
	public void paint(Graphics g) {
		g.drawImage(image, 0, 0, width,height, null);
	}

	BufferedImage image;
	int width;
	int height;
	
	ImagePanel(String filename, int w, int h) {
		width = w;
		height = h;
		try {
			image = ImageIO.read(this.getClass().getResourceAsStream(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

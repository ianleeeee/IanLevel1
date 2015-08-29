import java.net.URI;

import javax.swing.JOptionPane;

public class sicknasty {

	public static void main(String[] args) {
		// 1. Find out what mood the user is in. Store their answer in a
		// variable.
		String mood = JOptionPane.showInputDialog("How are you feeling?");
		// 2. If they are in a happy mood, use the playVideo method to play a
		// happy song from YouTube
		if (mood.equals("happy")) {
			playVideo("https://www.youtube.com/watch?v=y6Sxv-sUYtM");
		}
		// 3. Play different songs for other moods
		else
			playVideo("https://www.youtube.com/watch?v=0qO75JqkXIA");
		// If you are seeing ads at the beginning of your videos, install
		// Adblock.

	}

	static void playVideo(String youTubeLink) {
		try {
			URI uri = new URI(youTubeLink);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class songplayer {
	public static void main(String[] args) {

		songplayer x = new songplayer();
	}

	songplayer() {
		Media song = new Media("hey.mp3");
		MediaPlayer player = new MediaPlayer(song);
		player.play();
	}
}

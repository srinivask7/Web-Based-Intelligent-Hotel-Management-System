package homePage;

import java.io.File;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class Music {
	public static void main(String[] args)
	{
		new javafx.embed.swing.JFXPanel();
		String bip = "C:/Users/Srinivas/Desktop/docs/music/gfbf.mp3";
		Media hit = new Media(new File(bip).toURI().toString());
		MediaPlayer mediaPlayer = new MediaPlayer(hit);
		mediaPlayer.play();
	}
	


}
package audioProject;
import java.io.File;
import javax.sound.sampled.*;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		File file = new File("C:\\Users\\singh\\Downloads\\Formed By Glaciers.wav");
		AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
		Clip clip = AudioSystem.getClip();
		clip.open(audioStream);
		clip.start();                   			   // start clip
		scan.nextLine();
		// clip.stop();                  				 // stops the clip
		// clip.setMicrosecondPosition(0); 			// to reset to a position of clip
		clip.close();                			   // closes the resource
	}
}

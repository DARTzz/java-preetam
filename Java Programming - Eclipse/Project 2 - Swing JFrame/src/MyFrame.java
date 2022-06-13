import javax.swing.JFrame;
import javax.swing.ImageIcon;
import java.awt.Color;



// This is the better way of making a frame using inheritance
public class MyFrame extends JFrame 
{
	public MyFrame()
	{
		this.setSize(420,420);
		ImageIcon image = new ImageIcon("ico.jpg");
		this.setIconImage(image.getImage());
		this.getContentPane().setBackground(Color.BLACK);
		this.setResizable(true);
		this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
		this.setTitle("Naruto");
	}
}

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame 
{
	public MyFrame()
	{
		this.setSize(600,600);
		this.setTitle("SAD NARUTO PROGRAM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.BLACK);
		JLabel label = new MyLabel();
		this.add(label);
	}
}

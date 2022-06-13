package guiComponents;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class BackgroundFrame extends JFrame
{	
	public BackgroundFrame()
	{
		ImageIcon contentPane = new ImageIcon("contentPain.JPG");
		
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // for getting the window dimension
		//this.setSize(screenSize.width,screenSize.height);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	    this.setUndecorated(true);
		this.setContentPane(new JLabel(contentPane));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

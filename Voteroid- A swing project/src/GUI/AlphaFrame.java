package GUI;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class AlphaFrame extends JFrame 
{
	public AlphaFrame()
	{
		ImageIcon contentPane = new ImageIcon("purple.jpg");
		
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // for getting the window dimension
		//this.setSize(screenSize.width,screenSize.height);
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	    this.setUndecorated(true);
		this.setContentPane(new JLabel(contentPane));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

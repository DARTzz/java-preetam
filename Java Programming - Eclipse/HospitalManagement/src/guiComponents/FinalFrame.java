package guiComponents;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class FinalFrame extends JFrame 
{
	ImageIcon contentPane = new ImageIcon("pinkVector.jpg");
	ImageIcon icon1 = new ImageIcon("md.png");
	JLabel logoLabel; 
	JLayeredPane layer1;
	JPanel panel1;
	JPanel panel2;
	public FinalFrame(int uID)
	{
		logoLabel = new JLabel(icon1);
		logoLabel.setBounds(0,0,165,165);
		
		panel1.
		
		layer1  = new JLayeredPane();
		
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
	    this.setUndecorated(true);
	    this.setLayout(new BorderLayout());
	    this.add(logoLabel,BorderLayout.NORTH);
		this.getContentPane().set;
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}

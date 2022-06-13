import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DisplayFrame extends JFrame 
{
	public DisplayFrame()
	{
		JLabel label = new JLabel(DbOperations.displayStudent());
		this.setSize(1000,1000);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.LIGHT_GRAY);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label.setFont(new Font("calibri", Font.BOLD, 30));
		this.add(label);
		this.setVisible(true);
	}
}

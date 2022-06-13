import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyPanelBlue extends JPanel
{
	public MyPanelBlue()
	{
		ImageIcon icon = new ImageIcon("thumb69.png");
		this.setLayout(new BorderLayout());
		JLabel label = new JLabel(icon);
		
//		the below code is for border layout only
		label.setAlignmentX(250);
		label.setAlignmentY(125);
// 		label.setHorizontalAlignment(JLabel.CENTER);
// 		label.setVerticalAlignment(JLabel.LEFT);
		
		this.setBounds(0,250, 500, 250);
		this.setBackground(Color.BLUE);
		this.add(label);
		
	}
}


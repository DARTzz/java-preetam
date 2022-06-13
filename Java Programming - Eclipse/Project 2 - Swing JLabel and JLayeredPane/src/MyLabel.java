import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class MyLabel extends JLabel 
{
	public MyLabel()
	{
		this.setText("Jiraya Died"); // we can even set this by passing string in as argument in JLabel Constructor.
								 // in this style, we have to call the super and pass the name.(to call JLabel constructor)
		
		ImageIcon image = new ImageIcon("naruto.jpg");// the image object is already an icon
		Border border =BorderFactory.createLineBorder(Color.YELLOW,3);
		
		this.setIcon(image);// setIcon needs an icon and not image and hence we can directly write image
		this.setHorizontalTextPosition(JLabel.CENTER);
		this.setVerticalTextPosition(JLabel.BOTTOM);
		this.setFont(new Font("calibri",Font.ITALIC,40));
		this.setIconTextGap(-40);
		this.setForeground(Color.ORANGE);
		this.setBackground(Color.BLACK);
		this.setOpaque(true);
		this.setBorder(border);
		this.setVerticalAlignment(JLabel.CENTER);
		this.setHorizontalAlignment(JLabel.CENTER);
		this.setLayout(null);
	}
}

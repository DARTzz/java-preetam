package swingGridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class UserPanel extends JPanel 
{
	public UserPanel()
	{
		JLabel label = new JLabel("Naam");
		this.add(label);
		JTextField f1 = new JTextField("Enter Naam");
		this.add(f1);
		JLabel label2 = new JLabel("Password ");
		this.add(label2);
		JTextField f2 = new JTextField("Enter Pass");
		this.add(f2);
		JButton btn = new JButton("LOGIN");
		this.add(btn);
		JButton sign = new JButton("SIGNUP");
		this.add(sign);
		this.setLayout(new GridLayout(3,2));
		this.setBackground(Color.PINK);
		
	}
}

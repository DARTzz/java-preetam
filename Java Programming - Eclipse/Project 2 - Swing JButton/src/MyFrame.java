import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener

{
	JButton button1 ;
	JLabel label1;
	public MyFrame()
	{
		ImageIcon icon1 = new ImageIcon("thumb69.png");
		ImageIcon icon2 = new ImageIcon("thumb699.png");
		button1 = new JButton("Press me");
		button1.setIcon(icon2);
		button1.setFocusable(false);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setIconTextGap(-5);
		button1.setFont(new Font("Comic Sans",Font.ITALIC,15));
		button1.setForeground(Color.cyan);
		button1.setBackground(Color.LIGHT_GRAY);
		button1.setBounds(150,100,200,75);
		button1.addActionListener(this);
		button1.setBorder(BorderFactory.createEtchedBorder(Color.black, Color.cyan));
		label1 = new JLabel(icon1);
		label1.setBounds(150,300,200,100);
		label1.setVisible(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setSize(500,500);
		this.setVisible(true);
		this.add(button1);
		this.add(label1);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button1)
		{
			button1.setEnabled(false);
			label1.setVisible(true);
		}
		
	}
	
}

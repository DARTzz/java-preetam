package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class RulesFrame extends JFrame implements MouseListener
{
	JButton okkButton;
	JLabel infoLabel;
	
	public RulesFrame()
	{
		okkButton = new JButton("OKK");
		okkButton.setBounds(250,400,100,75);
		okkButton.setFocusable(false);
		okkButton.setBackground(new Color(214, 0, 89));
		okkButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(Color.WHITE)));
		okkButton.setFont(new Font("Consolas",Font.BOLD,20));
		okkButton.setForeground(Color.WHITE);
		okkButton.addMouseListener(this);

		
		infoLabel = new JLabel("<html> A single candidate can only place single vote. "
				+ "<br> The candidate must agree to terms in order to vote."
				+ "<br> Remember, each and every single vote counts"
				+ "<br> as it will determine the result."
				+ "<br>	Incase of any bug please report to administration"
				+ "<br><br>	- Regards : Voteroid");
		infoLabel.setIcon(new ImageIcon("rules175.png"));
		infoLabel.setHorizontalTextPosition(JLabel.CENTER);
		infoLabel.setVerticalTextPosition(JLabel.BOTTOM);
		infoLabel.setIconTextGap(10);
		infoLabel.setBounds(50,0,500,400);
		infoLabel.setForeground(Color.WHITE);
		infoLabel.setFont(new Font("Consolas",Font.PLAIN,20));
		
		this.getContentPane().setBackground(new Color(151, 70, 232));
		this.setLayout(null);
		this.setSize(600,500);
		this.add(okkButton);
		this.add(infoLabel);
		this.setResizable(false);
		this.setUndecorated(true);
		this.setVisible(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		if(e.getSource()==okkButton)
		{
			this.dispose();
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) 
	{	
		
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource()== okkButton)
		{
			okkButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {
		if(e.getSource()== okkButton)
		{
			okkButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		
	}
}
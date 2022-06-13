package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ExitFrame extends JFrame implements MouseListener

{
	JButton okkButton;
	JButton cancelButton;
	JLabel exitLabel;
	JPanel exitPanel;
	
	public ExitFrame()
	{
		exitPanel = new JPanel();
		exitPanel.setBounds(0,0,250,150);
		exitPanel.setLayout(null);
		exitPanel.setOpaque(false);
		exitPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		
		this.setSize(250,150);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setUndecorated(true);
		this.getContentPane().setBackground(new Color(151, 70, 232));
		//this.getContentPane().setBackground(new Color(43, 0, 87));
		
		okkButton= new JButton("Okk");
		okkButton.setBounds(25,100,100,40);
		okkButton.setFocusable(false);
		okkButton.setBackground(new Color(214, 0, 89));
		okkButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(Color.WHITE)));
		okkButton.setFont(new Font("Monospaced",Font.BOLD,20));
		okkButton.setForeground(Color.WHITE);
		okkButton.addMouseListener(this);
		

		cancelButton = new JButton("Cancel");
		cancelButton.setBounds(125,100,100,40);
		cancelButton.setFocusable(false);
		cancelButton.setBackground(new Color(214, 0, 89));
		cancelButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(Color.WHITE)));
		cancelButton.setFont(new Font("Monospaced",Font.BOLD,20));
		cancelButton.setForeground(Color.WHITE);
		cancelButton.addMouseListener(this);
		
		exitLabel = new JLabel("EXIT?");
		exitLabel.setIcon(new ImageIcon("exit90.png"));
		exitLabel.setIconTextGap(5);
		exitLabel.setForeground(Color.WHITE);
		exitLabel.setBounds(5,5,245,90);
		exitLabel.setFont(new Font("Consolas",Font.BOLD,45));
		
		exitPanel.add(okkButton);
		exitPanel.add(cancelButton);
		exitPanel.add(exitLabel);
		
		this.add(exitPanel);
		this.setVisible(true);
		
	}


	@Override
	public void mouseClicked(MouseEvent e) 
	{
		
		if(e.getSource() == okkButton)
		{
			System.exit(0);
		}
		else if (e.getSource() == cancelButton)
		{
			this.dispose();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource() == cancelButton)
		{
			cancelButton.setBackground(Color.LIGHT_GRAY);
		}
		else if(e.getSource() == okkButton)
		{
			okkButton.setBackground(Color.LIGHT_GRAY);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource() == cancelButton)
		{
			cancelButton.setBackground(new Color(214, 0, 89));
		}
		else if(e.getSource() == okkButton)
		{
			okkButton.setBackground(new Color(214, 0, 89));
		}
		
	}
}

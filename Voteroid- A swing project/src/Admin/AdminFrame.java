package Admin;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import GUI.BindFrame1;


public class AdminFrame extends JFrame implements MouseListener
{
	JPanel mainPanel;
	JButton addVoter;
	JButton addCandidate;
	JButton removeButton;
	JButton resultButton;
	JButton infoButton;
	JButton logoutButton;
	public AdminFrame(int aid)
	{
		
		
		//Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); // for getting the window dimension
		//this.setSize(screenSize.width,screenSize.height);
		
		this.setLayout(null);
	    this.setUndecorated(true);
	    this.setSize(3*125,2*125);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2,3));
		mainPanel.setBounds(0,0,3*125,2*125);
		
		addVoter = new JButton("+Voter");
		addVoter.setFocusable(false);
		addVoter.setIcon(new ImageIcon("user80.png"));
		addVoter.setHorizontalTextPosition(JButton.CENTER);
		addVoter.setVerticalTextPosition(JButton.BOTTOM);
		addVoter.setBackground(Color.WHITE);
		addVoter.setBorder(BorderFactory.createRaisedBevelBorder());
		addVoter.setFont(new Font("Monospaced",Font.BOLD,20));
		addVoter.setForeground(new Color(43, 0, 87));
		addVoter.addMouseListener(this);
		
		addCandidate = new JButton("+Candidate");
		addCandidate.setFocusable(false);
		addCandidate.setIcon(new ImageIcon("businessman80.png"));
		addCandidate.setHorizontalTextPosition(JButton.CENTER);
		addCandidate.setVerticalTextPosition(JButton.BOTTOM);
		addCandidate.setBackground(Color.WHITE);
		addCandidate.setBorder(BorderFactory.createRaisedBevelBorder());
		addCandidate.setFont(new Font("Monospaced",Font.BOLD,20));
		addCandidate.setForeground(new Color(43, 0, 87));
		addCandidate.addMouseListener(this);
		
		removeButton = new JButton("Remove");
		removeButton.setFocusable(false);
		removeButton.setIcon(new ImageIcon("remove80.png"));
		removeButton.setHorizontalTextPosition(JButton.CENTER);
		removeButton.setVerticalTextPosition(JButton.BOTTOM);
		removeButton.setBackground(Color.WHITE);
		removeButton.setBorder(BorderFactory.createRaisedBevelBorder());
		removeButton.setFont(new Font("Monospaced",Font.BOLD,20));
		removeButton.setForeground(new Color(43, 0, 87));
		removeButton.addMouseListener(this);
		
		resultButton = new JButton("Result");
		resultButton.setFocusable(false);
		resultButton.setIcon(new ImageIcon("result80.png"));
		resultButton.setHorizontalTextPosition(JButton.CENTER);
		resultButton.setVerticalTextPosition(JButton.BOTTOM);
		resultButton.setBackground(Color.WHITE);
		resultButton.setBorder(BorderFactory.createRaisedBevelBorder());
		resultButton.setFont(new Font("Monospaced",Font.BOLD,20));
		resultButton.setForeground(new Color(43, 0, 87));
		resultButton.addMouseListener(this);
		
		infoButton = new JButton("reset");
		infoButton.setFocusable(false);
		infoButton.setIcon(new ImageIcon("reset80.png"));
		infoButton.setHorizontalTextPosition(JButton.CENTER);
		infoButton.setVerticalTextPosition(JButton.BOTTOM);
		infoButton.setBackground(Color.WHITE);
		infoButton.setBorder(BorderFactory.createRaisedBevelBorder());
		infoButton.setFont(new Font("Monospaced",Font.BOLD,20));
		infoButton.setForeground(new Color(43, 0, 87));
		infoButton.addMouseListener(this);
		
		logoutButton = new JButton("Logout");
		logoutButton.setFocusable(false);
		logoutButton.setIcon(new ImageIcon("exit801.png"));
		logoutButton.setHorizontalTextPosition(JButton.CENTER);
		logoutButton.setVerticalTextPosition(JButton.BOTTOM);
		logoutButton.setBackground(Color.WHITE);
		logoutButton.setBorder(BorderFactory.createRaisedBevelBorder());
		logoutButton.setFont(new Font("Monospaced",Font.BOLD,20));
		logoutButton.setForeground(new Color(43, 0, 87));
		logoutButton.addMouseListener(this);
		
		mainPanel.add(addVoter);
		mainPanel.add(addCandidate);
		mainPanel.add(removeButton);
		mainPanel.add(resultButton);
		mainPanel.add(infoButton);
		mainPanel.add(logoutButton);
		
		this.add(mainPanel);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()== logoutButton)
		{
			this.dispose();
			BindFrame1 bind = new BindFrame1();
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource() == addCandidate)
		{
			addCandidate.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			addCandidate.setFont(new Font("Monospaced",Font.BOLD,25));
		}
		else if(e.getSource() == addVoter)
		{
			addVoter.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			addVoter.setFont(new Font("Monospaced",Font.BOLD,25));
		}	
		else if(e.getSource() == removeButton)
		{
			removeButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			removeButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}	
		else if(e.getSource() == resultButton)
		{
			resultButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			resultButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}	
		else if(e.getSource() == infoButton)
		{
			infoButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			infoButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}	
		else if(e.getSource() == logoutButton)
		{
			logoutButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			logoutButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}	
	}
	@Override
	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource() == addCandidate)
		{
			addCandidate.setBorder(BorderFactory.createRaisedBevelBorder());
			addCandidate.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource() == addVoter)
		{
			addVoter.setBorder(BorderFactory.createRaisedBevelBorder());
			addVoter.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource() == removeButton)
		{
			removeButton.setBorder(BorderFactory.createRaisedBevelBorder());
			removeButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource() == resultButton)
		{
			resultButton.setBorder(BorderFactory.createRaisedBevelBorder());
			resultButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource() == infoButton)
		{
			infoButton.setBorder(BorderFactory.createRaisedBevelBorder());
			infoButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource() == logoutButton)
		{
			logoutButton.setBorder(BorderFactory.createRaisedBevelBorder());
			logoutButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		
	}
}

package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import connection.DatabaseOperations;

public class VotingFrame extends JFrame implements MouseListener,ItemListener
{
	JButton logoutButton;
	JButton rulesButton;
	JScrollPane scroll;
	int numberOfCandidates = DatabaseOperations.numberOfCandidates();
	JLabel[] voterLabel;
	JLabel[] nameLabel;
	JLabel[] logoLabel;
	JButton[] candidButton;
	JPanel mainPanel;
	JPanel outerPanel;
	JLabel userLabel;
	JLabel voteroid;
	
	JCheckBox check;
	JButton voteButton;
	int selected = 0;
	int vid;
	
	public VotingFrame(int vid)
	{
		this.vid = vid;
		this.setLayout(null);
		//this.setContentPane(new JLabel(new ImageIcon("contentPane1.jpg")));
		this.getContentPane().setBackground(Color.BLACK);
		logoutButton = new JButton("Logout");
		logoutButton.setBounds(1150,300,150,200);
		logoutButton.setIcon(new ImageIcon("logout90.png"));
		logoutButton.setFont(new Font("Monospaced",Font.BOLD,25));
		logoutButton.setForeground(Color.WHITE);
		logoutButton.setFocusable(false);
		logoutButton.setOpaque(false);
		logoutButton.setContentAreaFilled(false);
		logoutButton.setBorderPainted(false);
		logoutButton.setHorizontalTextPosition(JButton.CENTER);
		logoutButton.setVerticalTextPosition(JButton.BOTTOM);
		logoutButton.addMouseListener(this);
		
		rulesButton = new JButton("Rules");
		rulesButton.setBounds(1000,300,150,200);
		rulesButton.setIcon(new ImageIcon("rules90.png"));
		rulesButton.setFont(new Font("Monospaced",Font.BOLD,25));
		rulesButton.setForeground(Color.WHITE);
		rulesButton.setFocusable(false);
		rulesButton.setOpaque(false);
		rulesButton.setContentAreaFilled(false);
		rulesButton.setBorderPainted(false);
		rulesButton.setHorizontalTextPosition(JButton.CENTER);
		rulesButton.setVerticalTextPosition(JButton.BOTTOM);
		rulesButton.addMouseListener(this);
		
		mainPanel = new JPanel();
		mainPanel.setPreferredSize(new Dimension(1000, 650 +(numberOfCandidates*(155)) ));
		mainPanel.setLayout(null);
		mainPanel.setBackground(new Color(43, 0, 87));
		mainPanel.setOpaque(true);
		
		outerPanel = new JPanel();
		outerPanel.setBounds(0,0,1000,650);
		outerPanel.setLayout(new FlowLayout());
		outerPanel.setOpaque(false);
		
		voterLabel = new JLabel[numberOfCandidates];
		nameLabel = new JLabel[numberOfCandidates];
		logoLabel = new JLabel[numberOfCandidates];
		candidButton = new JButton[numberOfCandidates];
		
		voteroid = new JLabel();
		voteroid.setIcon(new ImageIcon("secureVoting.png"));
		voteroid.setBounds(1050,0,200,200);
				
		
		for(int i=0; i<numberOfCandidates; i++)
		{
			voterLabel[i] = new JLabel();
			nameLabel[i] = new JLabel();
			logoLabel[i] = new JLabel();
			candidButton[i] = new JButton();
			
			String temp = "";
			String slogan = DatabaseOperations.getCSlogan(i+1);
			
			logoLabel[i].setIcon(new ImageIcon(DatabaseOperations.getCLogo(i+1)));
			logoLabel[i].setBounds(20,0,150,150);
			
			candidButton[i].setBounds(50, 50+i*(150)+5,900,150); 
			candidButton[i].setLayout(null);
			candidButton[i].setFocusable(false);
			candidButton[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
			candidButton[i].setBackground(new Color(43, 0, 87));
			candidButton[i].addMouseListener(this);
			
			
			for(int j =0; j<slogan.length(); j++)
			{
				if(j%70 == 0)
				{
					temp = temp + "<br>";
					temp = temp+slogan.charAt(j);
				}
				else
				{
					temp = temp+slogan.charAt(j);
				}
			}
			voterLabel[i].setText("<html>"+temp+"</html>");
			voterLabel[i].setFont(new Font("Monospaced",Font.PLAIN,16));
			voterLabel[i].setBounds(170, 25, 880, 100);
			voterLabel[i].setVerticalTextPosition(JLabel.TOP);
			voterLabel[i].setForeground(Color.WHITE);
			
			nameLabel[i].setText(DatabaseOperations.getCName(i+1));
			nameLabel[i].setFont(new Font("Monospaced",Font.BOLD,30));
			nameLabel[i].setHorizontalTextPosition(JLabel.CENTER);
			nameLabel[i].setVerticalTextPosition(JLabel.TOP);
			nameLabel[i].setBounds(170, 0, 880, 50);
			nameLabel[i].setForeground(Color.WHITE);
			
			candidButton[i].add(logoLabel[i]);
			candidButton[i].add(nameLabel[i]);
			candidButton[i].add(voterLabel[i]);
			
			mainPanel.add(candidButton[i]);	
		}
		
		scroll = new JScrollPane(mainPanel);
		scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setOpaque(false);
		scroll.setBackground(Color.WHITE);
		scroll.setPreferredSize(new Dimension(1000,650));
		
		outerPanel.add(scroll);
		
		voteButton = new JButton("PLACE VOTE !");
		voteButton.setBounds(1050,600,300,60);
		voteButton.setFocusable(false);
		voteButton.setBackground(Color.LIGHT_GRAY);
		voteButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(Color.WHITE)));
		voteButton.setFont(new Font("Monospaced",Font.BOLD,25));
		voteButton.setForeground(Color.WHITE);
		voteButton.addMouseListener(this);
		voteButton.setEnabled(false);
		
		check = new JCheckBox("I Agree with the policies of the selected candidate, and would like to place my vote.");
		check.setSelected(false);
		check.setIcon(new ImageIcon("tick30.png"));
		check.setSelectedIcon(new ImageIcon("cross30.png"));
		check.setForeground(Color.WHITE);
		check.addItemListener(this);	
		check.setFont(new Font("Consolas",Font.BOLD,20));
		check.setBounds(5,660,1000,50);
		check.setFocusable(false);
		check.setOpaque(false);
		
		userLabel = new JLabel();
		userLabel.setIcon(new ImageIcon("user50.png"));
		userLabel.setText("<html>NAME : "+DatabaseOperations.getVName(vid)+"<br> ADHAAR : "+DatabaseOperations.getVAdhaar(vid)+"</html>");
		userLabel.setFont(new Font("Consolas",Font.BOLD,20));
		userLabel.setForeground(Color.WHITE);
		userLabel.setBounds(1025,500,400,100);
		
			
		this.getContentPane().add(outerPanel);
		this.add(logoutButton);
		this.add(rulesButton);
		this.add(voteButton);
		this.add(voteroid);
		this.getContentPane().add(check);
		this.add(userLabel);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		this.setResizable(false);
	
		this.setUndecorated(true);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource()== logoutButton)
		{
			this.dispose();
			BindFrame1 bind = new BindFrame1();
		}
		if(e.getSource()== rulesButton)
		{
			RulesFrame framerule = new RulesFrame();
		}
		if(e.getSource() == voteButton && voteButton.isEnabled())
		{
			if(selected != 0)
			{
				DatabaseOperations.giveVote(selected);
				DatabaseOperations.updateVoteTo(vid, selected);
				this.dispose();
				BindFrame1 bind = new BindFrame1();
				VotePlacedFrame voteplaced = new VotePlacedFrame();
			}
			else if(selected == 0)
			{
				SelectCandidateFrame framecandi = new SelectCandidateFrame();
			}
			
		}
		if(e.getSource() != voteButton && e.getSource()!= logoutButton)
		{
			for(int i=0; i<numberOfCandidates; i++)
			{
				candidButton[i].setBorder(BorderFactory.createLineBorder(Color.WHITE, 3));
				candidButton[i].setBackground(new Color(43, 0, 87));
				if(e.getSource() == candidButton[i] )
				{
					candidButton[i].setBorder(BorderFactory.createLineBorder(new Color(214, 0, 89),3));
					candidButton[i].setBackground(new Color(214, 0, 89));
					selected = i+1;
				}
			}
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e) 
	{
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource() == logoutButton)
		{
			logoutButton.setIcon(new ImageIcon("logout125.png"));
			logoutButton.setFont(new Font("Monospaced",Font.BOLD,30));
		}
		if(e.getSource() == rulesButton)
		{
			rulesButton.setIcon(new ImageIcon("rules125.png"));
			rulesButton.setFont(new Font("Monospaced",Font.BOLD,30));
		}
		if(e.getSource() == voteButton && voteButton.isEnabled())
		{
			voteButton.setFont(new Font("Monospaced",Font.BOLD,40));
			voteButton.setBackground(new Color(43, 0, 87));
		}
		
	}
	@Override
	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource() == logoutButton)
		{
			logoutButton.setIcon(new ImageIcon("logout90.png"));
			logoutButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}
		if(e.getSource() == rulesButton)
		{
			rulesButton.setIcon(new ImageIcon("rules90.png"));
			rulesButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}
		if(e.getSource() == voteButton && voteButton.isEnabled())
		{
			voteButton.setFont(new Font("Monospaced",Font.BOLD,25));
			voteButton.setBackground(new Color(214, 0, 89));
		}
		
	}
	@Override
	public void itemStateChanged(ItemEvent e)
	{
		if(e.getSource() == check)
		{
			if(check.isSelected() ==  true)
			{
				voteButton.setEnabled(true);
				voteButton.setBackground(new Color(214, 0, 89));
			}
			if(check.isSelected() == false)
			{
				voteButton.setEnabled(false);
				voteButton.setBackground(Color.LIGHT_GRAY);
			}
		}
		
	}
	
}

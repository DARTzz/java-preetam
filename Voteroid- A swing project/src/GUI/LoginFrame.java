package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Admin.AdminFrame;
import connection.DatabaseOperations;

public class LoginFrame extends JFrame implements MouseListener
{
	JPanel panel1;
	JButton voterButton;
	JButton candidateButton;
	JButton infoButton;
	JButton exitButton;
	JLabel projectLogo;
	JLabel adhaarLabel;
	JLabel nameLabel;
	JLabel idLabel;
	JLabel passwordLabel;
	JTextField adhaarField;
	JTextField nameField;
	JTextField idField;
	JTextField passwordField;
	JButton enterButton;
	JButton loginButton;
	int ano = 0;
	
	public LoginFrame()
	{
		this.setLayout(null); 
	
		voterButton = new JButton("VOTE");
		voterButton.setFocusable(false);
		voterButton.setIcon(new ImageIcon("user80.png"));
		voterButton.setHorizontalTextPosition(JButton.CENTER);
		voterButton.setVerticalTextPosition(JButton.BOTTOM);
		voterButton.setBackground(Color.WHITE);
		voterButton.setBorder(BorderFactory.createRaisedBevelBorder());
		voterButton.setFont(new Font("Monospaced",Font.BOLD,20));
		voterButton.setForeground(new Color(43, 0, 87));
		voterButton.addMouseListener(this);
		
		candidateButton = new JButton("ADMIN");
		candidateButton.setFocusable(false);
		candidateButton.setIcon(new ImageIcon("businessman80.png"));
		candidateButton.setHorizontalTextPosition(JButton.CENTER);
		candidateButton.setVerticalTextPosition(JButton.BOTTOM);
		candidateButton.setBackground(new Color(151, 70, 232));
		candidateButton.setBorder(BorderFactory.createRaisedBevelBorder());
		candidateButton.setFont(new Font("Monospaced",Font.BOLD,20));
		candidateButton.setForeground(new Color(43, 0, 87));
		candidateButton.addMouseListener(this);
		
		infoButton = new JButton();
		infoButton.setFocusable(false);
		//infoButton.setBackground(new Color(172, 136, 219));
		infoButton.setIcon(new ImageIcon("info90.png"));
		infoButton.setBorder(BorderFactory.createRaisedBevelBorder());
		infoButton.setFont(new Font("Monospaced",Font.BOLD,20));
		infoButton.setOpaque(false);
		infoButton.setContentAreaFilled(false);
		infoButton.setBorderPainted(false);
		infoButton.setForeground(Color.WHITE);
		infoButton.addMouseListener(this);
		
		exitButton = new JButton();
		exitButton.setFocusable(false);
		exitButton.setIcon( new ImageIcon("exit90.png"));
		exitButton.setBackground(new Color(172, 136, 219));
		exitButton.setBorder(BorderFactory.createRaisedBevelBorder());
		exitButton.setFont(new Font("Monospaced",Font.BOLD,20));
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.setForeground(Color.WHITE);
		exitButton.addMouseListener(this);
		
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(4,1));
		panel1.setBounds(0,0,125,500);
		panel1.setBackground(new Color(43, 0, 87));
		panel1.setOpaque(true);
		panel1.add(voterButton);
		panel1.add(candidateButton);
		panel1.add(infoButton);
		panel1.add(exitButton);
		
		projectLogo = new JLabel();
		projectLogo.setIcon(new ImageIcon("secureVoting.png"));
		projectLogo.setBounds(250,0,200,200);
		
		nameLabel = new JLabel("Enter full name below : ");
		nameLabel.setFont(new Font("Consolas",Font.PLAIN,18));
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setBounds(225,200,250,50);
		
		nameField = new JTextField(30);
		nameField.setFont(new Font("Monospaced",Font.BOLD,20));
		nameField.setForeground(new Color(43, 0, 87));
		nameField.setBounds(225,250,250,25);
		
		adhaarLabel = new JLabel("Enter Adhaar ID below : "); 
		adhaarLabel.setFont(new Font("Consolas",Font.PLAIN,18));
		adhaarLabel.setForeground(Color.WHITE);
		adhaarLabel.setBounds(225,280,250,50);

		adhaarField = new JTextField(30);
		adhaarField.setFont(new Font("Consolas",Font.ITALIC,20));
		adhaarField.setForeground(new Color(43, 0, 87));
		adhaarField.setBounds(225,330,250,25);
		
		idLabel = new JLabel("Enter Admin ID below : ");
		idLabel.setFont(new Font("Consolas",Font.PLAIN,18));
		idLabel.setForeground(Color.WHITE);
		idLabel.setBounds(225,200,250,50);
		idLabel.setVisible(false);
		
		idField = new JTextField(30);
		idField.setFont(new Font("Monospaced",Font.BOLD,20));
		idField.setForeground(new Color(43, 0, 87));
		idField.setBounds(225,250,250,25);
		idField.setVisible(false);
		
		passwordLabel = new JLabel("Enter password below : "); 
		passwordLabel.setFont(new Font("Consolas",Font.PLAIN,18));
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setBounds(225,280,250,50);
		passwordLabel.setVisible(false);

		passwordField = new JTextField(30);
		passwordField.setFont(new Font("Consolas",Font.ITALIC,20));
		passwordField.setForeground(new Color(43, 0, 87));
		passwordField.setBounds(225,330,250,25);
		passwordField.setVisible(false);
		
		enterButton = new JButton("ENTER");
		enterButton.setBounds(250,400,200,75);
		enterButton.setFocusable(false);
		enterButton.setBackground(new Color(214, 0, 89));
		enterButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(Color.WHITE)));
		enterButton.setFont(new Font("Monospaced",Font.BOLD,30));
		enterButton.setForeground(Color.WHITE);
		enterButton.addMouseListener(this);
		
		loginButton = new JButton("LOGIN");
		loginButton.setBounds(250,400,200,75);
		loginButton.setFocusable(false);
		loginButton.setBackground(new Color(214, 0, 89));
		loginButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(Color.WHITE)));
		loginButton.setFont(new Font("Monospaced",Font.BOLD,30));
		loginButton.setForeground(Color.WHITE);
		loginButton.addMouseListener(this);
		loginButton.setVisible(false);
	
		this.setSize(600,500);
		this.add(panel1);
		this.add(nameLabel);
		this.add(nameField);
		this.add(adhaarLabel);
		this.add(adhaarField);
		this.add(projectLogo);
		this.add(enterButton);
		this.add(idField);
		this.add(idLabel);
		this.add(passwordField);
		this.add(passwordLabel);
		this.add(loginButton);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(43, 0, 87));
		this.setUndecorated(true);
		this.setVisible(true);
	
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mousePressed(MouseEvent e) 
	{	
		if(e.getSource()== exitButton)
		{
			ExitFrame newframe = new ExitFrame(); 
		}
		else if(e.getSource()== infoButton)
		{
			InfoFrame frameinfo = new InfoFrame();
		}
		else if(e.getSource() == candidateButton)
		{
			candidateButton.setBackground(Color.WHITE);
			voterButton.setBackground(new Color(151, 70, 232));
			nameField.setVisible(false);
			adhaarField.setVisible(false);
			nameLabel.setVisible(false);
			adhaarLabel.setVisible(false);
			enterButton.setVisible(false);
			idField.setVisible(true);
			passwordField.setVisible(true);
			idLabel.setVisible(true);
			passwordLabel.setVisible(true);
			loginButton.setVisible(true);
		}
		else if(e.getSource() == voterButton)
		{
			voterButton.setBackground(Color.WHITE);
			candidateButton.setBackground(new Color(151, 70, 232));
			nameField.setVisible(true);
			adhaarField.setVisible(true);
			nameLabel.setVisible(true);
			adhaarLabel.setVisible(true);
			enterButton.setVisible(true);
			idField.setVisible(false);
			passwordField.setVisible(false);
			idLabel.setVisible(false);
			passwordLabel.setVisible(false);
			loginButton.setVisible(false);
		}
		else if(e.getSource() == enterButton)
		{
			if(DatabaseOperations.validVoterCheck(nameField.getText(), adhaarField.getText()) == true)
			{
				if(DatabaseOperations.voteTo(nameField.getText(), adhaarField.getText()) == 0)
				{
					VotingFrame votingFrame = new VotingFrame(DatabaseOperations.getVID(nameField.getText(), adhaarField.getText()));
					BindFrame1.endPain();	
				}
				else
				{
					AlreadyVotedFrame frame1 = new AlreadyVotedFrame();
				}
							
			}
			else
			{
				UnauthorisedVoter unautho = new UnauthorisedVoter();
			}
		}
		else if(e.getSource() == loginButton)
		{
			if(DatabaseOperations.validAdminCheck(Integer.parseInt(idField.getText()), passwordField.getText()) == true)
			{

					BindFrame1.endPain();
					AdminFrame admframe = new AdminFrame(DatabaseOperations.getANo(Integer.parseInt(idField.getText()), passwordField.getText()));
					WelcomeAdmin adminframe = new WelcomeAdmin();	
				
			}
			else
			{
				UnauthorisedAdmin unautho = new UnauthorisedAdmin();
			}
		}
	}


	@Override
	public void mouseReleased(MouseEvent e) 
	{
		// TODO Auto-generated method stub
		
	}


	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource() == infoButton)
		{
			infoButton.setIcon(new ImageIcon("info125.png"));
			infoButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
		}
		else if(e.getSource() == exitButton)
		{
			exitButton.setIcon( new ImageIcon("exit125.png"));
			exitButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
		}
		else if(e.getSource() == candidateButton)
		{
			candidateButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			candidateButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}
		else if(e.getSource() == voterButton)
		{
			voterButton.setBorder(BorderFactory.createBevelBorder(1, Color.PINK, Color.WHITE));
			voterButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}		
		else if(e.getSource()== enterButton)
		{
			enterButton.setFont(new Font("Monospaced",Font.BOLD,40));
		}
		else if(e.getSource()== loginButton)
		{
			loginButton.setFont(new Font("Monospaced",Font.BOLD,40));
		}
	}


	@Override
	public void mouseExited(MouseEvent e) 
	{	
		if(e.getSource() == infoButton)
		{
			infoButton.setIcon(new ImageIcon("info90.png"));
			infoButton.setBorder(BorderFactory.createRaisedBevelBorder());
		}
		else if(e.getSource() == exitButton)
		{
			exitButton.setIcon( new ImageIcon("exit90.png"));
			exitButton.setBorder(BorderFactory.createRaisedBevelBorder());
		}
		else if(e.getSource() == candidateButton)
		{
			candidateButton.setBorder(BorderFactory.createRaisedBevelBorder());
			candidateButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource() == voterButton)
		{
			voterButton.setBorder(BorderFactory.createRaisedBevelBorder());
			voterButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource()== enterButton)
		{
			enterButton.setFont(new Font("Monospaced",Font.BOLD,30));
		}
		else if(e.getSource()== loginButton)
		{
			loginButton.setFont(new Font("Monospaced",Font.BOLD,30));
		}
	}

}
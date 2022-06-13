package guiComponents;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import connection.DatabaseOperations;




public class LoginFrame extends JFrame implements ActionListener,FocusListener,KeyListener,MouseListener
{
	JButton signButton;
	JButton loginButton;
	JButton bottomButton;
	JButton exitButton;
	JButton infoButton;
	JTextField firstNameField;
	JTextField lastNameField;
	JTextField userNameField;
	JTextField passwordField;
	JLabel upLabel;
	String password = "";
	String star = "";
	
	public LoginFrame()
	{
		firstNameField = new JTextField(20);
		firstNameField.setBounds(30,300,155,25);
		firstNameField.setText("First Name");
		firstNameField.setFont(new Font("Consolas",Font.ITALIC,20));
		firstNameField.setForeground(Color.LIGHT_GRAY);
		firstNameField.addFocusListener(this);
		firstNameField.addMouseListener(this);
		
		lastNameField = new JTextField(20);
		lastNameField.setBounds(215,300,155,25);
		lastNameField.setText("Last Name");
		lastNameField.setFont(new Font("Consolas",Font.ITALIC,20));
		lastNameField.setForeground(Color.LIGHT_GRAY);
		lastNameField.addFocusListener(this);
		lastNameField.addMouseListener(this);
		
		userNameField = new JTextField(20);
		userNameField.setBounds(30,350,340,25);
		userNameField.setText("User Name");
		userNameField.setFont(new Font("Consolas",Font.ITALIC,20));
		userNameField.setForeground(Color.LIGHT_GRAY);
		userNameField.addFocusListener(this);
		userNameField.addMouseListener(this);
		
		passwordField = new JTextField(20);
		passwordField.setBounds(30,400,340,25);
		passwordField.setText("Password");
		passwordField.setFont(new Font("Consolas",Font.ITALIC,20));
		passwordField.setForeground(Color.LIGHT_GRAY); 
		passwordField.addFocusListener(this);
		passwordField.addKeyListener(this);
		passwordField.addMouseListener(this);
		
		exitButton = new JButton(new ImageIcon("exitIcon.png"));
		exitButton.setOpaque(false);
		exitButton.setContentAreaFilled(false);
		exitButton.setBorderPainted(false);
		exitButton.setFocusable(false);
		exitButton.addActionListener(this);
		exitButton.setBounds(340,0,50,70);
		exitButton.addMouseListener(this);
		
		signButton = new JButton("Sign Up");
		signButton.setBounds(48,25,144,40);
		signButton.setFocusable(false);
		signButton.setBackground(new Color(214, 0, 89));
		signButton.setBorder(BorderFactory.createRaisedBevelBorder());
		signButton.setFont(new Font("Monospaced",Font.BOLD,20));
		signButton.setForeground(Color.WHITE);
		signButton.addActionListener(this);
		signButton.addMouseListener(this);
		
		loginButton= new JButton("Login");
		loginButton.setBounds(192,25,144,40);
		loginButton.setFocusable(false);
		loginButton.setBackground(Color.LIGHT_GRAY);
		loginButton.setBorder(BorderFactory.createRaisedBevelBorder());
		loginButton.setFont(new Font("Monospaced",Font.BOLD,20));
		loginButton.setForeground(Color.WHITE);
		loginButton.addActionListener(this);
		loginButton.addMouseListener(this);

		bottomButton = new JButton("GET STARTED");
		bottomButton.setBounds(50,450,300,50);
		bottomButton.setFocusable(false);
		bottomButton.setBackground(new Color(214, 0, 89));
		bottomButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createEtchedBorder(),BorderFactory.createLineBorder(Color.WHITE)));
		bottomButton.setFont(new Font("Monospaced",Font.BOLD,30));
		bottomButton.setForeground(Color.WHITE);
		bottomButton.addActionListener(this);
		bottomButton.addMouseListener(this);
		
		upLabel = new JLabel("<html>Medical<br>Central<br>India</html>");
		upLabel.setIcon(new ImageIcon("md.png"));
		upLabel.setIconTextGap(5);
		upLabel.setForeground(Color.WHITE);
		upLabel.setBounds(23,80,360,165);
		upLabel.setFont(new Font("Monospaced",Font.BOLD,35));
		upLabel.addMouseListener(this);
		
		this.getContentPane().addMouseListener(this);
	
		this.setTitle("MEDICAL CENTRAL");
		this.setSize(400,500);
		this.setResizable(false);
		this.getContentPane().setBackground(new Color(43, 0, 87));
		//this.setContentPane(new JLabel(new ImageIcon("wll.jpg")));
		this.setIconImage((new ImageIcon("medicalLogo.png")).getImage());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setUndecorated(true);
		this.setVisible(true);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.add(signButton);
		this.add(loginButton);
		this.add(bottomButton);
		this.add(upLabel);
		this.add(firstNameField);
		this.add(lastNameField);
		this.add(exitButton);
		this.add(userNameField);
		this.add(passwordField);
		this.addMouseListener(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{		
		if(e.getSource() == loginButton)
		{
		
			
			
			loginButton.setBackground(new Color(214, 0, 89));
			signButton.setBackground(Color.LIGHT_GRAY);
			bottomButton.setText("LOGIN");

			this.setSize(400,400);
			firstNameField.setVisible(false);
			lastNameField.setVisible(false);
			bottomButton.setBounds(50,350,300,50);
			userNameField.setBounds(30,250,340,25);
			passwordField.setBounds(30,300,340,25);
				
			
		}
		else if(e.getSource() == signButton)
		{
			
			
			signButton.setBackground(new Color(214, 0, 89));
			loginButton.setBackground(Color.LIGHT_GRAY);
			bottomButton.setText("GET STARTED");
			this.setSize(400,500);
			firstNameField.setVisible(true);
			lastNameField.setVisible(true);
			bottomButton.setBounds(50,450,300,50);
			userNameField.setBounds(30,350,340,25);
			passwordField.setBounds(30,400,340,25);	
			
		}
		else if(e.getSource() == bottomButton)
		{
			if(bottomButton.getText()=="LOGIN")
			{
				int uID = DatabaseOperations.getUser(userNameField.getText(),password);
				if( uID == 0)
				{
					ExitFrame frameMe = new ExitFrame();
					frameMe.cancelButton.setText("Okk");
					frameMe.exitLabel.setText("Incorrect Details");
					frameMe.okkButton.setVisible(false);
				}
				else
				{
					JFrame loginFrame = new FinalFrame(uID);
					this.dispose();
				}
			}
			else if(bottomButton.getText() == "GET STARTED")
			{
				int uID = DatabaseOperations.insertUser(firstNameField.getText(), lastNameField.getText(), userNameField.getText(),password);
				if(uID == 0)
				{
					ExitFrame frameMe = new ExitFrame();
					frameMe.cancelButton.setText("Okk");
					frameMe.exitLabel.setText("Account exists");
					frameMe.okkButton.setVisible(false);
				}
				else if(uID == 1)
				{
					ExitFrame frameMe = new ExitFrame();
					frameMe.cancelButton.setText("Okk");
					frameMe.exitLabel.setText("Account Created");
					frameMe.okkButton.setVisible(false);
				}
			}
			
		}
		else if(e.getSource() == exitButton)
		{
			ExitFrame sureFrame = new ExitFrame();
		}
	}

	
	
	@Override
	public void focusGained(FocusEvent e) 
	{
		if(e.getSource() == firstNameField && firstNameField.getText().contentEquals("First Name"))
		{
			firstNameField.setText(null);
			firstNameField.setFont(new Font("Consolas",Font.PLAIN,20));
			firstNameField.setForeground(Color.BLACK);
		}
		else if(e.getSource() == lastNameField && lastNameField.getText().contentEquals("Last Name"))
		{
			lastNameField.setText(null);
			lastNameField.setFont(new Font("Consolas",Font.PLAIN,20));
			lastNameField.setForeground(Color.BLACK);
		}
		else if(e.getSource() == userNameField && userNameField.getText().contentEquals("User Name"))
		{
			userNameField.setText(null);
			userNameField.setFont(new Font("Consolas",Font.PLAIN,20));
			userNameField.setForeground(Color.BLACK);
		}
		else if(e.getSource() == passwordField && passwordField.getText().contentEquals("Password"))
		{
			passwordField.setText(null);
			passwordField.setFont(new Font("Consolas",Font.PLAIN,20));
			passwordField.setForeground(Color.BLACK);
		}		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if(e.getSource() == firstNameField && firstNameField.getText().isEmpty() == true)
		{
			firstNameField.setText("First Name");
			firstNameField.setFont(new Font("Consolas",Font.ITALIC,20));
			firstNameField.setForeground(Color.LIGHT_GRAY);
		}
		else if(e.getSource() == lastNameField && lastNameField.getText().isEmpty() == true)
		{
			lastNameField.setText("Last Name");
			lastNameField.setFont(new Font("Consolas",Font.ITALIC,20));
			lastNameField.setForeground(Color.LIGHT_GRAY);
		}
		else if(e.getSource() == userNameField && userNameField.getText().isEmpty() == true)
		{
			userNameField.setText("User Name");
			userNameField.setFont(new Font("Consolas",Font.ITALIC,20));
			userNameField.setForeground(Color.LIGHT_GRAY);
		}
		else if(e.getSource() == passwordField && passwordField.getText().isEmpty() == true)
		{
			passwordField.setText("Password");
			passwordField.setFont(new Font("Consolas",Font.ITALIC,20));
			passwordField.setForeground(Color.LIGHT_GRAY);
		}
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getSource() == passwordField)
		{

			if(e.getKeyCode() == KeyEvent.VK_BACK_SPACE )
			{
				if(password.length() != 0)
				{
					password = password.substring(0, password.length()-1);
					star = star.substring(0,password.length());
				}
			}
		}
	} 
	
	@Override
	public void keyReleased(KeyEvent e)
	{
		if(e.getSource() == passwordField)
		{		
			if(e.getKeyCode() != KeyEvent.VK_BACK_SPACE && e.getKeyCode() != KeyEvent.VK_CAPS_LOCK &&  e.getKeyCode() != KeyEvent.VK_SHIFT)
			{
				star = "";
				password = password + e.getKeyChar();
				for(int i=0; i<password.length(); i++)
				{
					star = star+"*";				
				}
			}
			passwordField.setText(star);
						
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {}

	@Override
	public void mousePressed(MouseEvent e) {}

	@Override
	public void mouseReleased(MouseEvent e) {}

	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource() == bottomButton)
		{
			bottomButton.setBackground(new Color(43, 0, 87));
			bottomButton.setFont(new Font("Monospaced",Font.BOLD,40));
		}
		else if(e.getSource() == loginButton)
		{
			loginButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}
		else if(e.getSource() == signButton)
		{
			signButton.setFont(new Font("Monospaced",Font.BOLD,25));
		}
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource() == bottomButton)
		{
			bottomButton.setBackground(new Color(214, 0, 89));
			bottomButton.setFont(new Font("Monospaced",Font.BOLD,30));
		}
		else if(e.getSource() == loginButton)
		{
			loginButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
		else if(e.getSource() == signButton)
		{
			signButton.setFont(new Font("Monospaced",Font.BOLD,20));
		}
	}
	
	
}

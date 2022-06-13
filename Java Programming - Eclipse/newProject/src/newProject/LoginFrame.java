package newProject;
import java.awt.Color;
import java.awt.Font;
//102-104
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import connection.DatabaseOperations;

public class LoginFrame extends JFrame implements ActionListener, KeyListener, WindowListener, MouseListener
{
	JButton signButton;
	JButton loginButton;
	JTextField userText;
	JTextField passwordText;
	JLabel userLabel;
	JLabel passwordLabel;
	JLabel hospitalLabel;
	JLabel hospitalIcon;
	String password = "";
	String star = "";
	
	
	public LoginFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hospitalLabel = new JLabel("Hospital\n Management");
		ImageIcon icon2 = new ImageIcon("newlogo.png");
		
		hospitalIcon = new JLabel(icon2);
		
		signButton = new JButton("Sign Up");
		ImageIcon icon = new ImageIcon("IconLight.png");
		
		loginButton = new JButton("LOGIN");
		
		userLabel = new JLabel("User Name* :");
		userLabel.setFont(new Font("Consolas",Font.BOLD,18));
		userLabel.setBackground(new Color(119, 52, 235));
		userLabel.setForeground(Color.WHITE);
		userLabel.setOpaque(true);
		userLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		userLabel.setHorizontalTextPosition(JLabel.RIGHT);
		
		passwordLabel = new JLabel(" Password* :");
		passwordLabel.setFont(new Font("Consolas",Font.BOLD,18));
		passwordLabel.setBackground(new Color(119, 52, 235));
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setOpaque(true);
		passwordLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		passwordLabel.setHorizontalTextPosition(JLabel.RIGHT);
		
		userText = new JTextField(20);
		userText.setBorder(BorderFactory.createLineBorder(new Color(119, 52, 235)));
		userText.setFont(new Font("Consolas",Font.PLAIN,17));
		userText.setForeground(Color.BLACK);
		
		passwordText = new JTextField(20);
		passwordText.setBorder(BorderFactory.createLineBorder(new Color(119, 52, 235)));
		passwordText.setFont(new Font("Consolas",Font.ITALIC,17));
		passwordText.setForeground(Color.BLACK);
		
		signButton.addActionListener(this);
		signButton.setIcon(new ImageIcon("Picture2.png"));
		signButton.setIconTextGap(-35);
		signButton.setBackground(Color.LIGHT_GRAY);
		signButton.setForeground(Color.BLACK);
		signButton.setFont(new Font("Consolas",Font.BOLD,16));
		signButton.setVerticalTextPosition(JButton.CENTER);
		signButton.setHorizontalAlignment(JButton.LEFT);
		signButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(10), BorderFactory.createEtchedBorder()));
		
		loginButton.addActionListener(this);
		loginButton.setIcon(new ImageIcon("Picture2.png"));
		loginButton.setIconTextGap(-35);
		loginButton.setBackground(Color.LIGHT_GRAY);
		loginButton.setForeground(Color.BLACK);
		loginButton.setFont(new Font("Consolas",Font.BOLD,16));
		loginButton.setVerticalTextPosition(JButton.CENTER);
		loginButton.setHorizontalAlignment(JButton.LEFT);
		loginButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(10), BorderFactory.createEtchedBorder()));
		
		userText.addKeyListener(this);
		passwordText.addKeyListener(this);
		signButton.addMouseListener(this);
		loginButton.addMouseListener(this);
		loginButton.setEnabled(false);
		this.setTitle("Login");
		this.setIconImage(icon.getImage());
		this.setSize(275,150);
		this.setLayout(new GridLayout(4,2));
		this.add(hospitalIcon);
		this.add(hospitalLabel);
		this.add(userLabel);
		this.add(userText);
		this.add(passwordLabel);
		this.add(passwordText);
		this.add(loginButton);
		this.add(signButton);
		this.setVisible(true);	
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == loginButton)
		{
			int uID = DatabaseOperations.getUser(userText.getText(),password);
			if( uID == 0)
			{
				JOptionPane.showMessageDialog(null, "Incorrect Details", "message",JOptionPane.INFORMATION_MESSAGE );
			}
			else
			{
				JFrame loginFrame = new FinalFrame(uID);
				this.dispose();
			}
		}		
		if(e.getSource() == signButton)
		{
			
			this.setVisible(false);
			SignFrame frame = new SignFrame();
			frame.addWindowListener(this);
		}
	}
	

	@Override
	public void keyTyped(KeyEvent e) 
	{
		if(e.getSource() == passwordText|| e.getSource() == userText)
		{
			if(passwordText.getText().isEmpty() == true || userText.getText().isEmpty() == true)
			{
				loginButton.setEnabled(false);				
			}
			else
			{
				loginButton.setEnabled(true);	
			}
		}
		if(e.getSource() == passwordText)
		{
			
			if(passwordText.getText().isEmpty() == true)
			{
				passwordLabel.setText("Password* :");
			}
			else
			{
				passwordLabel.setText("Password  :");
			}
						
		}
		if(e.getSource() == userText)
		{
			if(userText.getText().isEmpty() == true)
			{
				userLabel.setText("User Name* :");
			}
			else
			{
				userLabel.setText("User Name  :");
			}
		}
	}
	
	@Override
	public void keyPressed(KeyEvent e) 
	{
		if(e.getSource() == passwordText)
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
		if(e.getSource() == passwordText)
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
			passwordText.setText(star);
						
		}
	}
	
	@Override
	public void windowClosed(WindowEvent e) 
	{
		System.out.println("Hello people of the world");
		this.setVisible(true);
	}
	
	@Override
	public void mouseEntered(MouseEvent e) 
	{
		if(e.getSource() == signButton)
		{
			signButton.setBackground(Color.GRAY);
		}
		if(e.getSource() == loginButton && loginButton.isEnabled())
		{
			loginButton.setBackground(Color.GRAY);
		}
	}

	@Override
	public void mouseExited(MouseEvent e) 
	{
		if(e.getSource() == signButton)
		{
			signButton.setBackground(Color.LIGHT_GRAY);
		}
		if(e.getSource() == loginButton && loginButton.isEnabled())
		{
			loginButton.setBackground(Color.LIGHT_GRAY);
		}
		
	} 

	
	
	@Override
	public void windowOpened(WindowEvent e) {}
	@Override
	public void windowClosing(WindowEvent e) {	}
	@Override
	public void windowIconified(WindowEvent e) {}
	@Override
	public void windowDeiconified(WindowEvent e) {}
	@Override
	public void windowActivated(WindowEvent e) {}
	@Override
	public void windowDeactivated(WindowEvent e) {}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseReleased(MouseEvent e) {}

	

}

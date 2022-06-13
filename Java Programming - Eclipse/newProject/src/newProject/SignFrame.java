package newProject;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import connection.DatabaseOperations;

public class SignFrame extends JFrame implements ActionListener, KeyListener 
{
	JButton createButton;
	JTextField userText;
	JTextField passwordText;
	JLabel userLabel;
	JLabel passwordLabel;
	
	public SignFrame()
	{
		createButton = new JButton("Create");
		userLabel = new JLabel("User Name* :");
		passwordLabel = new JLabel("Password* :");
		userText = new JTextField(20);
		userLabel.setFont(new Font("Consolas",Font.BOLD,18));
		userLabel.setBackground(new Color(119, 52, 235));
		userLabel.setForeground(Color.WHITE);
		userLabel.setOpaque(true);
		userLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		userLabel.setHorizontalTextPosition(JLabel.RIGHT);
		
		passwordText = new JTextField(20);
		passwordLabel.setFont(new Font("Consolas",Font.BOLD,18));
		passwordLabel.setBackground(new Color(119, 52, 235));
		passwordLabel.setForeground(Color.WHITE);
		passwordLabel.setOpaque(true);
		passwordLabel.setBorder(BorderFactory.createRaisedBevelBorder());
		passwordLabel.setHorizontalTextPosition(JLabel.RIGHT);

		
		createButton.addActionListener(this);
		createButton.setIcon(new ImageIcon("Picture2.png"));
		createButton.setIconTextGap(-35);
		createButton.setBackground(Color.LIGHT_GRAY);
		createButton.setForeground(Color.BLACK);
		createButton.setFont(new Font("Consolas",Font.BOLD,16));
		createButton.setVerticalTextPosition(JButton.CENTER);
		createButton.setHorizontalAlignment(JButton.LEFT);
		createButton.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createBevelBorder(10), BorderFactory.createEtchedBorder()));

		
		userText.addKeyListener(this);
		userText.setBorder(BorderFactory.createLineBorder(new Color(119, 52, 235)));

		passwordText.addKeyListener(this);
		passwordText.setBorder(BorderFactory.createLineBorder(new Color(119, 52, 235)));

		ImageIcon icon = new ImageIcon("IconLight.png");
		this.setTitle("Create User");
		this.setSize(275,150);
		this.setLayout(new GridLayout(3,2));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setIconImage(icon.getImage());
		this.add(userLabel);
		this.add(userText);
		this.add(passwordLabel);
		this.add(passwordText);
		this.add(createButton);
		this.setVisible(true);	
		this.setResizable(false);
		this.setLocationRelativeTo(null);
	}

	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == createButton)
		{
			int sid = DatabaseOperations.insertUser(userText.getText(),passwordText.getText());
			if(sid == 0)
			{
				JOptionPane.showMessageDialog(null, "User already exists", "message",JOptionPane.INFORMATION_MESSAGE );
			}
			else if(sid !=0)
			{
				JOptionPane.showConfirmDialog(null,"USER NAME : "+ userText.getText()+"\nPASSWORD : "+passwordText.getText()+"\n Has Been Created ! ","CONFIRN", JOptionPane.OK_CANCEL_OPTION);
				this.dispose();
			}
		}
	}


	@Override
	public void keyTyped(KeyEvent e) 
	{
		if(e.getSource() == passwordText|| e.getSource() == userText)
		{
			if(passwordText.getText().isEmpty() == true || userText.getText().isEmpty() == true)
			{
				createButton.setEnabled(false);				
			}
			else
			{
				createButton.setEnabled(true);	
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
	public void keyPressed(KeyEvent e) {}
	@Override
	public void keyReleased(KeyEvent e) {}
	
	
}

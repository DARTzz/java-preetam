import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener

{
	JButton button ;
	JTextField field ;
	public MyFrame()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		
		button = new JButton("Enter");
		button.addActionListener(this);
		field = new JTextField();
		field.setPreferredSize(new Dimension(250,40));
		field.setFont(new Font("Consolas",Font.ITALIC,30));
		field.setForeground(Color.GREEN);
		field.setBackground(Color.BLACK);
		field.setCaretColor(Color.GREEN);
		field.setText("enter name");
		
		
		this.add(field);
		this.add(button);
		this.pack();
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource() == button)
		{
			System.out.println(field.getText());
			button.setEnabled(false);
			field.setEditable(false);// disables textField
		}
	}
}

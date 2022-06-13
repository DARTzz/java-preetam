import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class NewPanel extends JPanel implements ActionListener
{
	JRadioButton button1;
	JRadioButton button2;
	JRadioButton button3;
	JTextField text1;
	ButtonGroup buttonGroup;
	Font font;
	
	public NewPanel()
	{
		button1 = new JRadioButton("Plain");
		button2 = new JRadioButton("Italic");
		button3 = new JRadioButton("Bold");
		text1 = new JTextField("Preetam");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		buttonGroup.add(button3);
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(text1);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button1)
		{
			text1.setFont(new Font("Serif",Font.PLAIN,20));
		}
		else if(e.getSource() == button2)
		{
			text1.setFont(new Font("Serif",Font.ITALIC,20));
		}
		else 
		{
			text1.setFont(new Font("Serif",Font.PLAIN,20));
		}
	}
}

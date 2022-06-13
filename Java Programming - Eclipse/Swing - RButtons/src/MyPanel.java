import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class MyPanel extends JPanel implements ActionListener
{
	JRadioButton button1;
	JRadioButton button2;
	ButtonGroup buttonGroup;
	public MyPanel()
	{
		button1 = new JRadioButton("Male");
		button2 = new JRadioButton("Female");
		buttonGroup = new ButtonGroup();
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		button1.addActionListener(this);
		button2.addActionListener(this);
		this.add(button1);
		this.add(button2);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		// String s= e.getActionCommand();
		if(e.getSource()==button1)
		{
			JOptionPane.showMessageDialog(this,"You are not a Female");
		}
		else
		{
			JOptionPane.showMessageDialog(this,"You are not a Male" );
		}
		
	}
}

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MyPanel extends JPanel implements ActionListener

{
	JCheckBox box1;
	JCheckBox box2;
	JCheckBox box3;
	JCheckBox box4;
	JCheckBox box5;
	JButton button;
	JLabel label;
	int sum;
	String str = "";
	
	
	public MyPanel()
	{
		label = new JLabel("Programming Language FEES");
		label.setVerticalAlignment(JLabel.TOP);
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setForeground(Color.BLUE);
		label.setFont(new Font("SansSerif",Font.ITALIC,30));
		this.add(label);
		box1 = new JCheckBox("JAVA    -----  5000");
		box2 = new JCheckBox("C++     -----  7000");
		box3 = new JCheckBox("C       -----  6000");
		box4 = new JCheckBox("PYTHON  -----  4000");
		box5 = new JCheckBox("ENGLISH -----  2000");
		button = new JButton("press me");
		button.addActionListener(this);
		this.add(box1);
		this.add(box2);
		this.add(box3);
		this.add(box4);
		this.add(box5);
		this.add(button);
		
	}	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button)
		{
			if(box1.isSelected())
			{
				str = str+box1.getText()+"\n";
				sum = sum + 5000;
			}
			if(box2.isSelected())
			{
				str = str+box2.getText()+"\n";
				sum = sum + 7000;
			}
			if(box3.isSelected())
			{
				str = str+box3.getText()+"\n";
				sum = sum + 6000;
			}
			if(box4.isSelected())
			{
				str = str+box4.getText()+"\n";
				sum = sum + 4000;
			}
			if(box5.isSelected())
			{
				str = str+box5.getText()+"\n";
				sum = sum + 2000;
			}		
			JOptionPane.showMessageDialog(this,str+ "\n_____________\n"+"TOTAL    ----- "+sum);
			str = "";
			sum = 0;
		}
	}

}

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DeleteFrame extends JFrame implements ActionListener 
{
	JTextField txt;
	JButton button;
	JLabel label;
	public DeleteFrame()
	{
		this.setSize(1000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new FlowLayout());
		txt = new JTextField();
		button = new JButton("Delete Data");
		label = new JLabel("ENTER THE ID TO BE DELETED : ");
		button.addActionListener(this);
		label.setFont(new Font("calibri",Font.BOLD,30));
		txt.setColumns(9);
		this.add(label);
		this.add(txt);
		this.add(button);
		this.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == button)
		{
			DbOperations.deleteStudent(Integer.parseInt(txt.getText()));
		}
	}
}

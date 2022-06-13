import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




 class MyFrame extends JFrame implements ActionListener
{
	JRadioButton button1;
	JRadioButton button2;
	JRadioButton button3;
	JRadioButton button4;
	JRadioButton button5;
	ButtonGroup group;
	public MyFrame()
	{
		this.setSize(1000,1000);
		this.getContentPane().setBackground(Color.BLACK);
		this.setResizable(true);
		this.setDefaultCloseOperation(MyFrame.EXIT_ON_CLOSE);
		this.setTitle("COMPUTER SCIENCE");
		this.setLayout(new FlowLayout());
		button1 = new JRadioButton("Add Data");
		button2 = new JRadioButton("Display Data");
		button3 = new JRadioButton("Delete Data");
		button4 = new JRadioButton("Edit Data");
		button5 = new JRadioButton("Quit");
		group = new ButtonGroup();
		group.add(button1);
		group.add(button2);
		group.add(button3);
		group.add(button4);
		group.add(button5);	
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		button5.addActionListener(this);
		this.add(button1);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == button1)
		{
			JFrame frame1 = new AddFrame();
			frame1.setVisible(true);
		}
		else if(e.getSource() == button2)
		{
			JFrame frame2 = new DisplayFrame();
		}
		else if(e.getSource() == button3)
		{
			JFrame frame3 = new DeleteFrame();
		}
		else if(e.getSource() == button4)
		{
			JFrame frame4 = new EditFrame();
		}
		else if(e.getSource() == button5)
		{
						
		}
	}
}

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame 
{
	public MyFrame()
	{
		this.setSize(750,750);
		this.setTitle("SAD NARUTO PROGRAM");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(Color.BLACK);
		this.setLayout(null);
		JPanel panel1 = new MyPanelRed();
		JPanel panel2 = new MyPanelGreen();
		JPanel panel3 = new MyPanelBlue();
		this.add(panel1);
		this.add(panel2);
		this.add(panel3);
	}
}

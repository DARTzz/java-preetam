import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class BorderLayoutMain 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout(10,10));
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel5 = new JPanel();
		
		panel1.setBackground(Color.red);
		panel2.setBackground(Color.white);
		panel3.setBackground(Color.green);
		panel4.setBackground(Color.blue);
		panel5.setBackground(Color.black);
		
		panel1.setPreferredSize(new Dimension(100,50));
		panel2.setPreferredSize(new Dimension(100,100));
		panel3.setPreferredSize(new Dimension(100,50));
		panel4.setPreferredSize(new Dimension(50,100));
		panel5.setPreferredSize(new Dimension(50,100));
		
//---------------------------------sub Panels of center panel--------------------------------------------------------------------------------------->
		
		panel2.setLayout(new BorderLayout(10,10));
		
		JPanel subpanel1 = new JPanel();
		JPanel subpanel2 = new JPanel();
		JPanel subpanel3 = new JPanel();
		JPanel subpanel4 = new JPanel();
		JPanel subpanel5 = new JPanel();
		
		subpanel1.setBackground(Color.red);
		subpanel2.setBackground(Color.yellow);
		subpanel3.setBackground(Color.green);
		subpanel4.setBackground(Color.blue);
		subpanel5.setBackground(Color.black);
		
		subpanel1.setPreferredSize(new Dimension(100,50));
		subpanel2.setPreferredSize(new Dimension(100,100));
		subpanel3.setPreferredSize(new Dimension(100,50));
		subpanel4.setPreferredSize(new Dimension(50,100));
		subpanel5.setPreferredSize(new Dimension(100,50));
		
		panel2.add(subpanel2,BorderLayout.NORTH);
		panel2.add(subpanel1,BorderLayout.EAST);
		panel2.add(subpanel3,BorderLayout.CENTER);
		panel2.add(subpanel4,BorderLayout.SOUTH);
		panel2.add(subpanel5,BorderLayout.WEST);
//---------------------------------------------------------------------------------------------------------------------------------------------------->		
		
		frame.add(panel1,BorderLayout.NORTH);
		frame.add(panel4,BorderLayout.EAST);
		frame.add(panel2,BorderLayout.CENTER);
		frame.add(panel3,BorderLayout.SOUTH);
		
		frame.add(panel5,BorderLayout.WEST);
	}
}

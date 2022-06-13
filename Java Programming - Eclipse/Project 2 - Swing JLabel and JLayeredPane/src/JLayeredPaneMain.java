import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class JLayeredPaneMain {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(1000,1000);
		JLayeredPane pane = new JLayeredPane();
		
		JPanel redPanel = new JPanel();
		redPanel.setBackground(Color.RED);
		JPanel bluePanel = new JPanel();
		bluePanel.setBackground(Color.BLUE);
		JPanel greenPanel = new JPanel();
		greenPanel.setBackground(Color.GREEN);
		
		redPanel.setPreferredSize(new Dimension(100,100));
		redPanel.setBounds(0,0,100,100);
		
		bluePanel.setPreferredSize(new Dimension(100,100));
		bluePanel.setBounds(50,50,100,100);
		
		greenPanel.setPreferredSize(new Dimension(100,100));
		greenPanel.setBounds(100,100,100,100);
		
		pane.setLayout(null);
		
		pane.add(redPanel,Integer.valueOf(0));
		pane.add(bluePanel,Integer.valueOf(2));
		pane.add(greenPanel, Integer.valueOf(1));
		
		frame.add(pane);
		
		frame.setVisible(true);
	}

}

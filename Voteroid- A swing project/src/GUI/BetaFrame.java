package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class BetaFrame extends JFrame
{
	JProgressBar bar; 
	JLabel label;
	Dimension dm;
	JLayeredPane lp;

	public BetaFrame()
	{
		this.setLayout(null);
	
		label = new JLabel();
		label.setIcon(new ImageIcon("secureVoting.png"));
		label.setBorder(BorderFactory.createEtchedBorder());
		label.setBackground(new Color(43, 0, 87));
		label.setOpaque(true);
		label.setBounds(400,250,200,200);

		
		bar = new JProgressBar(JProgressBar.VERTICAL);
		bar.setValue(0);
		bar.setBounds(0,0,1000,1000);
		bar.setForeground(new Color(214, 0, 89));
		bar.setBackground(new Color(43, 0, 87));

		
		lp = new JLayeredPane();
		lp.setBounds(0,0,1000,1000);
		lp.add(label,Integer.valueOf(1));
		lp.add(bar,Integer.valueOf(0));
		
		this.add(lp);

		
		this.setSize(1000,1000);
	    this.setUndecorated(true);
		this.getContentPane().setBackground(new Color(43, 0, 87));
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.addMouseListener(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		fill();
		
	}
	
	public void fill() 
	{
		int counter =0;
		while(counter <= 100)
		{
			this.bar.setValue(counter);
			try 
			{
				Thread.sleep(50);
			} 
			catch (InterruptedException e)
			{				
				e.printStackTrace();
			}
			counter ++;
		}
		this.dispose();
		BindFrame1 bind = new BindFrame1();
		
	}
}

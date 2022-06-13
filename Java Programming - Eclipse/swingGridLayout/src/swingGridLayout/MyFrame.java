package swingGridLayout;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFrame extends JFrame 
{
	public MyFrame()
	{
		JPanel northPanel = new UserPanel();
		JPanel southPanel = new RadioPanel();
		this.add(northPanel,BorderLayout.NORTH);
		this.add(southPanel,BorderLayout.SOUTH);
	}
}

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;


public class JFrameMain
{
	public static void main(String[] args)
	{
//      this is un-professional way
//		JFrame frame = new JFrame();
//		frame.setSize(420,420);
//		frame.setTitle("JFrame title ");
//		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
//		frame.setResizable(false);
//		ImageIcon icon = new ImageIcon("ico.jpg");
//		frame.setIconImage(icon.getImage());
//		frame.getContentPane().setBackground(Color.BLACK);// Content pane is the pane of frame visible
//		frame.setVisible(true);
		
		JFrame frame = new MyFrame();
		frame.setVisible(true);
		
		
		
	}

}

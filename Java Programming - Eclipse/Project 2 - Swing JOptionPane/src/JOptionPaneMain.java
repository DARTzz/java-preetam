
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class JOptionPaneMain {

	public static void main(String[] args) 
	{	
//		JOptionPane.showMessageDialog(null,"Hello Bruh","Title",JOptionPane.PLAIN_MESSAGE);
//		JOptionPane.showMessageDialog(null,"Hello Bruh","Title",JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(null,"Hello Bruh","Title",JOptionPane.QUESTION_MESSAGE);
//		JOptionPane.showMessageDialog(null,"Hello Bruh","Title",JOptionPane.WARNING_MESSAGE);
//		JOptionPane.showMessageDialog(null,"Hello Bruh","Title",JOptionPane.INFORMATION_MESSAGE);
		
//		int response = JOptionPane.showConfirmDialog(null, "are you a noob ??", "noob test", JOptionPane.YES_NO_CANCEL_OPTION);
		
//		String name = JOptionPane.showInputDialog("Enter your name");
		
		ImageIcon icon = new ImageIcon("thumb699.png");
		String[] responses = {"Yesh","No","GetOut"};
		
		int i = JOptionPane.showOptionDialog(null, 
				"HEllo Bruhh",
				"Title",
				JOptionPane.YES_NO_CANCEL_OPTION, 
				JOptionPane.WARNING_MESSAGE,
				icon,
				responses,
				1);
		System.out.println(i);
	}
}


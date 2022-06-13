import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame 
{
	public MyFrame()
	{
		//JPanel myPanel = new MyPanel();
		JPanel newPanel = new NewPanel();
		this.add(newPanel);
	}
}

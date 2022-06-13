import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class MyPanel extends JPanel implements ActionListener 
{
	JTextField textField ;
	JButton button ;
	public MyPanel()
	{
		textField = new JTextField(10); //(default placeholder,number of columns)
		button = new JButton("Preetam");   // button generates action event
	
		//button.addActionListener(new MyActionListner(textField.getText()));
		button.addActionListener(this);
		//setBound(x-coordinate,y-coordinate,width,height);
		textField.setBounds(50,100,200,50);
		textField.setText("name");
		//ring st=textField.getText();
		//stem.out.println(st);
		this.add(button);
		this.add(textField);
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s=textField.getText();
		if(e.getSource()==button) {
			System.out.println(s);
		}
		
	}
}

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MyPanel extends JPanel implements ItemListener 
{
	JTextArea text;
	JCheckBox box1;
	JCheckBox box2;
	JCheckBox box3;
	ButtonGroup bg;
	
	public MyPanel()
	{
		text = new JTextArea("Preetam",5,15);
		box1 = new JCheckBox("Java",false);
		box2 = new JCheckBox("C++",false);
		box3 = new JCheckBox("Python",false);
		bg = new ButtonGroup();
		box1.addItemListener(this);
		box2.addItemListener(this);
		box3.addItemListener(this);
		
		this.add(text);
		this.add(box1);
		this.add(box2);
		this.add(box3);
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{
//		if(e.getSource() == box1 && e.getStateChange()== ItemEvent.SELECTED)
//		{
//			text.setText("System.out.pintln");
//		}
//		if(e.getSource() == box2)
//		{
//			text.setText("printf()");
//		}
//		if(e.getSource() == box3)
//		{
//			text.setText("print");
//		}
		
		Object source=e.getItemSelectable();
		if(e.getStateChange()== ItemEvent.DESELECTED) {
			
			if(source==box1) {
				
			}
			if(source==box2) {
				
			}
			if(source==box3) {
				
			}
		}
		else {
			//if(box1.isSelected())
			if(source==box1) {
				text.setText("System.out.prinltn()");
			}
			if(source==box2) {
				text.setText("System.out.prinltn()");
			}
			if(source==box3) {
				text.setText("System.out.prinltn()");
			}
		}
		
	}

}

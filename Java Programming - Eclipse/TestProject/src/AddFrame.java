import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class AddFrame extends JFrame implements ActionListener
{
	
	Student st;
	JLabel frameLabel ;
	JLabel idLabel;
	JLabel nameLabel;
	JLabel courseLabel;
	JLabel descLabel;
	JLabel projectLabel;
	JTextField idField;
	JTextField nameField;
	JTextArea descArea;
	JRadioButton bcaButton;
	JRadioButton mcaButton;
	JRadioButton mbbsButton;
	JButton doneButton;
	ButtonGroup courceGroup;
	JCheckBox fdBox ;
	JCheckBox emsBox;
	JCheckBox nursingBox;
	
	public AddFrame()
	{
		this.setSize(1000,1000);
		this.setLayout(new FlowLayout());
		this.getContentPane().setBackground(Color.WHITE);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frameLabel = new JLabel("Add Student Data");
		idLabel = new JLabel("Enter Student ID");
		nameLabel = new JLabel("Enter name ");
		courseLabel = new JLabel("Select Course");
		descLabel = new JLabel("Discription");
		projectLabel = new JLabel("Select Projects");
		idField = new JTextField();
		idField.setColumns(9);
		nameField = new JTextField("Name");
		descArea = new JTextArea("Discription",15,5);
		bcaButton = new JRadioButton("BCA");
		mcaButton = new JRadioButton("MCA");
		mbbsButton = new JRadioButton("MBBS");
		doneButton = new JButton("DONE");
		bcaButton.addActionListener(this);
		mcaButton.addActionListener(this);
		mbbsButton.addActionListener(this);
		doneButton.addActionListener(this);
		courceGroup = new ButtonGroup();
		courceGroup.add(mbbsButton);
		courceGroup.add(bcaButton);
		courceGroup.add(mcaButton);
		fdBox = new JCheckBox("Fast Delivery");
		emsBox = new JCheckBox("EMS");
		nursingBox = new JCheckBox("Nursing Training");
		this.add(frameLabel);
		this.add(idLabel);
		this.add(idField);
		this.add(nameLabel);
		this.add(nameField);
		this.add(courseLabel);
		this.add(bcaButton);
		this.add(mcaButton);
		this.add(mbbsButton);
		this.add(descLabel);
		this.add(descArea);
		this.add(projectLabel);
		this.add(fdBox);
		this.add(emsBox);
		this.add(nursingBox);			
		this.add(doneButton);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{	
		if(e.getSource() == doneButton)
		{
			st = new Student();
			if(mcaButton.isEnabled())
			{
				st.setsCourse(mcaButton.getText());
			}
			else if(bcaButton.isEnabled())
			{
				st.setsCourse(bcaButton.getText());
			}
			else if(mbbsButton.isEnabled())
			{
				st.setsCourse(mbbsButton.getText());
			}
			st.setsReg(Integer.parseInt(idField.getText()));
			st.setsName(nameField.getText());
			st.setsDesc(descArea.getText());
			if(fdBox.isEnabled())
			{
				st.setsProjects(fdBox.getText());
			}
			else
			{
				st.setsProjects(" ");
			}
			if(emsBox.isEnabled())
			{
				st.setsProjects(emsBox.getText());
			}
			else
			{
				st.setsProjects(" ");
			}
			if(nursingBox.isEnabled())
			{
				st.setsProjects(nursingBox.getText());
			}
			else
			{
				st.setsProjects(" ");
			}
			DbOperations.addStudent(st);
		}
		
	}
}

import java.util.ArrayList;

public class Student 
{
	private int sReg;
	private String sName;
	private String sCourse;
	private String sDesc;
	private ArrayList<String> sProjects = new ArrayList<String>();
	public Student() {}
	public Student(int sReg, String sName, String sCourse, String sDesc, ArrayList<String> sProjects) 
	{
		this.sReg = sReg;
		this.sName = sName;
		this.sCourse = sCourse;
		this.sDesc = sDesc;
		this.sProjects = sProjects;
	}
	public int getsReg() {
		return sReg;
	}
	public void setsReg(int sReg) {
		this.sReg = sReg;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public String getsCourse() {
		return sCourse;
	}
	public void setsCourse(String sCourse) {
		this.sCourse = sCourse;
	}
	public String getsDesc() {
		return sDesc;
	}
	public void setsDesc(String sDesc) {
		this.sDesc = sDesc;
	}
	public ArrayList<String> getsProjects() {
		return sProjects;
	}
	public String getsStringProjects()
	{
		String string =""; 
		for(int i=0; i<3; i++)
		{
			if(sProjects.get(i) != " ")
			{
				string = string+sProjects.get(i)+",";
			}		
		}
		return string.substring(0, string.length()-2);
	}
	public void setsProjects(String sProjects) 
	{
		this.sProjects.add(sProjects) ;
	}
	
}

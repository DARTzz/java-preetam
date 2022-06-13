
public class Employee 
{
	private String eName;
	private int eRegNo;
	private float eAttendance;
	private double eSalary;
	
	public Employee(String name, int regNo, float attendance, double salary)
	{
		this.eName = name;
		this.eRegNo = regNo;
		this.eAttendance = attendance;
		this.eSalary = salary;
	}
	public void setName(String name)
	{
		this.eName = name;
	}
	public String getName()
	{
		return eName;
	}
	public void setRegNo(int regNo)
	{
		this.eRegNo = regNo;
	}
	public int getRegNo()
	{
		return eRegNo;
	}
	public void setAttendance(float attendance)
	{
		this.eAttendance = attendance;
	}
	public float getAttendance()
	{
		return eAttendance;
	}
	public void setSalary(double salary)
	{
		this.eSalary = salary;
	}
	public double getSalary()
	{
		return eSalary;
	}
}

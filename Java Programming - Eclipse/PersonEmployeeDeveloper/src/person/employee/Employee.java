package person.employee;

public class Employee extends Person
{
	private int id;
	private double salary;
	private float attendance;
	
	public Employee(String sname, int id, double salary, float attendance)
	{
		super(sname);
		this.id = id;
		this.salary = salary;
		this.attendance = attendance;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return this.id;
	}
	public void setSalary(double salary)
	{
		this.salary = salary;
	}
	public double getSalary()
	{
		return this.salary;
	}
	public void setAttendance(float attendance)
	{
		this.attendance = attendance;
	}
	public float getAttendance()
	{
		return this.attendance;
	}
}

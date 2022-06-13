
public class Employee 
{
	private int eID;
	private String eName;
	private static String eCEO = "Not_Set";
	private double eSalary;
	
	// Getters and Setters
	
	public int geteID() 
	{
		return eID;
	}
	public void seteID(int eID) 
	{
		this.eID = eID;
	}
	public String geteName() 
	{
		return eName;
	}
	public void seteName(String eName) 
	{
		this.eName = eName;
	}
	public static String geteCEO() 
	{
		return eCEO;
	}
	public static void seteCEO(String eCEO) 
	{
		Employee.eCEO = eCEO;
	}
	public double geteSalary() 
	{
		return eSalary;
	}
	public void seteSalary(double eSalary) 
	{
		this.eSalary = eSalary;
	}
	
	// Constructors
	
	public Employee()
	{
		
	}
	public Employee(int eID, String eName, double eSalary) 
	{
		super();
		this.eID = eID;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	
}

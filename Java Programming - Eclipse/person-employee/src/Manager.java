
public class Manager extends Employee
{
	private double eBonus;
	public Manager(String name, int regNo, float attendance, double salary, double eBonus)
	{
		super(name, regNo, attendance, salary);
		this.eBonus = eBonus;
	}
	public void setBonus(double bonus)
	{
		this.setSalary(this.getSalary()+bonus);
		this.eBonus = bonus;
	}
	public double getBonus()
	{
		
		return eBonus;
	}
}

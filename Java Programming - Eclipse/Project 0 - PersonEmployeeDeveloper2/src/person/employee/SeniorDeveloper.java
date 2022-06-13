package person.employee;

public class SeniorDeveloper extends Developer
{
	private float experience;
	private double bonus;
	
	public SeniorDeveloper(String name,int id, double salary, float attendance, String field, float experience, double bonus)
	{
		super(name,id,salary,attendance,field);
		this.experience = experience;
		this.bonus = bonus;
		this.setSalary(salary+bonus);
	}
	
	public void setExperience(float experience)
	{
		this.experience = experience;
	}
	public float getExperience()
	{
		return this.experience;
	}
	public void setBonus(double bonus)
	{
		this.setSalary(this.getSalary()- this.bonus+ bonus);
		this.bonus = bonus;
	}
	public double getBonus()
	{
		return this.bonus;
	}
}

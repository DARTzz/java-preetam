

public class Developer extends Employee 
{
	private String field;
	
	public Developer(String name, int id, double salary, float attendance, String field )
	{
		super(name, id, salary, attendance);
		this.field = field;
	}
	public void setField(String field)
	{
		this.field = field;
	}
	public String getField()
	{
		return this.field;
	}
}


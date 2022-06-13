
import java.lang.Math;
public class Person 
{
	private String name;
	private Double SystemID;
	public Person(String name)
	{
		this.name = name;
		SystemID = Math.random();
	}
	public void setName(String str)
	{
		this.name = str;
	}
	public String getName()
	{
		return this.name;
	}
	public Double getSystemID()
	{
		return this.SystemID;
	}
	
}

package student_info;
class Student
{
	private int m_stdID;
	private String m_stdName;
	private double m_stdFees;
	public Student(int id, String name, double fees)
	{
		m_stdID = id;
		m_stdName = name;
		m_stdFees = fees;
	}
	public int get_stdID()
	{
		return m_stdID;
	}
	public void set_stdID(int id)
	{
		m_stdID = id;
	}
	public String get_stdName()
	{
		return m_stdName;
	}
	
	public void set_stdName(String name)
	{
		m_stdName = name ;
	}
	public double get_stdFees()
	{
		return m_stdFees;
	}
	public void set_stdFees(double fees)
	{
		m_stdFees = fees;
	}
}
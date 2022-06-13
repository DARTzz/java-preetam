import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Employee 
{
	private int eID;
	private String eName;
	private double eSalary;
	
	public int geteID() {
		return eID;
	}
	public void seteID(int eID) {
		this.eID = eID;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public double geteSalary() {
		return eSalary;
	}
	public Employee(int eID, String eName, double eSalary) {
		this.eID = eID;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
	public void submitEmployeeData()
	{
		Connection con = DatabaseConnection.getConnection();
		
		try 
		{
			Statement  st =  con.createStatement();
			
			try 
			{
				 st.executeUpdate("create table employee(regNo int, name varchar(30), salary double)");
			}
			catch(SQLException ex)
			{
				System.out.println("Table already hai");
			}
			
			st.executeUpdate("insert into employee(regNo,name,salary) values("+eID+",'"+eName+"',"+eSalary+")");
			
		} catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	public static void displayData()
	{
		Connection con = DatabaseConnection.getConnection();
		try
		{
			Statement st = con.createStatement();
			try
			{
				ResultSet res = st.executeQuery("select * from employee");
				while(res.next())
				{
					System.out.println("ID : "+res.getInt(1)+" Name : "+res.getString(2)+" Salary : "+res.getDouble(3));
					System.out.println("________________________________________________________________________________________");
				}
			}
			catch(SQLException ex)
			{
				System.out.println(ex.getMessage());
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public void updateData(int rno)
	{
		Connection con = DatabaseConnection.getConnection();
		try
		{
			PreparedStatement prepst = con.prepareStatement("update employee set regNo = ?, Name = ?, Salary = ? where regNo = ?");
			try
			{
				prepst.setInt(1, eID);
				prepst.setString(2, eName);
				prepst.setDouble(3, eSalary);
				prepst.setInt(4, rno);
				prepst.executeUpdate();
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
		}
		catch(SQLException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	public static void deleteData(int Eid)
	{
		Connection con = DatabaseConnection.getConnection();
		try
		{
			Statement st = con.createStatement();
			st.executeUpdate("delete from employee where regNo = " + Eid);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
}

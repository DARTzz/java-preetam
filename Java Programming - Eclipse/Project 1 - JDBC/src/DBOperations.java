import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;


public class DBOperations 
{
	public void insertEmployee(int eID, String eName, double eSalary)throws Exception
	{	
		String query = "insert into employee_manager values(?,?,?,?)";
		Connection con = ConnectionEstablish.getConnection();
		PreparedStatement prepstat = con.prepareStatement(query);
		prepstat.setInt(1, eID);
		prepstat.setString(2, eName);
		prepstat.setString(3,Employee.geteCEO());
		prepstat.setDouble(4, eSalary);
		prepstat.execute();
		
	}
	public void fireEmployee(int eID) throws Exception
	{
		String query = "delete from employee_manager where eid = ?";
		Connection con = ConnectionEstablish.getConnection();
		PreparedStatement prepstat = con.prepareStatement(query);
		prepstat.setInt(1, eID);
		prepstat.execute();
		
	}
	public void changeCEO(String ceo) throws Exception
	{
		String query = "update employee_manager set eCEO = ? where eid > 0";
		Connection con = ConnectionEstablish.getConnection();
		PreparedStatement prepstat = con.prepareStatement(query);
		prepstat.setString(1, ceo);
		prepstat.execute();
	}
	public void showData() throws Exception
	{
		String query = "select * from employee_manager";
		Connection con = ConnectionEstablish.getConnection();
		Statement stat = con.createStatement();
		ResultSet res = stat.executeQuery(query);
		System.out.println("____________________________________________________________________\n");
		while(res.next())
		{
			System.out.println("ID : "+res.getInt(1));
			System.out.println("Name : "+res.getString(2));
			System.out.println("CEO : "+res.getString(3));
			System.out.println("Salary : "+res.getDouble(4));
			System.out.println("____________________________________________________________________\n");
		}
	}
	public void searchData(String eID) throws Exception
	{
		String query = "select * from employee_manager where eID = "+eID;
		Connection con = ConnectionEstablish.getConnection();
		Statement stat = con.createStatement();
		ResultSet res = stat.executeQuery(query);
		if(res.next() == false)
		{
			System.out.println("No Employee with Such ID ");
		}
		else
		{
			System.out.println("Employee Found !! \n\n");
			System.out.println("ID : "+res.getInt(1));
			System.out.println("Name : "+res.getString(2));
			System.out.println("CEO : "+res.getString(3));
			System.out.println("Salary : "+res.getDouble(4));
			System.out.println("____________________________________________________________________\n");
		}
		
	}
}

package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MakeConnection 
{
	static Connection con = null;
	static String url;
	static String address;
	public static void setConnection()
	{
		address = "com.mysql.cj.jdbc.Driver";
		url ="jdbc:mysql://localhost:3306/hospital_data";
		try 
		{
			Class.forName(address);
			con = DriverManager.getConnection(url,"root","dfgert56%^");
		} 
		catch (ClassNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}
		catch (SQLException e) {

			System.out.println(e.getMessage());
		}
	}
	
	public static Connection getConnection()
	{
		if(con == null)
		{
			MakeConnection.setConnection();
		}
		return con;
	}
	
	
}

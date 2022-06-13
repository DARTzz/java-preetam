package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations 
{
	private static Connection con = MakeConnection.getConnection();
	public static int insertUser(String firstName, String lastName, String userName, String password)
	{
		if(DatabaseOperations.getUser(userName, password) != 0)
		{
			return 0;
		}
		String query = "insert into userdata(firstname,lastname,uname,upass) values(?,?,?,?)";
		try 
		{
			PreparedStatement prestmt = con.prepareStatement(query);
			prestmt.setString(1, firstName);
			prestmt.setString(2, lastName);
			prestmt.setString(3, userName);
			prestmt.setString(4, password);
			prestmt.execute();
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		}
		return 1;
		
	}
	
	public static int getUser(String userName, String password)
	{
		int userId = 0;
		String query = "select * from userdata where uname='"+userName+"' and upass='"+password+"'";
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			if(res.next())
			{
				return res.getInt(1);				
			}
			else
			{
				return userId;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return -1;
	}
	
}

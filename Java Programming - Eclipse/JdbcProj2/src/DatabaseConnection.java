import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection 
{
	static final String DRIVER_ADD = "com.mysql.cj.jdbc.Driver";
	static final String USER_NAME = "root";
	static final String PASSWORD = "dfgert56%^";
	static final String URL = "jdbc:mysql://localhost/preetam";
	static Connection con = null;
	
	public static void createConnection() {
		try 
		{
			Class.forName(DRIVER_ADD);
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
		}
		catch(SQLException | ClassNotFoundException ex) 
		{
			System.out.println(ex.getMessage());
		}

	}
	
	public static Connection getConnection()
	{
		if(con==null) 
		{
			DatabaseConnection.createConnection();
		}
		return con;
		
		
	}
}

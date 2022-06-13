import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionClass 
{
	static String driver;
	static String url;
	static String userName;
	static String password;
	static Connection con = null;
	public static void makeConnection()
	{
		try
		{
			driver = "com.mysql.cj.jdbc.Driver";
			Class.forName(driver);
			System.out.println(Class.forName(driver));
			url = "jdbc:mysql://localhost:3306/jdbc";
			userName = "root";
			password = "dfgert56%^";
			con = DriverManager.getConnection(url,userName,password);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}		
	}
	public static Connection getConnection()
	{
		if(con == null)
		{
			
			makeConnection();
		}
		return con;
	}
}

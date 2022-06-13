import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionEstablish 
{
	private static Connection con;
	public static void loadDriver(String driverLocation)
	{
		try
		{
			Class.forName(driverLocation);
		}
		catch(Exception e)
		{
			System.out.println("The Driver class was not Found");
			e.getStackTrace();
		}
	}
	public static void makeConnection(String userName, String password, String url, String driverLocation)
	{
		ConnectionEstablish.loadDriver(driverLocation);
		try
		{
			con = DriverManager.getConnection(url,userName,password);
			System.out.println("Connection Established !!\n\n");
		}
		catch(Exception e)
		{
			System.out.println("There was some error please check the details again and rerun ");
			e.getStackTrace();
		}
	}
	public static Connection getConnection()
	{
		if(con == null)
		{
			System.out.println("Make Connection First !!");
			return null;
		}
		else
		{
			return con;
		}
	}
}

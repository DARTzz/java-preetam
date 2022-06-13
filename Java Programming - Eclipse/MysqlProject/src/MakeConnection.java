import java.sql.Connection;
import java.sql.DriverManager;

public class MakeConnection 
{
	static Connection con;
	public static Connection createConnection()
	{
		try 
		{
			//Loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");//this can throw class not found exception
			String user = "root";
			String password = "dfgert56%^";
			String url = "jdbc:mysql://127.0.0.1:3306/preetam";
			// getting a connection
			con = DriverManager.getConnection(url,user,password);
		}  
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}
}

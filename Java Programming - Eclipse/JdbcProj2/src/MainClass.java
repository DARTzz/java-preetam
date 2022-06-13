import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainClass 
{
	static final String DRIVER_ADD = "com.mysql.cj.jdbc.Driver";
	static final String USER_NAME = "root";
	static final String PASSWORD = "dfgert56%^";
	static final String URL = "jdbc:mysql://localhost/preetam";
	public static void main(String[] args)
	{
		Connection con = null;
		Statement stmt = null;
		try 
		{
			Class.forName(DRIVER_ADD);
			con = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
			stmt = con.createStatement();
			try 
			{
				String query = "create table sinfo(sid int, sname varchar(20))";
				stmt.executeUpdate(query);
			}
			catch(SQLException e)
			{
				System.out.println(e.getMessage());
			}
			String query2 = "insert into sinfo(sid,sname) values (1234,'Preetam Singh')";
			stmt.executeUpdate(query2);
			
			ResultSet rs=stmt.executeQuery("SELECT * FROM sinfo ");
			
			while(rs.next()) {
				//System.out.println(rs.getString("sname"));// rs.getString(column_name)
				System.out.println(rs.getInt(1)+rs.getString(2));
			}
		} 
		catch (SQLException | ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
	}
}

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbOperations 
{
	static Connection con;
	public static void addStudent(Student st)
	{
		con = ConnectionClass.getConnection();
		
		try 
		{
			String query = "insert into studentinfo values(?,?,?,?,?)";
			PreparedStatement prepstat =  con.prepareStatement(query);
			prepstat.setInt(1,st.getsReg());
			prepstat.setString(2,st.getsName());
			prepstat.setString(3,st.getsCourse());
			prepstat.setString(4,st.getsDesc());
			prepstat.setString(5,st.getsStringProjects());
			prepstat.execute();
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
	public static String displayStudent()
	{
		String string ="";
		con = ConnectionClass.getConnection();
		try
		{
			String query = "select * from studentinfo";
			Statement stat = con.createStatement();
			ResultSet set = stat.executeQuery(query);
			while(set.next())
			{
				string = string + set.getInt(1) +"    " + set.getString(2) + "    " + set.getString(3) + "    " + set.getString(4) + "    " + set.getString(5) + "\n";
			}
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
		return string;
	}
	public static void deleteStudent(int id)
	{
		con = ConnectionClass.getConnection();
		try
		{
			String query = "delete from studentinfo where sid = "+id;
			Statement stat = con.createStatement();
			stat.execute(query);
		}
		catch(SQLException e)
		{
			System.out.println(e.getMessage());
		}
	}
}

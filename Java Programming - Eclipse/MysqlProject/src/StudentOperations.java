import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class StudentOperations 
{
	public static void insertStudent(Student st)
	{
		try
		{
			// getting the connection
			Connection con = MakeConnection.createConnection();
			// Making our query which is Dynamic
			String query = "insert into student_info(sname,sphone,scity) values(?,?,?)";
			// getting object of prepared statement
			PreparedStatement prestat = con.prepareStatement(query);
			// using the set methods in PreparedStatement to set the value of dynamic variables
			prestat.setString(1, st.getStudentName());// we index the ? starting from 1
			prestat.setString(2, st.getStudentPhone());
			prestat.setString(3, st.getStudentCity());
			
			// now we execute
			prestat.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		} 
	}
	
	public static void deleteStudent(int uid)
	{
		try
		{
			Connection con = MakeConnection.createConnection();
			String query = "Delete from student_info where id = ?";
			PreparedStatement prestat = con.prepareStatement(query);
			prestat.setInt(1, uid);
			prestat.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void displayTable()
	{
		try
		{
			Connection con = MakeConnection.createConnection();
			String query = "select * from student_info";
			Statement stat = con.createStatement();
			
			ResultSet set = stat.executeQuery(query);
			
			while(set.next())
			{
				int id=set.getInt(1);
				String name = set.getString(2);
				String phone = set.getString(3);
				String city = set.getString(4);
				System.out.println(" ID : "+id);
				System.out.println(" Name : "+name);
				System.out.println(" Phone : "+phone);
				System.out.println(" City : "+city);
				System.out.println("__________________________________________________________________________________");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

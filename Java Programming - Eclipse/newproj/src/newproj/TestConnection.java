package newproj;

import java.sql.*;


public class TestConnection 
{
	
	public static void getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection testCon=DriverManager.getConnection(str,username,password);
			if(testCon==null)
			{
				System.out.println("Connection not found");
			}
			else
			{
				System.out.println("Connection exists");
			}
			Statement st= testCon.createStatement();
			ResultSet rs= st.executeQuery("SELECT * FROM STUDENT");
			while(rs.next())
			{
				System.out.println("Hello");
			}
			
			
		}
		catch(SQLException | ClassNotFoundException ex)
		{
			System.out.print(ex.getMessage());
			System.out.print("Exception in connection");
		}
	
	}
	
static String str="jdbc:mysql://127.0.0.1:3306/schoolmanager";
static String username="simran";
static String password="simran";
}

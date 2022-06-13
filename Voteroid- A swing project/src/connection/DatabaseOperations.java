package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseOperations 
{
	private static Connection con = MakeConnection.getConnection();
	
	public static boolean validVoterCheck(String name, String adhaar)
	{
		String query = "select * from valid_voters where vname='"+name+"' and vadhaar='"+adhaar+"'";
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			if(res.next())
			{
				return true;			
			}
			else
			{
				return false;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return false;
	}
	public static boolean validAdminCheck(int id, String password)
	{
		String query = "select * from admins where aid="+id+" and apass='"+password+"'";
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			if(res.next())
			{
				return true;			
			}
			else
			{
				return false;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return false;
	}
	
	public static int getANo(int id, String password)
	{
		String query = "select * from admins where aid="+id+" and apass='"+password+"'";
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
				return -1;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return -1;
	}
	
	public static int getVID(String name, String adhaar)
	{
		String query = "select * from valid_voters where vname='"+name+"' and vadhaar='"+adhaar+"'";
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
				return -1;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return -1;
	}
	public static String getVName(int vid)
	{
		String query = "select * from valid_voters where vid = "+vid;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			if(res.next())
			{
				return res.getString(3);			
			}
			else
			{
				return null;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public static int getVAdhaar(int vid)
	{
		String query = "select * from valid_voters where vid = "+vid;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			if(res.next())
			{
				return res.getInt(2);			
			}
			else
			{
				return 0;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return 0;
	}
	
	
	public static int numberOfCandidates()
	{
		String query = "select count(*) from candidates";
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			res.next();
			return res.getInt(1);
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return -1;
	}
	
	public static int voteTo(String name, String adhaar)
	{
		String query = "select * from valid_voters where vname='"+name+"' and vadhaar='"+adhaar+"'";
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			if(res.next())
			{
				return res.getInt(4);			
			}
			else
			{
				return -1;
			}
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return -1;
	}
	
	public static void updateVoteTo(int vid,int cid)
	{
		System.out.println(vid+" "+cid);
		String query = "update valid_voters set vto = ? where vid = ?";
		try 
		{
			PreparedStatement stmt = con.prepareStatement(query);
			stmt.setInt(1,cid);
			stmt.setInt(2, vid);
			stmt.executeUpdate();
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());
		} 
	}
	
	public static String getCName(int cid)
	{
		String query = "select * from candidates where cid = "+cid;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			res.next();
			return res.getString(2);
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public static String getCSlogan(int cid)
	{
		String query = "select * from candidates where cid = "+cid;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			res.next();
			return res.getString(3);
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public static String getCLogo(int cid)
	{
		String query = "select * from candidates where cid = "+cid;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			res.next();
			return res.getString(4);
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return null;
	}
	public static int getVotes(int cid)
	{
		String query = "select * from candidates where cid = "+cid;
		try 
		{
			Statement stmt = con.createStatement();
			ResultSet res = stmt.executeQuery(query);
			res.next();
			return res.getInt(5);
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		}
		return -1; 
	}
	public static void giveVote(int cid)
	{
		int votes = DatabaseOperations.getVotes(cid) + 1 ;
		String query = "update candidates set votes ="+votes+" where cid = "+cid;
		try 
		{
			Statement stmt = con.createStatement();
			stmt.executeUpdate(query);
		} 
		catch (SQLException e) 
		{
			System.out.println(e.getMessage());

		} 
	}
	
}

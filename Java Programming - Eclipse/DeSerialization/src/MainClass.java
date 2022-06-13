import java.io.*;

public class MainClass {

	public static void main(String[] args) 
	{
		User user = null;
		try 
		{
			FileInputStream fileIn = new FileInputStream("UserInfo.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			user = (User) in.readObject();
			fileIn.close();
			in.close();
		} 
		catch (FileNotFoundException e) 
		{			
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}

}

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// we will save state of a user.
public class MainClass {

	public static void main(String[] args)
	{
		User user = new User();
		
		user.name = "Preetam";
		user.password = "preetam";
		try 
		{
			FileOutputStream fileout = new FileOutputStream("UserInfo.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(user);
			out.close();
			fileout.close();
		} 
		catch (FileNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}

}

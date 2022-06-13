import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass 
{
	public static void main(String[] args) throws IOException
	{
		System.out.println("Welcome to Student Manager : ");
		int input = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 String sName,sPhone,sCity; 
		while(true)
		{
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete studnet");
			System.out.println("Press 3 to Display Data");
			System.out.println("Press 4 to Exit");
			input = Integer.parseInt(br.readLine());// converting the string to integer
			switch(input)
			{
				case 1:
				{
					System.out.println("Enter user name :");
					sName = br.readLine();
					System.out.println("Enter user phone");
					sPhone = br.readLine();
					System.out.println("Enter user City");
					sCity = br.readLine();
					Student st = new Student(sName,sPhone,sCity);
					StudentOperations.insertStudent(st);
					break;
				}
				case 2:
				{
					System.out.println("Enter the userid to be Deleted : ");
					int sid = Integer.parseInt(br.readLine());
					StudentOperations.deleteStudent(sid);
					break;
				}
				case 3:
				{
					StudentOperations.displayTable();
					break;
				}
				case 4:
				{
					System.out.println("Bye Bye");
					return;
				}
				default:
				{
					System.out.println("Invalid input !!!");
				}
			}
		}
	}
}

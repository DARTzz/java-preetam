// this is a simple JDBC project

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainClass {

	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String userName,password,databaseName,driverLocation;
		
		System.out.println("WELCOME");
		System.out.println("This is a JDBC based project\n");
		System.out.println("\nUser Name : ");
		userName = reader.readLine();
		System.out.println("\nPassword : ");
		password = reader.readLine();
		System.out.println("\nEnter the Database Name : ");
		databaseName = reader.readLine();
		System.out.println("\nEnter the location of Driver class");
		driverLocation = reader.readLine();
		System.out.println("\nEnter the CEO name :");
		Employee.seteCEO(reader.readLine());
		
		ConnectionEstablish.makeConnection(userName, password,"jdbc:mysql://localhost:3306/"+databaseName, driverLocation);
		DBOperations operate = new DBOperations();
		while(true)
		{
			int input = 0,eID;
			String eName;
			double eSalary;
			System.out.println("\nOPTIONS :");
			System.out.println("\n1.) Insert Employee\n2.) Fire Employee\n3.) Change CEO\n4.) Display Data\n5.) Check Employee\n6.) Exit");
			System.out.println("\nEnter your choice : ");
			input = Integer.parseInt(reader.readLine());
			switch(input)
			{
				case 1 :
				{
					System.out.println("Enter the Employee Details :");
					System.out.println("ID : ");
					eID = Integer.parseInt(reader.readLine());
					System.out.println("Name : ");
					eName = reader.readLine();
					System.out.println("Salary : ");
					eSalary = Double.parseDouble(reader.readLine());
					operate.insertEmployee(eID, eName, eSalary);
					System.out.println("Employee Added !!\n");
					break;
				}
				case 2 :
				{
					System.out.println("Enter the ID of the employee to be fired : ");
					eID = Integer.parseInt(reader.readLine());
					operate.fireEmployee(eID);
					System.out.println("Employee Fired");
					break;
				}
				case 3 :
				{
					System.out.println("Enter the name of the new CEO : ");
					operate.changeCEO(reader.readLine());
					System.out.println("CEO updated");
					break;
				}
				case 4 :
				{
					operate.showData();
					break;
				}
				case 5 :
				{
					System.out.println("Enter the ID to be searched : ");
					operate.searchData(reader.readLine());
					break;
				}
				case 6 :
				{
					System.out.println("ADIOS AMIGO !!");
					return;
				}
			}
		}
	}

}


















import java.util.Scanner;
import java.util.ArrayList;
public class MainClass 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		
		ArrayList<Employee> emplist = new ArrayList<Employee>();
		System.out.println("Welcome User \n\n\n");
		while(true)
		{
			System.out.println("  MENU\n 1.) Add \n 2.) display 3.) query 4.) delete \n 3.) exit");
			System.out.println("Enter your Input : ");
			int input = scan.nextInt();
			switch(input)
			{
				case 1 :
				{
					MainClass.addToList(emplist);
				}
				case 2:
				{
					MainClass.displayData(emplist);
				}
			}
		}
	}
	
	static void addToList(ArrayList<Employee> emplist)
	{
		System.out.println("Entry for Employee or manager ? ");
		System.out.println("1.) Employee\n 2.) Manager\n");
		System.out.println("your input :");
		int input = scan.nextInt();
		if(input == 1)
		{
			System.out.println("Enter the details below :");
			System.out.println("Registration ID : ");
			int reg = scan.nextInt();
			System.out.println("Name : ");
			String name = scan.nextLine();
			scan.nextLine();
			System.out.println("Salary :");
			double salary = scan.nextDouble();
			System.out.println("Attendance :");
			float attendance = scan.nextFloat();
			emplist.add(new Employee(name,reg,attendance,salary));
		}
		else if(input == 2)
		{
			{
				System.out.println("Enter the details below :");
				System.out.println("Registration ID : ");
				int reg = scan.nextInt();
				System.out.println("Name : ");
				String name = scan.nextLine();
				scan.nextLine();
				System.out.println("Salary :");
				double salary = scan.nextDouble();
				System.out.println("Attendance :");
				float attendance = scan.nextFloat();
				System.out.println("Bonus");
				double bonus = scan.nextDouble();
				emplist.add(new Manager(name,reg,attendance,salary,bonus));
			}
		}
		else
		{
			System.out.println("Please enter a valid input ");
			return ;
		}
	} 
	static void displayData(ArrayList<Employee> emplist)
	{
		for( Employee e : emplist)
		{
			if(e instanceof Manager)
		}
	}

}


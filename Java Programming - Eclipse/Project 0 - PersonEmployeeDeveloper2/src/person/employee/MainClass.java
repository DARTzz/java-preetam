package person.employee;
import java.util.ArrayList;
import java.util.Scanner;

public class MainClass 
{
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args)
	{
		ArrayList<Person> arrList = new ArrayList<Person>();
		String userName = "Preetam", inputUserName ;
		int pin = 12345,counter =2,inputPin;
		while(true)
		{
			if(counter == -1)
			{
				System.out.println("No tries left please contact the System Administrator.\n\npress enter to exit");
				
				scan.next().charAt(0);
				return ;
			}
			System.out.println("User Name : ");
			
			inputUserName = scan.nextLine();
			scan.nextLine();
			System.out.println("Password : ");
			
			inputPin = scan.nextInt();
			if(pin == inputPin && userName.equals(inputUserName) == true)
			{
				break;
			}
			System.err.println("Invalid ID or Password please try again\ntries left = "+counter+"\n\n");
			counter--;
		}
		System.err.println("WELCOME to Employee Manager :");
		char input='z'; 
		while(input !='F' && input != 'f')
		{
			System.out.println("___MENU___");
			System.out.println("A. ADD DATA\nB. DISPLAY DATA\nC. QUERY\nD. EDIT DATA\nE. CLEAR DATA\nF. QUIT ");
			System.out.println("\nEnter your Choice :");
			input = scan.next().charAt(0);
			switch(input)
			{
				case 'a':
				{
					MainClass.addData(arrList);
					break;
				}
				case 'A':
				{
					MainClass.addData(arrList);
					break;
				}
				case 'b':
				{
					MainClass.displayData(arrList);
					break;
				}
				case 'B':
				{
					MainClass.displayData(arrList);
					break;
				}
				case 'c':
				{
					MainClass.queryData(arrList);
					break;
				}
				case 'C':
				{
					MainClass.queryData(arrList);
					break;
				}
				case 'd':
				{
					MainClass.editData(arrList);
					break;
				}
				case 'D':
				{
					MainClass.editData(arrList);
					break;
				}
				case 'e':
				{
					MainClass.clearData(arrList);
					break;
				}
				case 'E':
				{
					MainClass.clearData(arrList);
					break;
				}
				case 'F':
				{
					MainClass.finalFunction();
					return;
				}
				case 'f':
				{
					MainClass.finalFunction();
					return;
				}
				default :
				{
					System.err.println("\nInvalid Input");
				}
			}
			
			System.out.println("\nEnter any key to Continue");
			scan.next().charAt(0);
		}
	}
	
	static void addData(ArrayList<Person> arr)
	{
		System.out.println("Give the Type of Entry to be made :");
		System.out.println("1.) Employee \n2.) Developer \n3.) Senior Developer");
		int input = scan.nextInt();
		String name;
		int id;
		double salary;
		float attendance;
		String field;
		float experience;
		double bonus;
		switch(input)
		
		{
			case 1:
			{
				System.out.println("Enter the following Details :");
				System.out.println("NAME : ");
				scan.nextLine();
				name = scan.nextLine();
				System.out.println("ID : ");
				id = scan.nextInt();
				System.out.println("SALARY : ");
				salary = scan.nextDouble();
				System.out.println("Attendance : ");
				attendance = scan.nextFloat();
				arr.add(new Employee(name,id,salary,attendance));
				break;
			}
			case 2:
			{
				System.out.println("Enter the following Details :");
				System.out.println("NAME : ");
				scan.nextLine();
				name = scan.nextLine();
				System.out.println("ID : ");
				id = scan.nextInt();
				System.out.println("SALARY : ");
				salary = scan.nextDouble();
				System.out.println("Attendance : ");
				attendance = scan.nextFloat();
				scan.nextLine();
				System.out.println("FIELD : ");
				field = scan.nextLine();
				arr.add(new Developer(name,id,salary,attendance,field));
				break;
			}
			case 3:
			{
				System.out.println("Enter the following Details :");
				System.out.println("NAME : ");
				scan.nextLine();
				name = scan.nextLine();
				System.out.println("ID : ");
				id = scan.nextInt();
				System.out.println("SALARY : ");
				salary = scan.nextDouble();
				System.out.println("ATTENDANCE : ");
				attendance = scan.nextFloat();
				System.out.println("FIELD : ");
				scan.nextLine();
				field = scan.nextLine();
				System.out.println("EXPERIENCE :");
				experience = scan.nextFloat();
				System.out.println("SALARY BONUS :");
				bonus = scan.nextDouble();
				arr.add(new SeniorDeveloper(name,id,salary,attendance,field,experience,bonus));
				break;
			}
			default :
			{
				System.err.println("\n\n Invalid Entry...Please Retry.");
			}
		
		}
		System.err.println("THE ENTRY HAS BEEN MADE :");
		return;
	}
	
	static void displayData(ArrayList<Person> arr)
	{
		if(arr.isEmpty() == true)
		{
			System.err.println("There is no data to be displayed, please enter some data and try again .");
			return;
		}
		System.out.println("\n Please enter the cateogry to be Displayed : ");
		System.out.println("1.) Employee \n2.) Developer \n3.) Senior Developer\n4.) All Data");
		int input = scan.nextInt(),flag = 0,counter = 1;
		switch(input)
		{
		
			case 1 : 
			{
						System.out.printf("| Sno) | %-20s | ID |       SALARY |      ATTENDANCE |    SYSTEMID |\n","NAME");
				for(Person per : arr)
				{
					if(per instanceof Employee == true && per instanceof Developer != true)
					{
						System.out.printf("  %d.)   %-20s   %-7d    %f         %f          %f\n",counter,per.getName(),((Employee) per).getId(),((Employee) per).getSalary(),((Employee) per).getAttendance(),per.getSystemID());
						counter ++;
						flag = 1;
					}
				}
				if(flag == 0)
				{
					System.err.println("There is no entry of type Person please enter input of type Person and try Again");
					return;
				}
				break;
			}
			case 2 : 
			{
						System.out.printf("| Sno) | %-20s |   ID   | SALARY | ATTENDANCE | SYSTEMID | %-10s |\n","NAME","FIELD");
				for(Person per : arr)
				{
					if(per instanceof Developer == true && per instanceof SeniorDeveloper != true)
					{
						System.out.printf("  %d.)   %-20s   %d     %f         %f          %f      %-10s\n",counter,per.getName(),((Developer) per).getId(),((Developer) per).getSalary(),((Developer) per).getAttendance(),per.getSystemID(),((Developer) per).getField());
						counter ++;
						flag = 1;
					}
				}
				if(flag == 0)
				{
					System.err.println("There is no entry of type Developer please enter input of type Developer and try Again");
					return;
				}
				break;
			}
			case 3:
			{
						System.out.printf("| Sno) | %-20s | ID | SALARY | ATTENDANCE | SYSTEMID | %-10s | EXPERIENCE | BONUS |\n","NAME","FIELD");
				for(Person per : arr)
				{
					if(per instanceof SeniorDeveloper == true)
					{
						System.out.printf("  %d.)   %-20s   %d     %f         %f          %f      %-10s       %f       %f\n",counter,per.getName(),((SeniorDeveloper) per).getId(),((SeniorDeveloper) per).getSalary(),((SeniorDeveloper) per).getAttendance(),per.getSystemID(),((SeniorDeveloper) per).getField(),((SeniorDeveloper) per).getExperience(),((SeniorDeveloper) per).getBonus());
						counter ++;
						flag = 1;
					}
				}
				if(flag == 0)
				{
					System.err.println("There is no entry of type Senior Developer please enter input of type Senior Developer and try Again");
					return;
				}
				break;
			}
			case 4:
			{
						System.out.printf("| Sno) | Cateogory | %-20s | ID | SALARY | ATTENDANCE | SYSTEMID | %-10s | EXPERIENCE | BONUS |\n","NAME","FIELD");
				for(Person per : arr)
				{
					if(per instanceof Employee == true && per instanceof Developer != true)
					{
						System.out.printf("  %d.)   Employee    %-20s   %d     %f         %f         %f\n",counter,per.getName(),((Employee) per).getId(),((Employee) per).getSalary(),((Employee) per).getAttendance(),per.getSystemID());
					}
					else if(per instanceof Developer == true && per instanceof SeniorDeveloper != true)
					{
						System.out.printf("  %d.)   Developer   %-20s  %d      %f         %f          %f      %-10s\n",counter,per.getName(),((Developer) per).getId(),((Developer) per).getSalary(),((Developer) per).getAttendance(),per.getSystemID(),((Developer) per).getField());
					}
					else if(per instanceof SeniorDeveloper == true)
					{
						System.out.printf("  %d.)   SeniorDev   %-20s   %d     %f         %f          %f      %-10s       %f        %f\n",counter,per.getName(),((SeniorDeveloper) per).getId(),((SeniorDeveloper) per).getSalary(),((SeniorDeveloper) per).getAttendance(),per.getSystemID(),((SeniorDeveloper) per).getField(),((SeniorDeveloper) per).getExperience(),((SeniorDeveloper) per).getBonus());
						
					}
				}
				break;
			}
		}
		return;
		
	}
	
	static void queryData(ArrayList<Person> per)
	{
		if(per.isEmpty())
		{
			System.err.println("There are no elements in the List hence unable to do query ");
			return;
		}
		System.out.println("Enter the ID to be checked for : ");
		int id = scan.nextInt();
		for(Person obj : per)
		{
			if(((Employee) obj).getId() == id)
			{
				if(obj instanceof Employee == true && obj instanceof Developer != true)
				{
					System.out.printf(" %-20s | ID | SALARY | ATTENDANCE | SYSTEMID |\n","NAME");
					System.out.printf(" %-20s      %d     %f     %f    %f\n",obj.getName(),((Employee) obj).getId(),((Employee) obj).getSalary(),((Employee) obj).getAttendance(),obj.getSystemID());
					return ;
				}
			}
			if(((Developer) obj).getId() == id)
			{
				if(obj instanceof Developer == true && obj instanceof SeniorDeveloper != true)
				{
					System.out.printf(" %-20s | ID | SALARY | ATTENDANCE | SYSTEMID | %-10s |\n","NAME","FIELD");
					System.out.printf(" %-20s   %d     %f         %f          %f      %-10s\n",obj.getName(),((Developer) obj).getId(),((Developer) obj).getSalary(),((Developer) obj).getAttendance(),obj.getSystemID(),((Developer) obj).getField());
					return;
				}
			
			}
			if(((SeniorDeveloper) obj).getId() == id)
			{
				if(obj instanceof SeniorDeveloper == true)
				{
					System.out.printf("| Sno) | %-20s | ID | SALARY | ATTENDANCE | SYSTEMID | %-10s | EXPERIENCE | BONUS |","NAME","FIELD\n");
					System.out.printf(" %-20s   %d     %f         %f          %f      %f      %-10s       %f       %f\n",obj.getName(),((SeniorDeveloper) obj).getId(),((SeniorDeveloper) obj).getSalary(),((SeniorDeveloper) obj).getAttendance(),obj.getSystemID(),((SeniorDeveloper) obj).getField(),((SeniorDeveloper) obj).getExperience(),((SeniorDeveloper) obj).getBonus());
					return;
				}
			}
			System.err.println("This person is not present in the list ");
			return;
			
			
		}
		
	}
	
	static void editData(ArrayList<Person> arrlist)
	{
		System.out.println("\n Enter the ID of the person whose data is go be edited : ");
		int id = scan.nextInt(),flag = 0;
		int input;
		for(Person obj : arrlist)
		{
			if(((Employee) obj).getId() == id && ((Developer) obj).getId() != id)
			{
				System.out.println("Enter the field to be edited :");
				System.out.println("1.) Name\n2.) Salary\n3.)Attendance\n ");
				input = scan.nextInt();
				switch(input)
				{
					case 1:
					{
						scan.nextLine();
						System.out.println("Enter the new name :");
						obj.setName(scan.nextLine());
						flag = 1;
						break;
					}
					case 2:
					{
						System.out.println("Enter the new Salary :");
						((Employee) obj).setSalary(scan.nextDouble());
						flag = 1;
						break;
					}
					case 3:
					{
						System.out.println("Enter the nes Attendance :");
						((Employee) obj).setAttendance(scan.nextFloat());
						flag = 1;
						break;
					}
					default :
					{
						System.err.println("Invalid input please try again");
						return;
					}
					
				}
				
				
			}
			else if(((Developer) obj).getId() == id && ((SeniorDeveloper) obj).getId() != id)
			{
				System.out.println("Enter the field to be edited :");
				System.out.println("1.) Name\n2.) Salary\n3.) Attendance\n4.) Field ");
				input = scan.nextInt();
				switch(input)
				{
					case 1:
					{
						scan.nextLine();
						System.out.println("Enter the new name :");
						obj.setName(scan.nextLine());
						flag = 1;
						break;
					}
					case 2:
					{
						System.out.println("Enter the new Salary :");
						((Developer) obj).setSalary(scan.nextDouble());
						flag = 1;
						break;
					}
					case 3:
					{
						System.out.println("Enter the new Attendance :");
						((Developer) obj).setAttendance(scan.nextFloat());
						flag = 1;
						break;
					}
					case 4:
					{
						scan.nextLine();
						System.out.println("Enter the new Field");
						((Developer) obj).setField(scan.nextLine());
						flag = 1;
						break;
					}
					default :
					{
						System.err.println("Invalid input please try again");
						return;
					}
					
				}
				
			}
			else if(((SeniorDeveloper) obj).getId() == id)
			{
				System.out.println("Enter the field to be edited :");
				System.out.println("1.) Name\n2.) Salary\n3.) Attendance\n4.) Field\n5.) Experience\n6.) Bonus");
				input = scan.nextInt();
				switch(input)
				{
					case 1:
					{
						scan.nextLine();
						System.out.println("Enter the new name :");
						obj.setName(scan.nextLine());
						flag = 1;
						break;
					}
					case 2:
					{
						System.out.println("Enter the new Salary :");
						((SeniorDeveloper) obj).setSalary(scan.nextDouble());
						flag = 1;
						break;
					}
					case 3:
					{
						System.out.println("Enter the new Attendance :");
						((SeniorDeveloper) obj).setAttendance(scan.nextFloat());
						flag = 1;
						break;
					}
					case 4:
					{
						scan.nextLine();
						System.out.println("Enter the new Field");
						((SeniorDeveloper) obj).setField(scan.nextLine());
						flag = 1;
						break;
					}
					case 5:
					{
						System.out.println("Enter the new experience :");
						((SeniorDeveloper) obj).setExperience(scan.nextFloat());
						flag = 1;
						break;
					}
					case 6:
					{
						System.out.println("Enter the new Bonus :");
						((SeniorDeveloper) obj).setBonus(scan.nextDouble());
						flag = 1;
						break;
					}
					default :
					{
						System.err.println("Invalid input please try again");
						return;
					}
					
				}
				
			}
			if(flag == 1)
			{
				System.err.println("The changes were made :");
				return;
			}
			if(flag == 0)
			{
				System.err.println("No such Id exists");
				return;
			}
		}
	}
	
	static void clearData(ArrayList<Person> per)
	{
		System.out.println("\nAre you sure ?? \n1.) Yes 2.) No");
		int input = scan.nextInt();
		if(input == 1)
		{
			per.clear();
			System.err.println("\nThe data has been Cleared ");
			return;
		}
		else if(input == 2)
		{
			System.err.println("\n Okk Sure");
			return;
		}
		else
		{
			System.err.println("\nInvalid Input");
			return;
		}
	}
	static void finalFunction()
	{
		System.err.println("\nThank you for using the program adios");
		return;
	}
	
}


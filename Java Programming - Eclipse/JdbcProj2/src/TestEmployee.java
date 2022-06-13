import java.util.Scanner;

public class TestEmployee 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		
		int input =0;
		System.out.println("______________ WELCOME ______________");
		while(input != 5) 
		{
			System.out.println("MENU \n1.) Enter Data\n2.) Display Data\n3.) Delete Employee\n4.) Edit Emoployee\n5.) Quit");
			input = sc.nextInt();
			switch(input)
			{
				case 1 :
				{
					TestEmployee.addData();
					break;
				}
				case 2 :
				{
					TestEmployee.displayData();
					break;
				}
				case 3 :
				{
					TestEmployee.deleteData();
					break;
				}
				case 4 :
				{
					TestEmployee.editData();
					break;
				}
				case 5 :
				{
					System.out.println("Thank you for using ");
				}
				default :
				{
					System.out.println("Please enter a valid response ");
				}
			}
		}
	}
	public static void addData()
	{
		System.out.println("Enter reg no. : ");
		int regNo=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter your name : ");
		String name=sc.nextLine();
		System.out.print("Enter your salary : ");
		double salary=sc.nextDouble();
		sc.nextLine();
		
		Employee emp= new Employee(regNo,name,salary);
		emp.submitEmployeeData();
		System.out.println("The Employee Data Has been submitted.");
		
				
	}
	public static void displayData()
	{
		Employee.displayData();
	}
	public static void editData()
	{
		System.out.println("Enter the name regNumber of the employee data to be edited : ");
		int rNO = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the new reg number : ");
		int nrNO = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the new name :");
		String name =  sc.nextLine();
		System.out.println("Enter the new Salary : ");
		double salary = sc.nextDouble();
		sc.nextLine();
		Employee emp = new Employee(nrNO,name,salary);
		emp.updateData(rNO);
		System.out.println("The Information was updated Successfully !!!");
		
	}
	public static void deleteData()
	{
		System.out.println("Enter teh reg no. of the employee to be deleted :");
		int rNo = sc.nextInt();
		sc.nextLine();
		Employee.deleteData(rNo);
		System.out.println("The Employee has been deleted !!!!");
	}
}

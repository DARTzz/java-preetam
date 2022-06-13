package student_info;
import java.util.Scanner;
class TestStudent 
{
	public  static Scanner scan = new Scanner(System.in);
	public static Student[] student_arr = new Student[10];
	public static int g_counter = 0;
	public static void main(String[] args)
	{
		
		System.out.println("Welcome to Student Manager :)");
		System.out.println("Enter your name :");
		String name = scan.nextLine();
		scan.nextLine();
		System.out.println("Hello "+name);
		int response = -1 ;
		while(response != 6)
		{
			System.out.println();
			System.out.println("             <<MENU>>");
			System.out.println("1.>Add Data");
			System.out.println("2.>Display Data");
			System.out.println("3.>Query Data");
			System.out.println("4.>Edit Data");
			System.out.println("5.>Delete Data");
			System.out.println("6.>Quit");
			
			System.out.print("Enter choice: ");
			response=scan.nextInt();
			switch(response)
			{
			case 1 :TestStudent.addData();
			break;
			case 2 :TestStudent.displayData();
			break;
			case 3 :TestStudent.queryData();
			break;
			case 4 :TestStudent.editData();
			break;
			case 5 :TestStudent.deleteData();
			}
		}
		System.out.println("\n\n\n<<<<< Thankyou for using the program >>>>>");
		
		
	}
	
	
	public static  void addData()
	{
		System.out.println();
		
		System.out.println("Enter the name of the Student :");
		scan.nextLine();
		
		String sname = scan.nextLine();
		System.out.println(sname+" Please Enter Student ID :");
		int sID = scan.nextInt();
		
		if(TestStudent.check_id(sID)==1)
		{
			System.out.println("The student with this id exists already !!!");
			return;
		}
		
		System.out.println("Now Enter Student Fees");
		double sFees = scan.nextDouble();
		Student stud = new Student(sID,sname,sFees);
		student_arr[g_counter] = stud;
		g_counter++;
	}
	public static void displayData()
	{
		if(TestStudent.is_empty()==1)
		{
			System.out.println("Nothing to print the database is empty !!");
			return;
		}
		System.out.println("Studnet information :\n\n");
		for(int i=0; i<g_counter;i++)
		{
			System.out.printf(" %d> %d | %-20s | %f |",i+1,student_arr[i].get_stdID(),student_arr[i].get_stdName(),student_arr[i].get_stdFees());
			System.out.println();
			
		}
	}
	public static void queryData()
	{
		System.out.println("Enter the Student ID to be checked : ");
		int ID = scan.nextInt();
		for(int a =0; a<=g_counter; a++)
		{
			if(ID == student_arr[a].get_stdID())
			{
				
				System.out.println("\nThis Student is present in the database");
				System.out.println(student_arr[a].get_stdName());
				System.out.println(student_arr[a].get_stdID());
				System.out.println(student_arr[a].get_stdFees());
				
				return ;
			}
			else
			{
				System.out.println("The student does not exist in the database in the Menu and press 1");
				
			}
		}
	
	}
	
	public static void editData()
	{
		System.out.println("Please enter the id of the student to be modified");
		int id = scan.nextInt();
		if(check_id(id) == 0)
		{
			System.out.println("The Student does not exist");
			return;
		}
		for(int a=0; a<g_counter; a++)
		{
			if(student_arr[a].get_stdID() == id )
			{
				System.out.println("The student exists, please enter the details ");
				System.out.println("Enter the student fees :");
				student_arr[a].set_stdFees(scan.nextDouble());
				System.out.println("Enter the student name :");
				scan.nextLine();
				student_arr[a].set_stdName(scan.nextLine());
			}
			System.out.println("\nThe Data has been updated !!\n");
		}
	}
	public static void deleteData()
	{
		System.out.println("Enter the ID of the student whose information is to be deleted :");
		int id = scan.nextInt();
		if(check_id(id) == 0)
		{
			System.out.println("The student to be deleteed does not exist !!");
			return;
		}
		System.out.println("The student exists and will be deleted");
		for(int a=0; a<g_counter; a++)
		{
			if(student_arr[a].get_stdID()==id)
			{
				student_arr[a]= null;
			}
		}
		System.out.println("The Student has been deleted !!(From the database)");
		TestStudent.rearrange();
	}
	
	// the following are just to check exceptions
	public static int is_empty()
	{
		if(g_counter ==0)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int check_id(int id)// to check if an id is present in the program
	{
		int flag = 0;
		for(int a=0; a<g_counter; a++)
		{
			if(student_arr[a].get_stdID() == id)
			{
				flag = 1;
				return flag;
			}
		}
		return flag;
	}
	public static void rearrange()
	{
		for(int a=0; a<g_counter; a++)
		{
			if(student_arr[a]==null)
			{
				for(int b=a;b<g_counter;b++)
				{
					student_arr[b]=student_arr[b+1];
				}
				g_counter--;
			}
		}
	}
}

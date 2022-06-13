import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int a = 0,b = 1,input,sum = 1;
		System.out.println("Enter the length of series : ");
		input = scan.nextInt();
		for(int i=1; i<=input; i++)
		{
			System.out.print(" "+sum);
			sum = a+b;
			a = b;
			b = sum;
		}
		
	}
}

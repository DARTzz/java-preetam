import java.util.ArrayList;
import java.util.Scanner;

public class MainClass 
{

	public static void main(String[] args)
	{
		Preetam pre = new Preetam(15);
		Preetam pro = new Preetam(16);
	}

}

class Preetam
{
	int var = 12;
	public Preetam(int var)
	{
		System.out.println(var);
		System.out.println(this.var);
	}
}
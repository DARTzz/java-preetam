package pack;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass 
{
	public static void main(String[] args) throws IOException
	{
		FileReader obj = new FileReader("C:\\ComputerScience\\JAVA\\DIFFICULT concepts\\AVANCED_CONCEPT_NOTES.txt");
		int data = obj.read();
		while(data != -1)
		{
			System.out.print((char)data);
			data = obj.read();
		}
		obj.close();
	}
}

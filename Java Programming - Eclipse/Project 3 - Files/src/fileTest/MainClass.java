package fileTest;

public class MainClass 
{
	public static void main(String[] args) throws Exception
	{
		FileOperations obj = new FileOperations("C:\\ComputerScience\\JAVA\\epic.txt");
		obj.overrideFile("All is WEll");
		obj.fileWrite.close();
		obj.readFile();
		obj.fileRead.close();

	}
}

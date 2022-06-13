package fileTest;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileOperations 
{
	File file ;
	FileWriter fileWrite;
	FileReader fileRead;
	public FileOperations(String address)throws Exception
	{
		if(new File(address).createNewFile())
		{
			System.out.println("The file was Created !!\n");
			
		}
		else
		{
			System.out.println("The file was present !!\n");
		}
		
		this.file = new File(address);
		this.fileRead = new FileReader(address);
		this.fileWrite = new FileWriter(address);
		
			
	}
	public String getFilePath()// the path we passed as address
	{
		return file.getPath();
	}
	public String getAbsoluteFilePath()// for the expanded path
	{
		return file.getAbsolutePath();
	}
	public boolean checkIfFile()
	{
		
		return file.exists();
		
	}
	public void appendFile(String input)throws Exception
	{
		fileWrite.append(input);
		fileWrite.flush();
	}
	public void overrideFile(String input)throws Exception
	{
		fileWrite.write(input);
	
		fileWrite.flush();
	}
	public void readFile() throws IOException
	{
		int data = this.fileRead.read() ;
		while(data != -1)
		{
			System.out.print((char)data);
			data = this.fileRead.read() ;
		}
		
	}
	public void deleteFile()
	{
		file.delete();
	}
	public void closeResources() throws IOException
	{
		fileRead.close();
		fileWrite.close();
	}
	
	
}

package fileoperations;
//33-126

import java.lang.Math;

public class EncryptionOperations 
{
	public static String encryptString(String content, String password, String userName)
	{
		int randomNumber = (int)Math.random() * (126 - 33 + 1) + 33 ;
		content = userName + content + password;
		String str = "";
		int change = randomNumber%10;
		
		
	}
}

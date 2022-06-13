package GUI;

public class BindFrame1 
{
	static AlphaFrame frame1;
	static LoginFrame frame2;
	public BindFrame1()
	{
		frame1 = new AlphaFrame();
		frame2 = new LoginFrame();
	}
	public static void endPain()
	{
		frame1.dispose();
		frame2.dispose();
	}
}

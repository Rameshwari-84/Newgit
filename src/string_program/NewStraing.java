package string_program;

public class NewStraing 
{
	public static void main (String []args)
	{
		String a= "Rameshwari";	
		System.out.println(a.length());
		
		for(int i=a.length()-1; i>=0; i--)
		{
			System.out.print(a.charAt(i));
		}
	}

}

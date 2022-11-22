package string_program;

public class Mainmtd 
{
	public static void main(String[] args)
	{
		ClassA sup = new ClassA();
		sup.airthmOperation();
		sup.demo();
		
		ClassB sub = new ClassB();
		sub.airthmOperation();
		sub.demo();
		
		ClassA cast = new ClassB();
		cast.airthmOperation();
		cast.demo();
	}

}

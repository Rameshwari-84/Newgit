package string_program;

public class StringS 
{
	
	 String m="Velocity class";
	String n="Engineer";
	{
	
	System.out.println(m);
	
	//indexOf('')
	
	int i =m.indexOf('e');
	
	System.out.println(i);
	System.out.println(n.indexOf('e'));
	
	//lastIndexOf('')
	System.out.println(n.lastIndexOf('e'));
	
	//charAt(index)
	
	char j =m.charAt(4);
	System.out.println(j);
	
	System.out.println("_________");
	
	//length();
	
	int k= m.length();
	System.out.println(k);  //length-1= last index
	
	//startsWith(" ")
	boolean p=m.startsWith("Vel");
	System.out.println(p);
	
	//endsWith(" ")
	boolean q= m.endsWith("class");
	System.out.println(q);
	
	//substring - overloaded (2)
	String subStr =m.substring(4);
	
	System.out.println(subStr);
	
	String subStr2 =m.substring(4,8);
	
	String L="Rameshwari Tangade";
	
	
	}
}

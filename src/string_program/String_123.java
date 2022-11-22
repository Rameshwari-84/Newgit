package string_program;

public class String_123 
{
	public static void main(String[] args)
	{
	
	String a="Velocity";
	String b= "Velocity";
	
	String c=new String("Velocity");
	String d=new String("Velocity");	
	
	{
	System.out.println(a==b); //Memory location comparison
	System.out.println(c==d);
	
	b="Class";
	System.out.println(a==b);
	
	String f= "velocity";
	
	//equals  // data comparison
	System.out.println(c.equals(d));
	System.out.println("_________");
	
	//equalsIgnoreCase    // data comparison by ignoring case
	System.out.println(a.equals(f));
	System.out.println(a.equalsIgnoreCase(f));
	
	//toUpperCase   // convert String data in Uppercase
	String t=f.toUpperCase();
	System.out.println(t);
	
	//toLowerCase  // convert String data in Lowercase
	String s= a.toLowerCase();
	System.out.println(s);
	
	System.out.println("*************");
	
	String m= "Velocity Class";
	String n= "Classify";
	System.out.println(m);
	
	//indexOf('')
	int o= m.indexOf('c');
	System.out.println(o);
	
	//lastIndexOf()
	int q= m.lastIndexOf('t');
	System.out.println(q);
	
	//charAt(index)
	char r= m.charAt(6);
	System.out.println(r);
	
	//length();
	int h=m.length();
	System.out.println(h);//size=length-1
	int i=n.length();
	System.out.println(i);
	
	//startWith("")
	boolean j=m.startsWith("V");
	System.out.println(j);
	
	//endWidth("")
	boolean k=m.endsWith("la");
	System.out.println(k);
	
	//substring - overloaded
	String substr=m.substring(2,6);
	System.out.println(substr);
	
	//split("")
	String r1="Rameshwari Kailash Tangade";
	String[] w=r1.split("e");
	System.out.println(w[1]);
	
	
	
	
	

    }
  }
}

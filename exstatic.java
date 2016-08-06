package practice;

public class exstatic{
	static int a=3;
	static int b;
	static void meth (int x)	{
		System.out.println ("X= "+ x);
		System.out.println ("A= "+ a);
		System.out.println ("B= "+ b);
	}
	static 	{
		System.out.println ("static block initialized");
		b=a*4;
	}
	public static void main (String as[])	{
		meth(42);
	}
}

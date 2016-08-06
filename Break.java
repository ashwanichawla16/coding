package practice;
import java.util.*;
public class Break
{
	public static void main(String args[])
	{
		int a;
		Scanner o= new Scanner(System.in);
		a=o.nextInt();
		String s=o.next();
		char d=s.charAt(0);
		switch(d)
		{
		case 'a': 
		{
			int c=9;
			break;
		}
		case 'b':
		{
			int c=5;
			System.out.print(c);
			break;
			
		}
		default:
		{
			int c=2;
			break;
			
		}
		}
	}
	

}

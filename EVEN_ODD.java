package practice;

import java.util.*;
class EVEN
{
	void even(int a)
	{
		if(a%2==0)
			System.out.println("number is even");
		else
			System.out.println("number is odd");
		
	}
	void prime(int b)
	{	int flag=0;
		System.out.print(b);
		for(int i=2;i<=b/2;i++)
		{
			if(b%i==0)
			{
				System.out.println("b is not prime");
				flag=1;
				break;
			}}
			if(flag==0)
				{System.out.println("b is prime");}
			
		
	}
	
}
public class EVEN_ODD 
{
	public static void main(String args[])
	{
		int a;
		Scanner o=new Scanner(System.in);
		a=o.nextInt();
		EVEN c=new EVEN();
		c.prime(a);
	}
	

}

package practice;
import java.util.*;
import java.lang.*;
public class bubblesort 
{
	public static void main(String args[])
	{
		int a[]=new int[10];
		Scanner o=new Scanner(System.in);
		for(int i=0;i<=3;i++)
		{
			a[i]=o.nextInt();
		}
		
		int b=a.length;
		for(int i=0;i<=a.length-1;i++)
		
		{for(int j=1;j<=b;j++)
		{
			
		
			if (a[j]<a[j-1])
			{
				int temp=a[j];
				a[j]=a[j-1];
				a[j-1]=temp;
			}
					
			
		}
	}
		for(int i=0;i<=3;i++)
		{
			System.out.print(a[i]);
		}

	}
}

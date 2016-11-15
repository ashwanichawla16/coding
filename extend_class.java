package practice;
import java.util.*;
import java.lang.*;
class extend extends Thread
{
	String t;
	
	extend(String s)
	{
		t=s;
		System.out.println("beggining thread\t"+t);
		start();
		
	}
	public void run()
	{try{
		
		for(int i=1;i<5;i++)
		{
			
			System.out.println("counter--"+i);
			Thread.sleep(5);
		}
	}catch(Exception e)
	{
		
	}
	System.out.println("exiting thread"+t);
	}


}

public class extend_class  
{
	public static void main(String[] args)
	{
		extend o1=new extend("one");
		extend o2=new extend("two");
		
		
	}
	
	}

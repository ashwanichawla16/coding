package practice;
import java.util.*;
import java.lang.*;
class c
{
	public void count()
	{
		for(int i=1;i<3;i++)
		{
			
			System.out.println("  "+i);
		}
	}
	
}
class B implements Runnable
{
	private String s;
	private String text;
	c m3=new c()
			
			
			;
	B(String name, String t)
	{
		s=name;
		text=t;
		
	}
	Random r1= new Random();
	
	
	public void run()
	{
		synchronized(m3)
		{
			m3.count();
		}
		System.out.println("ending thread\t"+s);
		}
	
	
	
}



public class sync
{
public static void main(String[] args)
	{
	B m1=new B("one","hello");
	B m2=new B("two","hello");
	
	Thread t1=new Thread(m1);
	
	Thread t2=new Thread(m2);
	t1.start();
	t2.start();
	try
	{t1.join();
	t2.join();}catch(Exception e) 
	{
	}
	
	}
	
	}




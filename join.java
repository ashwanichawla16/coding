package practice;
import java.util.*;
import java.lang.*;
class joint implements Runnable
{
	private String s;
	private String text;
	joint(String name, String t)
	{
		s=name;
		text=t;
		
	}
	Random r1= new Random();
	

	public void run()
	{
		try
		{if(text=="hello")
		System.out.println("running thread\t"+s+" "+text);
		int r=r1.nextInt(50);
		System.out.println(s+" "+r);
		Thread.sleep(r);
		
		}catch(Exception e)
		{
			System.out.println("error");
		}
		System.out.println("ending thread\t"+s);
		}
	
	
	
}

public class join
{
	public static void main(String[] args)
	{
	A m1=new A("one","hello");
	A m2=new A("two","hello");
	
	Thread t1=new Thread(m1);
	t1.start();
	Thread t2=new Thread(m2);
	t2.start();
	
	
	
	try
	{
		t1.join();
		t2.join();
	}catch(InterruptedException e)
	{
		System.out.println("main thread interuppted");
	}
	System.out.println("Thread One is alive: "
			+ t1.isAlive());
			System.out.println("Thread Two is alive: "
			+t2.isAlive());
	System.out.println("main thread exiting");
			
}
}
package practice;

import java.util.Scanner;

public class string_fumctions 
{
public static void main(String args[])
{
	int a;
	Scanner o=new Scanner(System.in);
	a=o.nextInt();
	switch(a)
	{
	case 1: 
	{
		char b[]={'j','a','v'};
		String s=new String(b);
		System.out.print(s);
		
	}
	case 2:
	{
		String s="abc";
		String d= "xyz";
		System.out.print(s.concat(d));
	}
	case 3:
	{
		String s="abc";
		System.out.print(s.charAt(1));
		
	}
	case 4:
	{
		String s="i am alone";
		System.out.println(s.indexOf('i'));
		System.out.println(s.indexOf('i',3));
		System.out.println(s.lastIndexOf('a'));
		System.out.println(s.lastIndexOf('a',6));
		
	}
	case 5:
	{
		String s="aplle";
		System.out.print(s.replace('l','p'));
		
	}
		
		
	}
	}
	
}
	


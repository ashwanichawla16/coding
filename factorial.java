package practice;

import java.util.Scanner;

public class factorial {

	public static void main(String args[])
	{
		//int a=0,b=1,c,d,e;
		Scanner o=new Scanner(System.in);
		//d=o.nextInt();
		//System.out.println(a);
		//System.out.println(b);
		
	/*	for(c=1;c<=d-2;c++)  //fibonaci
		{
			e=a+b;
			
			System.out.println(e);
			a=b;
			b=e;
			
		}*/
		/*//factorial
		int a,fact=1;
		a=o.nextInt();
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
			
			
		}
		System.out.print(fact);*/
		
        int number = 1234;
        int reversedNumber = 0;
        int temp = 0;
       
        while(number > 0){
               
                //use modulus operator to strip off the last digit
                temp = number%10;
               
                //create the reversed number
                reversedNumber = reversedNumber * 10 + temp;
                number = number/10;
                 
        }
       
        //output the reversed number
        System.out.println("Reversed Number is: " + reversedNumber);

	}
}

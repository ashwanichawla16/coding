#include<stdio.h>
unsigned int fact(int);
int k;
void main()
{
	
	fact(5);
	printf("%d", k);
}
unsigned int fact(int a)
{
	
	//for (int i = 1;i <= 2;i++)
	if (a > 0)
		k = a*fact(a - 1);
	else
		k = 1;
	
	return(k);
}
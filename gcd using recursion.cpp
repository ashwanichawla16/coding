#include<stdio.h>
int gcd(int,int);
int a, b, c, d;
void main()
{
	
	scanf_s("%d %d", &a, &b);
	gcd(a, b);
	printf("%d", c);

}
int gcd(int a, int b)
{
	if (a%b == 0)
	{
		c = b;
		return c;
	}
	else
		c = gcd(b, a%b);
		return (c);
	
}
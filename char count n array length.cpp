#include<stdio.h>
#include<conio.h>
#include<stdlib.h>

#pragma warning(push)
#pragma warning(disable:4514)
#pragma warning(disable:4710)
#pragma warning(disable:4101)

void main()
{
	int a[100];
	int  i, j, k,c=0,m=0;
	scanf_s("%d", &j);
	for (i = 0;i <= j;i++)
	{
		scanf_s("%d", &a[i]);

	}
	for (i = 0;i <= j;i++)
	{
		if (a[i] != NULL || a[i]==0)
		{
			c++;
		}
	}
	printf("%d", c);
	scanf_s("%d", &k);
	for (i = 0;i <= j;i++)
	{
		if (a[i] == k)
		{
			m++;
		}
	}
	printf("%d", m);
	int z = rand();

	//for (int x = 1;x <= x;x++)
	//{
	printf("%d", z);
	//}

}

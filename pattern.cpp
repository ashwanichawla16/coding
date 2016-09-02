#include<stdio.h>

void main()
{
	int i, j;
	for (i = 0;i <= 3;++i)
	{
		for (int k = 3;k >= i;--k)
		{
			printf(" ");
		}
		for (j = 0;j <= i;j++)
		{
			printf(" *");
		
			//printf("\t");
			//j = j + 1;
		}
		printf("\n");
	}
	for (int k = 0;k <= 3;k++)
	{
		for (int x = 0;x <= k;x++)
		{
			printf(" ");
		}
		for (int z = 0;z <= i;z++)
		{
			printf("* ");

		}
		printf("\n");
	}
}
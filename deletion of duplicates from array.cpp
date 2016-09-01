#include<stdio.h>
int a[100];
void main()
{
	int b, c, d, e;
	scanf_s("%d", &b);
	for (int i = 0;i <= b;i++)
		scanf_s("%d", &a[i]);
	for (int i = 0;i <= b;i++)
	{
		for (int j = i+1;j <= b;)
		{
			if (a[j] == a[i])
			{
				for (int k = j;k <= b;k++)
				{
					a[k] = a[k + 1];
				}
				b--;
			}
			else
				j++;
		}
	}
	for (int i = 0;i <= b;i++)
	{
		printf("%d", a[i]);
	}
}
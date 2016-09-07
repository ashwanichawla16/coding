/*
 * kl.c
 *
 *  Created on: 07-Sep-2016
 *      Author: Trainee
 */

/*
 * stack.c
 *
 *  Created on: 07-Sep-2016
 *      Author: Trainee
 */
#include<stdio.h>
#define length 5
struct	s
{
	int st[length];
	int top;
};
int num;
struct s x;
void push();
void pop();
int main()

{


	x.top=-1;
	push();
	push();
	push();
	pop();


return (0);
}

void push()
{
	if(x.top==length-1)
	{
		printf("stack is full");
	}
	else
	{
		printf("entr the number");
		scanf("%d",&num);
		x.top=x.top+1;
		x.st[x.top]=num;
	}
}
void pop()
{
	if(x.top==-1)
	{
		printf("stack is empty");

	}
	else
	{
		num=x.st[x.top];
		x.top=x.top-1;
		printf("popped element %d",num);
	}
}


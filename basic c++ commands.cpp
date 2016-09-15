#include<iostream>
using namespace std;
int m(int, int, int);
void _1()
{
	cout << "funct is called";
}
void _1(int b)
{
	int a = 4;
		cout << b;
}
void main()
{
	cout << "hello";
	int x = 5, y = 4;
	cout << x << " " << y;
	int z;
	cin >> z;
	cout << z;
	/*char buf[20];
	buf[5] = z;
	for (int i = 1; i <= 5; i++)
	{
		cout << buf[i];
	}*/
	int a = m(x, y, z);
	cout << a;
	_1();
	_1(6);
	//fflush(stdin);
	getc(stdin);
}
int m(int x,int y,int z)
{
	x = 100;
	int c = x + y + z;
	return (c);
}

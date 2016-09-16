#include<iostream>
using namespace std;
class Arithmetic
{
public:
	int a, b;
	void accept()
	{
		cout << "enter 2 values";
		cin >> a >> b;
		cout << a << " " << b;
	}
	void add()
	{
		cout << "sum of 2 values";
		int c = a + b;
		cout << c;
	}
	void product()
	{
		int p = a*b;
		cout << "product=" << " " << p;
	}
	void div()
	{
		int d = a / b;
		cout << "divided=" << " " << d;

	}
	void sub()
	{
		int s = a - b;
		cout <<"difference="<<" "<< s;
	}
	void mod()
	{
		int m = a%b;
		cout << "mod=" << " " << m;
	}
};
void main()
{
	Arithmetic o;
	o.accept();
	o.add();
	o.sub();
	o.div();
	o.mod();
	o.product();
}
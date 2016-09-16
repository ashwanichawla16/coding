#include<iostream>
using namespace std;
class Time
{
	int a, b, c, d;
public:
	void twelve()
	{
		cout << "enter a value";
		cin >> a;
		if (a <= 24 && a>=12)
		{
			int b = a - 12;
			cout << "time in 12h format=" << b;
		}
		else if (a < 12)
		{
			cout << "time=" << a;
		}
		else
		{
			cout << "invalid format";
		}

	}
	void _24()
	{
		cout << "entr value";
		cin >> b;
		if (b <= 24 && b > 12)
		{
			cout << "time in 24" << b;
		}
		else if (b <= 12)
		{
			int c = b + 12;
			cout << "time in 24" << c;
		}
		else
			cout << "invalid format";
	}
};
void main()
{
	Time o;
	o.twelve();
	o._24();
}
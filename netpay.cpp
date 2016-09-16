#include<iostream>
using namespace std;
class user
{
	int h, final;
	int rate = 30, tax = 25;
public:
	void hours()
	{
		cout << "enter number of hours worked";
		cin >> h;
	}
	void netpay()
	{
		final = (h*rate) - tax;
		cout << "the netpay=" << " " << final;
	}
};
	void main()
	{
		user o;
		o.hours();
		o.netpay();
	}

#include<iostream>
using namespace std;
double balance;
class bank
{
	char name[50], type[50];
	double no, bal, curr = 1000;
public:
	void accept()
	{
		cout << "enter the name";
		cin >> name;
		cout << "account type";
		cin >> type;
		cout << "account number=";
		cin >> no;
	}
	void show()
	{
		cout << "name=";
		cout << name;
		cout << "account no";
		cout << no;
		cout << "account type";
		cout << type;
	}

};
int main()
{
	bank o;
	o.accept();
	int x;
	double money,curr=1000;
	cout << "enter ur choice";
	cin >> x;
	switch (x)
	{
	case 1:
	{
		cout << "enter the amount to be deposited";
		cin >> money;
		balance = money + curr;
		cout << "current balance=";
		cout << balance;
		break;

	}
	case 2:
	{
		cout << "entr the maount to be withdrawn";
		cin >> money;
		balance = curr - money;
		cout << "current balance=";
		cout << balance;
		break;


	}
	/*case 3:
	{
		cout << "your current balance";
		cout << balance;
		break;

	}*/
	case 4:
	{
		o.show();
		cout << balance;
		break;  

	}
	case 5:
	{
		cout<<"thanks for vivisting";
		break;
	}
	default:
	{
		cout << "invalid choice";
		break;
	}

	}
	return (0);
}
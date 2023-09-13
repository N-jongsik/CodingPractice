#include <iostream>
#include <stack>
using namespace std;


int main(void)
{
	ios::sync_with_stdio(0); cin.tie(0);
	int N = 0;
	int num = 0;
	string command;
	int result = 0;
	cin >> N;

	stack<int> s;
	for (int i=0; i< N; i++)
	{
		cin >> command;
		if (command == "push") {
			cin >> num;
			s.push(num);
		}
		else if (command == "pop") {
			if (s.size() == 0) {
				result = -1;
				cout << result << "\n";
			}
			else {
			
				result = s.top();
				cout << result << "\n";
				s.pop();
			}
				
		}
		else if (command == "top") {
			if (s.size() == 0) {
				result = -1;
				cout << result << "\n";
			}
			else {
				result = s.top();
				cout << result << "\n";
			}
				
		}
		else if (command == "size") {
			result = s.size();
			cout << result << "\n";
		}
		else if (command == "empty") {
			if (s.size() == 0)
			{
				result = 1;
				cout << result << "\n";
			}
				
			else
			{
				result = 0;
				cout << result << "\n";
			}
				
		}
	}
	return 0;
}
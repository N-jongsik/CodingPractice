#define _CRT_SECURE_NO_WARNINGS
#include <iostream>
#include <queue>

using namespace std;

int main() {
	ios::sync_with_stdio(0); cin.tie(0);
	//freopen("input.txt", "r", stdin); // input 복붙하려고 사용. 백준에 제출시 주석처리해야함

	int N = 0; // N장의 카드
	queue<int>q;// "코드 작성해주세요"; // 큐 선언

	cin >> N; // 입력 받기

	for (int i = 0; i < N; i++)q.push(i+1);// "코드 작성해주세요. 힌트는 for문입니다 {}생략해서 한줄로 작성 가능해요."; // 카드를 순서대로 큐에 넣기

	/*
		해당 문제에서는 2가지 규칙으로 카드를 제거해 나감
		첫번째 규칙은 단순함 => 가장 위의 카드를 버림
		두번째 규칙은 그냥 버리면 안됌 => 잠시 빼두었다가 다시 가장 밑으로 넣어줘야함
	*/
	
	// 큐의 사이즈가 1이 되는 순간 끝남
	while (q.size()!=1) {
		// Rule-1: 가장 위의 카드 버림
		q.pop();//"코드 작성해주세요";
		// Rule-2: 그 다음 가장위의 카드를 제일 아래에 있는 카드 밑으로 옮김(그냥 버리면 안돼ㅔ~)
		int top_val = q.front(); //"코드 작성해주세요"; // 가장 위의 카드는 버리면 안되기 때문에 top_val에 담아둔다
		q.pop();// "코드 작성해주세요"; // 가장 위의 카드는 이제 버려도 되기 때문에 버림
		q.push(top_val);// "코드 작성해주세요"; // 가장 위의 카드 다시 넣어줌
	}

	cout << q.front();// "코드 작성해주세요";
	return 0;
}
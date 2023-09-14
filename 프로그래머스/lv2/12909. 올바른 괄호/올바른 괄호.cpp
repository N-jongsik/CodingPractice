#include<string>
#include <iostream>
#include <stack>

using namespace std;

bool solution(string s)
{
    stack<char>st;
    
    for(int i=0; i<s.length(); i++)
    {
        if(s[i] == '(' )
        {
            st.push(s[i]);
        }
        else if (s[i] == ')')
        {
            if(!st.empty() && st.top() == '(')
            {
                st.pop();   
            }
            else
                return false;
                
        }
    }
    return st.empty();
}
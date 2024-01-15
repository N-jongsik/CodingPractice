import sys
input = sys.stdin.readline

N = int(input())
lst = list(map(int,input().split()))
greedy = []

for i in lst:
    s = str(i)
    length = len(s)
    while len(s) < 10:
        s += s[len(s)-length]
    greedy.append(([*list(s)],str(i)))
greedy.sort(key = lambda x : x[0],reverse = True)

ans = ""
for i in greedy:
    ans+=i[-1]
print(ans if int(ans)!=0 else 0)
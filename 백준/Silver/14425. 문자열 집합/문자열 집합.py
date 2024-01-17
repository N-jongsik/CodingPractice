import sys
input = sys.stdin.readline

a = []
b = []
answer = 0

N, M = map(int,input().split())

for _ in range(N):
    a.append(input())
for _ in range(M):
    b.append(input())
    
for i in a:
    answer+=b.count(i)
        
print(answer)
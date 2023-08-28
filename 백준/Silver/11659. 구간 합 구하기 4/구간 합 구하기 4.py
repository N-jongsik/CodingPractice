import sys
input = sys.stdin.readline

N, M = map(int, input().split())
lst = list(map(int, input().split()))
pre = [0]
mysum = 0

for i in range(N):
    mysum += lst[i]
    pre.append(mysum)

for i in range(M):
    a,b = map(int,input().split())
    print(pre[b]-pre[a-1])

N,M = map(int,input().split())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
result = sorted((A+B))
for i in result:
    print(i,end=" ")

N = int(input())
arr = []
order = list(map(int,input().split()))
for i in range(N):
    arr.insert(i-order[i],i+1)
for i in arr:
    print(i,end=" ")

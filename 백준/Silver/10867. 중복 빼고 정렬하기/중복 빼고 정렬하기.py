N = int(input())
lst = list(map(int,input().split()))
result = list(set(lst))
result.sort()
for i in result:
    print(i,end=" ")
T = int(input())
for i in range(T):
    N = int(input())
    lst1 = set(map(int,input().split()))
    M = int(input())
    lst2 = list(map(int,input().split()))
    for j in lst2:
        if j in lst1:
            print(1)
        else:
            print(0)


T = int(input())
lst = []
for i in range(T):
    a,b = list(map(int,input().split(",")))
    lst.append(a+b)
for i in lst:
    print(i)
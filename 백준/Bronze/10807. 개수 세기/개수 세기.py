N = int(input())
lst = list(map(int,input().split()))
v = int(input())

k = 0

for i in lst:
    if i == v:
        k+=1
print(k)
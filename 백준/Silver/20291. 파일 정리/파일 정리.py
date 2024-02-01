import sys
input = sys.stdin.readline

N = int(input())

lst = []
dict = {}

for i in range(N):
    k = input().rstrip().split(".")
    lst.append(k[1])

for i in lst:
    if dict.get(i):
        dict[i]+=1
    else:
        dict[i] = 1
result = sorted(dict.items())
for key,value in result:
    print(key,value)
import sys
input = sys.stdin.readline

dict = {}
n = int(input())
for i in range(n):
    a,b = map(str,input().split())
    if b == "enter":
        dict[a] = b
    else:
        del dict[a]
result = sorted(dict.keys(),reverse = True)
for i in result:
    print(i)
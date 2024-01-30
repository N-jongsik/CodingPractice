import sys
input = sys.stdin.readline
n = int(input())
lst = []
for i in range(n):
    data = input().split()
    lst.append((int(data[0]),i,data))
lst.sort(key = lambda x: (x[0],x[1]))

for result in lst:
    print(" ".join(result[2]))
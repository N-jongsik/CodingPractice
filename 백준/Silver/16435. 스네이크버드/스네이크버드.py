import sys
input = sys.stdin.readline
N , L = map(int,input().rstrip().split())
lst = list(map(int,input().split()))

for i in sorted(lst):
    if i <= L:
        L+=1
print(L)
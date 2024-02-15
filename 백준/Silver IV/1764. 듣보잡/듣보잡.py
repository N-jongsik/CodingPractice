import sys
input = sys.stdin.readline

lst = []

N,M = map(int,input().split())

a = set()
for i in range(N):
    a.add(input().rstrip())
b = set()
for i in range(M):
    b.add(input().rstrip())
answer = sorted(list(a&b))

print(len(answer))
for i in answer:
    print(i)
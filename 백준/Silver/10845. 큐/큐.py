import sys

input = sys.stdin.readline

N = int(input())

q = []

for i in range(N):
    lst = input().split()
    
    if lst[0] == "push":
        q.insert(0,lst[1])
    elif lst[0] == "front":
        if len(q) == 0: print(-1)
        else: print(q[-1])
    elif lst[0] == "back":
        if len(q) == 0: print(-1)
        else: print(q[0])
    elif lst[0] == "size":
        print(len(q))
    elif lst[0] == "pop":
        if len(q) == 0: print(-1)
        else: print(q.pop())
    elif lst[0] == "empty":
        if len(q) == 0: print(1)
        else: print(0)
    
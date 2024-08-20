from collections import deque
import sys

input = sys.stdin.readline

n, m = map(int,input().split())
lst = [list(map(int,input().split())) for _ in range(n)]

dx = [-1,0,1,0]
dy = [0,1,0,-1]

def bfs(lst,a,b):
    dq = deque()
    dq.append((a,b))
    lst[a][b] = 0
    count = 1

    while dq:
        x, y = dq.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or nx >= n or ny < 0 or ny >= m:
                continue
            if lst[nx][ny] == 1:
                lst[nx][ny] = 0
                dq.append((nx,ny))
                count += 1
    return count

pic = []

for i in range(n):
    for j in range(m):
        if lst[i][j] == 1:
            pic.append(bfs(lst,i,j))
            
if len(pic) !=0:
    print(len(pic))
    print(max(pic))
else:
    print(0)
    print(0)
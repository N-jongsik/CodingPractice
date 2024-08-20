from collections import deque
import sys

input = sys.stdin.readline

dx = [-2,-1,1,2,2,1,-1,-2] #이동할 수 있는 x좌표
dy = [1,2,2,1,-1,-2,-2,-1] #이동할 수 있는 y좌표

def bfs(l,a,b,c,d):
    map = [[-1]*l for _ in range(l)] #초기에 모든 좌표 -1설정
    map[a][b] = 0 #시작점 0으로 설정
    dq = deque()
    dq.append((a,b))
    while dq:
        x, y = dq.popleft()
        if x == c and y == d:
            return map[c][d]
        for i in range(len(dx)):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<l and 0<=ny<l and map[nx][ny] == -1: #좌표 안에 존재하고 처음 방문하는 좌표일 때
                map[nx][ny] = map[x][y] + 1 #이전의 좌표에 저장된 값에 1씩 더하기
                dq.append((nx,ny))

T = int(input())
for i in range(T):
    l = int(input())
    a, b = map(int,input().split())
    c, d = map(int,input().split())
    answer = bfs(l,a,b,c,d)
    print(answer)
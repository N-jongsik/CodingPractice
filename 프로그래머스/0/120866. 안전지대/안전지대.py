def solution(board):
    answer = 0
    N = len(board)
    dx = [-1,1,0,0,-1,-1,1,1]
    dy = [0,0,-1,1,-1,1,-1,1]
    z = []
    
    for i in range(N):
        for j in range(N):
            if board[i][j] == 1:
                z.append((i,j))
    
    for x,y in z:
        for i in range(8):
            nx = x + dx[i]
            ny = y + dy[i]
            if 0<=nx<N and 0<=ny<N:
                board[nx][ny] = 1
    for i in board:
        answer+=i.count(0)
        
    return answer
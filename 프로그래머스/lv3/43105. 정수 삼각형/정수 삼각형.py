def solution(triangle):
    row = len(triangle)
    array = [[0 for _ in range(row)] for _ in range(row)]

    answer = 0
    array[0][0] = triangle[0][0]
    
    for i in range(0,row-1,1):
        for j in range(0,i+1,1):
            for d in range(2):
                array[i+1][j+d] = max(array[i][j]+triangle[i+1][j+d],array[i+1][j+d])
                
    for i in range(0,row,1):
        answer = max(answer,array[row-1][i])
    return answer
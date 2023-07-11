def solution(num_list, n):
    length = len(num_list) // n
    row = length - 1
    column = n - 1
    answer = [[0 for _ in range(column + 1)] for _ in range(row + 1)]
    for i in range(row + 1):
        for j in range(column + 1):
            answer[i][j] = num_list[i*n + j]
    return answer

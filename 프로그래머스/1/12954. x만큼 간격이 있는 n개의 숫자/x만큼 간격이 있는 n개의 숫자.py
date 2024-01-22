def solution(x, n):
    answer = []
    i = 0
    k = x
    while i < n:
        answer.append(x)
        x+=k
        i+=1
    return answer
def solution(n):
    answer = 1
    i = 1
    while (n//answer>0):
        i+=1
        answer*=i
    return i-1
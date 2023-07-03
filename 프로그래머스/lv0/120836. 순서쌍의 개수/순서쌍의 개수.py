def solution(n):
    answer = []
    sum = 0
    for i in range(n):
        if(n%(i+1))==0:
            answer.append(i+1)
    return len(answer)
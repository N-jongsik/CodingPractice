def solution(n):
    answer = []
    for i in range(n):
        if((i+1)<=n):
            if(n%(i+1)==0):
                answer.append(i+1)
    return answer
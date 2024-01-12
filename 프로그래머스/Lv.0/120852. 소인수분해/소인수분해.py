def solution(n):
    answer = []
    k = 2
    while k<=n:
        if n%k == 0:
            answer.append(k)
            n = n//k
        else:
            k+=1
    return sorted(list(set(answer)))
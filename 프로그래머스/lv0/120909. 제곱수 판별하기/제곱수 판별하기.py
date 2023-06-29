def solution(n):
    answer = n**(1/2)
    k=n//answer
    if (answer==k):
        return 1
    else:
        return 2

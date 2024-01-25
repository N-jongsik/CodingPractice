def solution(n):
    k = n ** (1/2)
    if int(k) == k:
        return (k+1)**2
    return -1
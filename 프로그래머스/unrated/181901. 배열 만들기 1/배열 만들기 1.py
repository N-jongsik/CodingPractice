def solution(n, k):
    len=n//k
    return [(i+1)*k for i in range(len)]
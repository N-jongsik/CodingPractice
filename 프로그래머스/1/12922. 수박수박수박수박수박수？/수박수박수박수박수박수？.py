def solution(n):
    if n % 2 == 0:
        return "수박"*int((n/2))
    return "수박"*int(((n-1)/2))+"수"
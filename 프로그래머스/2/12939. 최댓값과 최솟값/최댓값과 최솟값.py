def solution(s):
    answer = s.split()
    k = list(map(int,answer))
    return str(min(k))+" "+str(max(k))
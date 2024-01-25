def solution(n):
    k = sorted(str(n),reverse = True)
    return int("".join(k))
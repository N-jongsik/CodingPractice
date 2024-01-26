def solution(d, budget):
    answer = 0
    k = 0
    d.sort()
    for i in range(len(d)):
        answer+=d[i]
        if answer > budget:
            return i
        else:
            pass
    return len(d)
        
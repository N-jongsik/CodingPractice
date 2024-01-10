def solution(n, control):
    answer = 0
    for i in control:
        if "w" == i:
            answer+=1
        elif "s" == i:
            answer+= -1
        elif "d" == i:
            answer+=10
        else:
            answer+=-10
    return answer+n
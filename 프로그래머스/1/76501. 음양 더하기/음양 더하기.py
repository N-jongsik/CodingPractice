def solution(absolutes, signs):
    answer = 123456789
    for i in range(len(signs)):
        if signs[i] == False:
            absolutes[i] *=(-1)        
    return sum(absolutes)
def solution(lottos, win_nums):
    answer = []
    dict = {6:1,5:2,4:3,3:4,2:5,1:6,0:6}
    cnt = lottos.count(0)
    
    k = 0
    for i in lottos:
        if i in win_nums:
            k+=1
    best = cnt+k
    worst = k
    
    # answer.append(dict[best])
    # answer.append(dict[worst])
    # return answer
    return [dict[best],dict[worst]]
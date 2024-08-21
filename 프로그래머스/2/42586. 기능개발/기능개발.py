import math
def solution(progresses, speeds):
    answer = []
    result = []
    for work,speed in zip(progresses, speeds):
        ans = math.ceil((100 - work)/speed)
        answer.append(ans)
    
    deployment = answer[0]
    count = 0
    
    for day in answer:
        if day<=deployment:
            count+=1
        else:
            result.append(count)
            deployment = day
            count = 1
            
    result.append(count)
    return result
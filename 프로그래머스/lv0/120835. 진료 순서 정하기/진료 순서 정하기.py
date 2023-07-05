def solution(emergency):
    answer = []
    array = sorted(emergency,reverse=True)
    
    for i in emergency:
        answer.append(array.index(i)+1)
    return answer
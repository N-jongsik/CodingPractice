def solution(numLog):
    answer = ''
    dict = {1:"w", -1:"s", 10:"d", -10:"a"}
    i = 1
    while i<len(numLog):
        answer += dict.get(numLog[i] - numLog[i-1])
        i+=1
    return answer
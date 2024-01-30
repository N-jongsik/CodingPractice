def solution(s):
    answer = ''
    lst = s.split(' ')
    for k in lst:
        for i in range(len(k)):
            if i%2 == 0:
                answer+=k[i].upper()
            else:
                answer+=k[i].lower()
        answer+= " "
    return answer[0:-1]
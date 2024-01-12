def solution(my_string, indices):
    answer = ''
    lst = list(map(str,my_string))
    for i in range(len(my_string)):
        if i in indices:
            pass
        else:
            answer+=lst[i]
    return answer
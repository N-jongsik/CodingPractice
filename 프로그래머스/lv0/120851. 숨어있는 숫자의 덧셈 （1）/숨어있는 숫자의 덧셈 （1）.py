def solution(my_string):
    answer = []
    sum = 0
    for i in my_string:
        if i.isdigit():
            answer.append(i)
    for k in answer:
        sum+=int(k)
    return sum
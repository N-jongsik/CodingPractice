def solution(my_string):
    answer = []
    for i in my_string:
        if i.isupper():
            answer.append(i.lower())
        else:
            answer.append(i)
    return "".join(sorted(answer))
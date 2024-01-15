def solution(quiz):
    answer = []
    for i in range(len(quiz)):
        cal = eval(quiz[i].split("=")[0])
        result = int(quiz[i].split("=")[1])
        if cal == result:
            answer.append("O")
        else:
            answer.append("X")
    return answer
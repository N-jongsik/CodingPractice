def solution(todo_list, finished):
    answer = []
    result = []
    for i in finished:
        if i == "true": answer.append(1)
        else: answer.append(0)
    for i in range(len(answer)):
        if finished[i] == 0: result.append(todo_list[i])
        else: pass
    return result
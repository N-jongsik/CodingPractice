def solution(a, d, included):
    result = 0
    for index, value in enumerate(included):
        if value:
            result += a + d * index
    return result
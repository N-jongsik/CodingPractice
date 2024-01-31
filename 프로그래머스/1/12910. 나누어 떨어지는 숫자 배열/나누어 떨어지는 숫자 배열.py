def solution(arr, divisor):
    answer = []
    for i in sorted(arr):
        if i % divisor == 0:
            answer.append(i)
    return [-1] if len(answer) == 0 else answer
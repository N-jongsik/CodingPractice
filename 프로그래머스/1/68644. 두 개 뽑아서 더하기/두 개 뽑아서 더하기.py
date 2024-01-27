from itertools import combinations
def solution(numbers):
    result = []
    answer = list(combinations(numbers,2))
    for i in answer:
        result.append(sum(i))
    return sorted(list(set(result)))
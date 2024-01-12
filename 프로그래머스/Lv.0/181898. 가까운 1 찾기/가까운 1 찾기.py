def solution(arr, idx):
    answer = 0
    for i in arr[idx:]:
        if i == 1:
            answer = arr[idx:].index(1)+idx
    if 1 not in arr[idx:]:
        answer = -1
    return answer
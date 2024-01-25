def solution(arr):
    k = arr.index(min(arr))
    arr.pop(k)
    if len(arr) == 0:   return [-1]
    return arr
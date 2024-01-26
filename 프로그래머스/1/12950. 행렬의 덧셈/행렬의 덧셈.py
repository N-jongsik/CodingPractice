def solution(arr1, arr2):
    
    result = []
    for a,b in zip(arr1,arr2):
        answer = []
        for i,j in zip(a,b):
            answer.append(i+j)
        result.append(answer)
    return result
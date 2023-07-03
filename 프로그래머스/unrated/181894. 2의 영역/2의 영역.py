def solution(arr):
    answer = []
    for i in range(len(arr)):
        if(arr[i]==2):
            answer.append(i)
    if len(answer)==0:
        return [-1]
    else:
        first = answer[0]
        last = answer[len(answer)-1]
        return arr[first:last+1:]
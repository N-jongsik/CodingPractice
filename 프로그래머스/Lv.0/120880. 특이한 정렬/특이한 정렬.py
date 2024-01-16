def solution(numlist, n):
    for i in range(len(numlist)):
        numlist[i] = numlist[i]-n
    result = sorted(numlist,key = lambda x:[abs(x), -x])
    
    for i in range(len(result)):
        result[i] = result[i]+n
    return result
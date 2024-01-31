def solution(A,B):   
    result = 0    
    A.sort(reverse = True)
    B.sort()
    for a,b in zip(A,B):
        result += (a*b)
    return result
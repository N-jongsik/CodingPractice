def solution(a, b):
    sum=int(str(a)+str(b))
    mul=2*a*b
    if(mul<=sum):
        answer=sum
    else:
        answer=mul
    return answer
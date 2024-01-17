def solution(num, total):
    answer = []
    d = 0
    
    for i in range(1,num):
        d+=i
    
    start = (total - d) //num
    answer = [i for i in range(start,start+num)]
    return answer
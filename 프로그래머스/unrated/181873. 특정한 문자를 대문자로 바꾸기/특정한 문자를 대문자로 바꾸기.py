def solution(my_string, alp):
    arr=[i.upper() if(i==alp) else i for i in my_string]
    return ''.join(arr)
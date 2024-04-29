def solution(n):
    answer = ''
    result = 0
    while(n>0):
        answer+=str(n%3)
        n//=3
    reverse_three = answer[::-1]
    for i in range(len(answer)):
        result += int(reverse_three[i])*(3**i)
    return result
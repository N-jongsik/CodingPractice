def solution(myString):
    answer = [i.upper() if (i == "a" or i=="A") else i.lower() for i in myString]
    return "".join(answer)

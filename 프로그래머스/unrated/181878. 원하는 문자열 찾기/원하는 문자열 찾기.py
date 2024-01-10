def solution(myString, pat):
    answer = 0
    if len(pat) > len(myString):
        return 0
    elif pat.upper() in myString.upper():
        return 1
    else:
        return 0
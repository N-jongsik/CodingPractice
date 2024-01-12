def solution(date1, date2):
    return 1 if int("".join(list(map(str,date1)))) < int("".join(list(map(str,date2)))) else 0
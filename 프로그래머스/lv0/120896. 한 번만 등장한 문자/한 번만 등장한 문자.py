def solution(s):
    answer = [i for i in s if s.count(i) ==1]
    answer.sort()
    return "".join(answer)
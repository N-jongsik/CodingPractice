def solution(my_string, n):
    answer1 = [i*n for i in my_string]
    answer="".join(answer1)
    return answer
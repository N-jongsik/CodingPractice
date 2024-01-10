def solution(my_string, is_prefix):
    is_prefix_len = len(is_prefix)
    if my_string[0:is_prefix_len] == is_prefix:
        answer = 1
    else:
        answer = 0
    return answer

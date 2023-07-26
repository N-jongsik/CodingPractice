def solution(spell, dic):
    answer = 0
    for i in dic:
        if sorted(i) == sorted(spell):
            return 1
    return 2
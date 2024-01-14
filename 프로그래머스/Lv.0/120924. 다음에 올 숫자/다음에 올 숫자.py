def solution(common):
    one, two, three = common[:3]
    if three - two == two - one:
        return common[-1] + three -two
    else:
        return common[-1] * three//two
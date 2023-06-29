def solution(my_string):
    result = ""
    for i in my_string:
        if i.islower():
            result += i.upper()
        else:
            result += i.lower()
    return result

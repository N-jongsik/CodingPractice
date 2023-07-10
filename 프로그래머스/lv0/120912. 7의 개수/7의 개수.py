def solution(array):
    output = ''
    for i in array:
        output+=str(i)
    print("".join(output))
    result = 0
    for i in output:
        if '7'== i:
            result+=1
    return result
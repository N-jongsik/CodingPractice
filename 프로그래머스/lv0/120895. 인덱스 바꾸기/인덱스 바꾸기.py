def solution(my_string, num1, num2):
    My_string = list(my_string)
    temp = My_string[num1]
    My_string[num1] = My_string[num2]
    My_string[num2] = temp
    return "".join(My_string)
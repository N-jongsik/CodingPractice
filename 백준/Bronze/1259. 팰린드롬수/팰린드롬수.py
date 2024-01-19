num = []
while True:
    user_input = int(input())
    if int(user_input) == 0:
        break
    else:
        if str(user_input) == str(user_input)[::-1]:
            num.append("yes")
        else: num.append('no')
for i in num:
    print(i)
str = input()
submit = ''
for i in str:
    if i.isupper():
        submit+=i.lower()
    else:
        submit+=i.upper()
print(submit)
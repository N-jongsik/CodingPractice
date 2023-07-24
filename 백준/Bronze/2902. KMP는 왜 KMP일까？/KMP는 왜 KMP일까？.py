str = input()
arr = []
for i in str:
    if i.isupper():
        arr.append(i)
for i in arr:
    print(i,end="")
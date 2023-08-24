T = int(input())
lst = []

for i in range(T):
    a,b = input().split()
    a = int(a)
    result = ''
    for i in b:
        result += str(i)*a
    lst.append(result)
for i in lst:
    print(i)
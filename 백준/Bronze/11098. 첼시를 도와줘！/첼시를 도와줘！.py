n = int(input())

answer = []

for i in range(n):
    p = int(input())
    lst = []
    
    for j in range(p):
        a, b = map(str,input().split())
        lst.append((a,b))
    dictionary = dict(lst)
    max_price = max(list(map(int,list(dict(lst).keys()))))
    answer.append(dictionary[str(max_price)])

for i in answer:
    print(i)
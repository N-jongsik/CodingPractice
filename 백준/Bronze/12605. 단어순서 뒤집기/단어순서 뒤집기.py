N = int(input())
lst = []
for i in range(N):
    lst.append(list(map(str,input().split())))
for i in range(len(lst)):
    print(f'Case #{i+1}: {" ".join(lst[i][::-1])}')

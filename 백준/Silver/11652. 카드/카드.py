N = int(input())
lst = []
dict = {}
for i in range(N):
    lst.append(int(input()))
for i in lst:
    if dict.get(i):
        dict[i]+=1
    else:
        dict[i] = 1
result = sorted(dict.items(),key = lambda x:(-x[1],x[0]))
print(result[0][0])
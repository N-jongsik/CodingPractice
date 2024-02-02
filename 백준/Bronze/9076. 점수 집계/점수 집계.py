T = int(input())
lst = []
result = []
k = []
for i in range(T):
    lst.append(sorted(list(map(int,input().split()))))

for i in lst:
    result.append(i[1:4])
    kin = i[4]-i[1]
    if kin >= 4:
        answer = "KIN"
    else:
        answer = sum(i[1:4])
    k.append(answer)
for i in k:
    print(i)
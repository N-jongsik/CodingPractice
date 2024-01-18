lst = []
for i in range(8):
    lst.append(list(input()))

answer = 0

for i in range(0,8,2):
    for j in range(0,8,2):
        if lst[i][j] == "F":
            answer+=1

for i in range(1,8,2):
    for j in range(1,8,2):
        if lst[i][j] == "F":
            answer+=1
print(answer)
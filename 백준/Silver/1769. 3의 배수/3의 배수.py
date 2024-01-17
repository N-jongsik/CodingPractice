X = input()
cnt = 0

while len(X) > 1:
    cnt+=1
    answer = 0
    for i in X:
        answer += int(i)
    X = str(answer)
    
print(cnt)
if int(X)%3 != 0:
    print("NO")
else: print("YES")
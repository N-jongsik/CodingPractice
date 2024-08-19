N,K = map(int,input().split())
lst = [list(map(int,input().split())) for i in range(N)]
lst.sort(key=lambda x:(x[1],x[2],x[3]),reverse=True)

for i in range(N):
    if lst[i][0] == K:
        index = i
        break

for i in range(N):
    if lst[index][1:] == lst[i][1:]:
        print(i + 1)
        break
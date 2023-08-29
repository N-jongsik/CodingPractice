N,M = map(int,input().split())
lst = list(map(int,input().split()))

start,end = 0,1
cnt = 0

while end<=N and start<=end:
    sum_lst = lst[start:end]
    total = sum(sum_lst)

    if total == M:
        cnt+=1
        end+=1
    elif total < M:
        end+=1
    else:
        start+=1

print(cnt) 

N, new, P = map(int,input().split())
if N == 0:
    print(1)
else:
    lst = list(map(int,input().split()))

    if N==P and lst[-1] >= new:
        print(-1)
    else:  
        rank = N+1
        for i in range(N):
            if lst[i] <= new:
                rank = i+1
                break      
        print(rank)
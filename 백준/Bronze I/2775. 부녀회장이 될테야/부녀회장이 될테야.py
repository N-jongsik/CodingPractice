T = int(input())
for i in range(T):
    k = int(input())
    n = int(input())
    
    dp = [j for j in range(1,n+1)] #0층

    for x in range(k):
        for y in range(1,n):
            dp[y] +=dp[y-1]
    print(dp[-1])
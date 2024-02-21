N = int(input())
dp = [0]*(301)

lst = [0]+[int(input()) for i in range(N)]+[0]

dp[1] = lst[1]
dp[2] = lst[1]+lst[2]

for i in range(3,N+1):
    dp[i] = lst[i] + max(dp[i-2],dp[i-3]+lst[i-1])
print(dp[N])
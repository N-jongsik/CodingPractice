import sys
input = sys.stdin.readline
N = int(input())
dp = [0]*(1001)

dp[1] = 1 #2x1 짜리 하나 총 1가지
dp[2] = 2 #2x1 짜리 두개,1x2 짜리 두개 총 2가지

for i in range(3,N+1):
    dp[i] = (dp[i-1] + dp[i-2]) % 10007
print(dp[N])
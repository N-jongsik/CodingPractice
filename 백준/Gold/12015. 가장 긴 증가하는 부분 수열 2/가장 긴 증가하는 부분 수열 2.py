from bisect import bisect_left
N = int(input())
A = [*map(int,input().split())]

dp = [A[0]]
for i in range(N):
    if dp[-1] < A[i]:
        dp.append(A[i])
    else:
        index = bisect_left(dp,A[i])
        dp[index] = A[i]
print(len(dp))
N = int(input())
A = list(map(int,input().split()))
B = list(map(int,input().split()))
sorted_A = sorted(A)
sorted_B = sorted(B,reverse=True)
result = 0
for i in range(N):
    result+=sorted_A[i]*sorted_B[i]
print(result)
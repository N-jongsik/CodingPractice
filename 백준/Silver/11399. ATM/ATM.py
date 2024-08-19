N = int(input())
lst = list(map(int,input().split()))

result = 0
lst.sort()

for i in range(N):
    result += lst[i]*(N-i)
    
print(result)
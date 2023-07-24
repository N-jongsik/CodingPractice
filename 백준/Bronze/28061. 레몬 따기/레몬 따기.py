N = int(input())
arr = list(map(int, input().split()))
lemon = [arr[i]-(N-i) for i in range(N)]
print(max(lemon))
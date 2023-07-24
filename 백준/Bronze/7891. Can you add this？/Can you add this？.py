arr = []
t = int(input())
for i in range(t):
    a1, a2 = map(int, input().split())
    arr.append(a1+a2)
for i in range(t):
    print(arr[i])
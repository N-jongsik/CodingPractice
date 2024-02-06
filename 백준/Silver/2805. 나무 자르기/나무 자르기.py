N, M = map(int,input().split())
lst = [*map(int,input().split())]

start = 0
end = max(lst)
result = 0

while start <= end:
    total = 0
    mid = (start+end)//2
    for num in lst:
        if num > mid:
            total+=num-mid
    if total >= M:
        start = mid + 1
    else:
        end = mid - 1
print(end)
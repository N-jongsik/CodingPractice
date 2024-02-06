N = int(input())
A = list(map(int,input().split()))
M = int(input())
check = list(map(int,input().split()))

A.sort()

for i in check:
    start = 0
    end = len(A)-1
    result = 0
    while start <= end:
        mid = (start+end)//2
        if A[mid] == i:
            print(1)
            break
        elif A[mid] > i:
            end = mid -1
        else:
            start = mid + 1
    if A[mid]!=i:
        print(0)
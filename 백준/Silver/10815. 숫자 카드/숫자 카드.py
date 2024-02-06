N = int(input())
N_lst = [*map(int, input().split())]
N_lst.sort()

M = int(input())
M_lst = [*map(int, input().split())]

def binary_search(N_lst, target):
    start = 0
    end = len(N_lst) - 1
    while start <= end:
        mid = (start + end) // 2
        if N_lst[mid] == target:
            return 1
        elif N_lst[mid] < target:
            start = mid + 1
        else:
            end = mid - 1
    return 0

for num in M_lst:
    result = binary_search(N_lst, num)
    print(result, end=" ")
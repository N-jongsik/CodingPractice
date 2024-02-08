def binary_search(start,end):
    target = end
    while start <= end:
        mid = (start + end) // 2
        if (mid**2) == target:
            return mid
        elif (mid **2) < target:
            start = mid +1
        else:
            end = mid - 1

N = int(input()) 
print(binary_search(1,N))  
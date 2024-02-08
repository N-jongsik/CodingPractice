def binary_search(start,end):
    target = end
    while True:
        mid = (start + end) // 2
        if (mid**2) == target:
            return mid
        elif (mid **2) < target:
            start = mid
        else:
            end = mid

N = int(input()) 
print(binary_search(1,N))  
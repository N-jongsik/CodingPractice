N, K = map(int,input().split())
lst = [*map(int,input().split())]
lst.sort()
print(lst[K-1])
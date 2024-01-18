from itertools import combinations
a,b = map(int,input().split())
lst = [i for i in range(a)]
print(len(list(combinations(lst,b))))
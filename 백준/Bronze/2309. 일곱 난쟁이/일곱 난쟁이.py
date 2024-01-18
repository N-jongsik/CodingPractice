from itertools import combinations
lst = [int(input())for i in range(9)]

for i in combinations(lst,7):
    if sum(i) == 100:
        for j in sorted(i):
            print(j)
        break
import sys
input = sys.stdin.readline

lst = []
index = []

for i in range(8):
    lst.append(int(input()))
    
sort_lst = sorted(lst,reverse = True)[:5]
print(sum(sort_lst))

for i in reversed(sort_lst):
    index.append(lst.index(i)+1)
index.sort()
print(*index)
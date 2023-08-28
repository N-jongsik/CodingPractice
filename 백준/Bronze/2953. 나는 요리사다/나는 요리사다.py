import sys
total = []

for i in range(5):
    score = list(map(int,sys.stdin.readline().split()))
    total.append(sum(score))

print(total.index(max(total))+1,max(total))
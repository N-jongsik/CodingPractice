N = int(input())
lst = [input() for i in range(N)]
for i in lst:
    if 6 <= len(i) <= 9:
        print("yes")
    else: print("no")
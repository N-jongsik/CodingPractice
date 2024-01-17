import sys
input = sys.stdin.readline

N = int(input())

for i in range(N):
    lst = input().rstrip().split("X")
    answer = 0
    for j in lst:
        k = 1
        while k <= len(j):
            answer+=k
            k+=1
    print(answer)
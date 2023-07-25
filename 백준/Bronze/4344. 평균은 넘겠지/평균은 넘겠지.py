import sys
input = sys.stdin.readline

C = int(input())
arr = []
for i in range(C):
    arr.append(list(map(int, input().split())))

for i in range(len(arr)):
    n = arr[i][0]
    average = sum(arr[i][1:]) / n
    count = 0
    for j in arr[i][1:]:
        if j>average:
            count+=1
    formatted_average = "{:.3f}".format((count/n)*100)
    print(formatted_average+'%')
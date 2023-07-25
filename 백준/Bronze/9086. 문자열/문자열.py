T = int(input())
arr=[]
for i in range(T):
    arr.append(input())
for i in arr:
    print(i[0]+i[-1])
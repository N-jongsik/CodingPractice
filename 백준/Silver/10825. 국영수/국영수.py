N = int(input())
lst = []
for i in range(N):
    name,korean,english,math = input().split()
    lst.append([name,int(korean),int(english),int(math)])
lst.sort(key = lambda x: (-x[1],x[2],-x[3],x[0]))
for i in lst:
    print(i[0])
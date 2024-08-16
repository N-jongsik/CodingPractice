N = int(input())
lst = [input() for i in range(N)]

row = 0
column = 0

for i in range(N):
    count = 0 
    for j in range(N):
        if lst[i][j] == '.':
            count+=1
        else:
            if count >=2:
                row+=1
            count = 0
    if count >=2:
        row+=1
        
for j in range(N):
    count = 0 
    for i in range(N):
        if lst[i][j] == '.':
            count+=1
        else:
            if count >=2:
                column+=1
            count = 0        
    if count >=2:
        column+=1
print(row,column)  
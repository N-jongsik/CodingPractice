A,B = map(int,input().split())
str_A = str(A)
str_B = str(B)

A1 = str_A.replace('6','5')
B1 = str_B.replace('6','5')
result1 = int(A1)+int(B1)

A2 = str_A.replace('5','6')
B2 = str_B.replace('5','6')
result2 = int(A2)+int(B2)

print(result1,result2)
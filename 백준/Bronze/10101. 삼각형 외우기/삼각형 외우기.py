A,B,C = [int(input()) for _ in range(3)]
if A==B==C==60:
    print('Equilateral')
elif A+B+C == 180 and (A==B or A==C or B==C):
    print('Isosceles')
elif A+B+C == 180 and (A!=B!=C):
    print('Scalene')
elif A+B+C != 180:
    print('Error')
 
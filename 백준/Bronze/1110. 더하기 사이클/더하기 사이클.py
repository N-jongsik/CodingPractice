N = int(input())
original = N
count = 0

while True:
    num1 = N//10
    num2 = N%10
    new = num1 + num2
    new = new%10
    N = num2*10 + new
    count += 1
    if original == N:
         break
print(count)
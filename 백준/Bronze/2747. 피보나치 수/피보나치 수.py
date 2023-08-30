n = int(input())
# def fibonacci(num):
#     if num == 0:
#         return 0
#     elif num == 1:
#         return 1
#     else:
#         return fibonacci(num - 1) + fibonacci(num - 2)
    
# print(fibonacci(n))

fibonacci = [0,1]
for i in range(n-1):
    fibonacci.append(fibonacci[i] + fibonacci[i+1])
print(fibonacci[-1])

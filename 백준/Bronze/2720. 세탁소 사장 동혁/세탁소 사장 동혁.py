T = int(input())
arr = []
for _ in range(T):
    line = int(input())
    arr.append(line)

answer = []
for i in arr:
    answer.append(str(i // 25))
    answer.append(str((i % 25) // 10))
    answer.append(str(((i % 25) % 10) // 5))
    answer.append(str(((i % 25) % 10) % 5))

for i in range(0, len(answer), 4):
    result = ' '.join(answer[i:i+4])
    print(result)

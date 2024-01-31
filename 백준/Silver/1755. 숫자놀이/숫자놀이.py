M, N = map(int, input().split())
dict = {"0": "zero", "1": "one", "2": "two", "3": "three", "4": "four", "5": "five", "6": "six", "7": "seven", "8": "eight", "9": "nine"}

lst = []
for num in range(M, N + 1):
    a = "".join(dict[i] for i in str(num))
    lst.append([num,a])

lst.sort(key = lambda x: x[1])

for i in range(len(lst)):
    if i%10 == 0 and i!= 0:
        print()
    print(lst[i][0], end=' ')
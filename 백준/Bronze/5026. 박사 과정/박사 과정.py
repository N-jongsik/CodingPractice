N = int(input())
lst = [input() for i in range(N)]
answer = []
for i in lst:
    if i == "P=NP":
        print("skipped")
    else:
        print(eval(i))

    
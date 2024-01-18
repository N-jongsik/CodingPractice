N = input()
answer = ""
for i in N:
    answer+=i
    if len(answer) > 10:
        print("\n",end="")
        answer = i
    else: pass
    print(i,end="")
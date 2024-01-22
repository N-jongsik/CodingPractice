s = int(input())
lst = [0]*10
for i in str(s):
    if i == "9" or i == "6":
        if lst[6] == lst[9]:
            lst[6]+=1
        else:
            lst[9]+=1
    else:
        lst[int(i)]+=1
print(max(lst))
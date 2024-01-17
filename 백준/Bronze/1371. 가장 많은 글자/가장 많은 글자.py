import sys
lst = sys.stdin.read()
li = [0]*26

for i in lst:
    if i.islower():
        li[ord(i)-97] += 1
    
for i in range(26):
    if li[i] == max(li):
        print(chr(i+97), end="")
            
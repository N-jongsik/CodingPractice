S = input()
alphabet = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
arr = [0]*26
for i in S:
    if i in alphabet:
        arr[alphabet.index(i)]+=1
for i in range(len(arr)):
    print(arr[i],end=" ")

def solution(n, arr1, arr2):
    answer = []
    temp1 = []
    temp2 = []
    temp3 = []
    
    for i in arr1:
        if len(bin(i)[2:]) != n:
            temp1.append("0"*(n-len(bin(i)[2:]))+str(bin(i)[2:])) 
        else:
            temp1.append(bin(i)[2:])
            
    for i in arr2:
        if len(bin(i)[2:]) != n:
            temp2.append("0"*(n-len(bin(i)[2:]))+str(bin(i)[2:])) 
        else:
            temp2.append(bin(i)[2:])
    
    for t1,t2 in zip(temp1,temp2):
        row = "".join('1' if digit1 == '1' or digit2 == '1' else '0' for digit1, digit2 in zip(t1, t2))
        temp3.append(row.replace("1","#").replace("0"," "))

    return temp3
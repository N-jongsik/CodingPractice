def solution(array, n):
    answer = 0
    array.append(n)
    array.sort()
    index = array.index(n)
    if(index==len(array)-1):
        return array[index-1]
    else:
        if(n - array[index-1] <= array[index+1]-n):
            return array[index-1]
        elif(n - array[index-1] > array[index+1]-n):
            return array[index+1]
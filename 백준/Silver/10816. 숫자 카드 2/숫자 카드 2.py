from bisect import bisect_left,bisect_right

N = int(input())
N_lst = list(map(int,input().split()))
M = int(input())
M_lst = list(map(int,input().split()))

def count_num(N_lst,left,right):
    left_value = bisect_left(N_lst,left)
    right_value = bisect_right(N_lst,right)
    return right_value - left_value

N_lst.sort()

for i in M_lst:
    result = count_num(N_lst,i,i)
    print(result,end=" ")
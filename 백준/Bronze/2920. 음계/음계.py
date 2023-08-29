lst = list(map(int,input().split()))
lst_a = sorted(lst)
lst_d = sorted(lst,reverse=True)
if lst == lst_a:
    print('ascending')
elif lst == lst_d:
    print('descending')
else:
    print('mixed')
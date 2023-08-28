K = int(input())
tree = list(map(int,input().split()))
l = len(tree)
ans = [[] for _ in range(K)]

def solution(start,end,level):
    if start ==end:
        ans[level].append(tree[start])
        return
    center = (start+end)//2
    ans[level].append(tree[center])
    solution(start,center - 1, level+1)
    solution(center+1,end,level+1)

solution(0,l-1,0)
for i in ans:
    print(*i)
from itertools import permutations
N = int(input())
lst = list(map(int,input().split()))

result = 0

permu = permutations(lst,N)

def permutation(li):
    answer = 0
    for i in range(N-1):
        answer += abs(li[i]-li[i+1])
    return answer

for li in list(permu):
    result = max(result,permutation(li))
print(result)
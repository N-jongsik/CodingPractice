import sys
from collections import Counter

input = sys.stdin.readline

N = int(input())
answer = []
lst = [int(input().rstrip()) for _ in range(N)]

# 산술평균
answer.append(int(round(sum(lst) / len(lst), 0)))

# 중앙값
sort_lst = sorted(lst)
answer.append(sort_lst[N // 2])

# 최빈값
counter = Counter(lst)
max_count = max(counter.values())
mode_values = [num for num, count in counter.items() if count == max_count]
mode_values.sort(reverse=True)
answer.append(mode_values[0] if len(mode_values) == 1 else mode_values[-2])

# 범위
answer.append(sort_lst[-1] - sort_lst[0])

for i in answer:
    print(i)

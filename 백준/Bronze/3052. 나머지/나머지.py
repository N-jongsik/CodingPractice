lst = [int(input()) for _ in range(10)]
result = [i%42 for i in lst]
set_result = set(result)
submit = list(set_result)
print(len(submit))
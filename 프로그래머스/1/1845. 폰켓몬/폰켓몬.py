def solution(nums):
    num = len(nums)//2
    set_nums = set(nums)
    len_set_nums = len(set_nums)
    
    if num < len_set_nums:
        return num
    return len_set_nums
    
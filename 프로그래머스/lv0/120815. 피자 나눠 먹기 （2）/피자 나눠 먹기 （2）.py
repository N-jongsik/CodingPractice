import math
def solution(n):
    gcd = math.gcd(n,6)
    lcm = (n*6)//gcd
    return lcm//6
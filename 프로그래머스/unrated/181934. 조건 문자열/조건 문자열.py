def solution(ineq, eq, n, m):
    answer = 0
    if eq=="=":
        ineq = ineq+eq
        if ineq==">=":
            if(n >= m):
                return 1
            else:
                return 0
        else:
            if(n <= m):
                return 1
            else:
                return 0
    else:
        if ineq==">":
            if n>m:
                return 1
            else:
                return 0
        else:
            if n<m:
                return 1
            else:
                return 0
def slope(a,b):
    return(a[1]-b[1]) / (a[0]-b[0])
def solution(dots):
    p1,p2,p3,p4 = dots[:4]
    
    if(slope(p3,p1) == slope(p4,p2) or slope(p4,p3) == slope(p2,p1)):
        return 1
    else: return 0
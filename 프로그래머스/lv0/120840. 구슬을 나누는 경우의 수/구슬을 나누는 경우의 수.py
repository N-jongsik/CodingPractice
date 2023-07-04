def solution(balls, share):
    balls_factorial = 1
    for i in range(1,balls+1,1):
        balls_factorial*=i
    
    share_factorial = 1
    for i in range(1,share+1,1):
        share_factorial*=i
    
    balls_share_factorial = 1
    for i in range(1,(balls-share)+1,1):
        balls_share_factorial*=i
        
    return balls_factorial/(balls_share_factorial*share_factorial) 
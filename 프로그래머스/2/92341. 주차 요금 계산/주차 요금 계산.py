import math
from collections import defaultdict

def solution(fees, records):
    answer = []
    records_dict = defaultdict(list)

    for i in records:
        time, number, record = i.split(" ")
        hour, minute = map(int, time.split(":"))
        time = hour * 60 + minute
        records_dict[number].append(time)
        
    for i in records_dict:
        if len(records_dict[i])%2 == 1:
            records_dict[i].append(23*60+59)
    cars = sorted(records_dict.keys())
    
    for car in cars:
        money = 0
        time = sum(records_dict[car][1::2]) - sum(records_dict[car][::2])
        if time > fees[0]:
            money+=fees[1]+math.ceil((time-fees[0])/fees[2])*fees[3]
        else:
            money+=fees[1]
        
        answer.append(money)
    return answer
        
        
        
        
        
        
    return answer

def convert_date(day):
    y, m, d = map(int,day.split("."))
    return y*12*28+m*28+d

def solution(today, terms, privacies):
    answer = []
    dict = {}
    today = convert_date(today)
    
    for i in terms:
        type_terms, month = i.split()
        dict[type_terms] = int(month)
        
    for j,i in enumerate(privacies):
        date, condition = i.split()
        if convert_date(date) + dict[condition]*28 <= today:
            answer.append(j+1)
        
    return answer
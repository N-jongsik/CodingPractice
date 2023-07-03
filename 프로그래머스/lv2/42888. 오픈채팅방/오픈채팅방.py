def solution(record):
    answer = []
    dic={}
    for i in record:
        sentence = i.split()
        if len(sentence)==3:
            dic[sentence[1]]=sentence[2]
            
    for i in record:
        sentence = i.split()
        if(sentence[0]=='Enter'):
            answer.append("%s님이 들어왔습니다."%dic[sentence[1]])
        elif(sentence[0]=='Leave'):
            answer.append("%s님이 나갔습니다."%dic[sentence[1]])
    return answer

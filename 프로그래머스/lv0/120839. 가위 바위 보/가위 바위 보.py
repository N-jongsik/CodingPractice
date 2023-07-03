def solution(rsp):
    answer = []
    
    win_rsp = {
        "2": "0", "0": "5", "5": "2"
    }
    
    for h in list(rsp):
        answer.append(win_rsp[h])
    
    return "".join(answer)
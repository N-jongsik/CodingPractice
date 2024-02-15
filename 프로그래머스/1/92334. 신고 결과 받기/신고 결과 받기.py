from collections import defaultdict
def solution(id_list, report, k):
    #동일 유저 신고 중복 x
    #신고 받은 횟수 저장 후 출력
    #신고한 사람 send
    #신고 받은 사람 recv
    
    recv2cnt = defaultdict(int)
    send2recv = defaultdict(set)
    
    for r in report:
        send, recv = r.split()
        if recv in send2recv[send]:
            continue
        else:
            send2recv[send].add(recv)
            recv2cnt[recv] += 1
    
    answer = []
    for send in id_list:
        stop_cnt = sum([recv2cnt[recv] >= k for recv in send2recv[send]])
        answer.append(stop_cnt)
    return answer
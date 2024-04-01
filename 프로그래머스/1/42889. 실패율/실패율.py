def solution(N, stages):
    dict = {} #딕셔너리에 스테이지와 실패율 저장
    user = len(stages) #모든 사용자
    for i in range(1,N+1):
        not_clear_user = stages.count(i) #통과 못한 사용자
        if user == 0:
            fail_rate = 0
        else:
            fail_rate = not_clear_user/user #실패율
        dict[i] = fail_rate
        user -= not_clear_user #총 사용자 업데이트
    result = sorted(dict.items(), key = lambda x : -x[1]) #실패율을 기준으로 내림차순 정렬
    answer = []
    for i in range(len(result)):
        answer.append(result[i][0])
    return answer
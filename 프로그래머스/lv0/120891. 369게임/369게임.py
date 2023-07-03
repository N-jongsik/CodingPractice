def solution(order):
    order_str = str(order)  # order를 문자열로 변환하여 저장
    answer = 0
    for digit in order_str:
        if digit in ['3', '6', '9']:
            answer += 1
    return answer

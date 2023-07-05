def solution(array, commands):
    result = []
    for cmd in commands:
        i, j, k = cmd
        # 인덱스 보정
        i -= 1
        j -= 1
        k -= 1

        # 슬라이스 생성
        slice = array[i:j+1]
        slice.sort()
        result.append(slice[k])

    return result

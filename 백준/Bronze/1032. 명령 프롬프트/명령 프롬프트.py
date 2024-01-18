# 사용자로부터 문자열의 갯수를 입력받기
num_strings = int(input())

# 각 문자열을 담을 리스트 초기화
string_lists = [[] for _ in range(num_strings)]

# 사용자로부터 각 문자열을 입력받아 리스트에 추가
for i in range(num_strings):
    input_str = input()
    string_lists[i] = list(input_str)

# 첫 번째 문자열을 기준으로 비교하며 결과 출력
for char_index in range(len(string_lists[0])):
    current_char = string_lists[0][char_index]
    mismatch = False

    for string_list in string_lists[1:]:
        if char_index < len(string_list) and string_list[char_index] != current_char:
            mismatch = True
            break

    if mismatch:
        print("?", end="")
    else:
        print(current_char, end="")

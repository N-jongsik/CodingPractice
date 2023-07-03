def solution(cipher, code):
    length = len(cipher)
    answer = length//code
    for i in range(answer):
        return cipher[code-1::code]
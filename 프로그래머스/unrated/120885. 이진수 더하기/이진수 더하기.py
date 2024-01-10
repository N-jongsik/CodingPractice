def solution(bin1, bin2):
    answer = ''
    binary1 = int(bin1,2)
    binary2 = int(bin2,2)
    result = binary1 + binary2
    return bin(result)[2:]
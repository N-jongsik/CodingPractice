def solution(strArr):
    length_counts = {}
    
    # Count the occurrences of each string length
    for string in strArr:
        length = len(string)
        if length in length_counts:
            length_counts[length] += 1
        else:
            length_counts[length] = 1
    
    # Find the maximum frequency
    max_frequency = max(length_counts.values())
    
    return max_frequency
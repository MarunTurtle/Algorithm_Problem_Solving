def classify_sequence(sequence):
    if sequence == [1, 2, 3, 4, 5, 6, 7, 8]:
        return "ascending"
    elif sequence == [8, 7, 6, 5, 4, 3, 2, 1]:
        return "descending"
    else:
        return "mixed"

# 예제 입력 처리
sequence = list(map(int, input().split()))
result = classify_sequence(sequence)
print(result)

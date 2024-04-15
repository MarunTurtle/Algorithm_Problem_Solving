sequence = list(map(int, input().split()))

if sequence == sorted(sequence):
    print("ascending")
elif sequence == sorted(sequence, reverse = True):
    print("descending")
else:
    print("mixed")
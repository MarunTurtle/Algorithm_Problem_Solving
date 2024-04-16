B = [a % 42 for a in [int(input()) for _ in range(10)]]
print(len(set(B)))

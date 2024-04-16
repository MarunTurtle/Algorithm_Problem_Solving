A = []
for _ in range(10):
    a = int(input())
    A.append(a)

B = []
for a in A:
    b = a % 42
    B.append(b)

print(len(set(B)))
N, M = map(int, input().split())

A = []
for i in range(N):
    row = list(map(int, input().split()))
    A.append(row)

B = []
for i in range(N):
    row = list(map(int, input().split()))
    B.append(row)

C = []
for i in range(N):
    row = [A[i][j] + B[i][j] for j in range(M)]
    C.append(row)

for i in C:
    print(' '.join(map(str, i)))
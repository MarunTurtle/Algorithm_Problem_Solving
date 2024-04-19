n, m = map(int, input().split())

A = [list(map(int, input().split())) for _ in range(n)]

B = [list(map(int, input().split())) for _ in range(n)]

C = []
for i in range(n):
    row = [A[i][j] + B[i][j] for j in range(m)]
    C.append(row)

for row in C:
    print(' '.join(map(str, row)))
N, M = map(int, input().split())

A = []
for _ in range(N):
    row = list(map(int, input().split()))
    A.append(row)
    
B = []
for _ in range(N):
    row = list(map(int, input().split()))
    B.append(row)
    
result = []
for i in range(N):
    row = [A[i][j] + B[i][j] for j in range(M)]
    result.append(row)
    
for row in result:
    print(' '.join(map(str, row)))
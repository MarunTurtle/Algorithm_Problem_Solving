while True:
    A = list(map(int, input().split()))
    
    if 0 in A[0:2]:
        break

    A.sort()
    if pow(A[0], 2) + pow(A[1], 2) == pow(A[2], 2):
        print('right')
    else:
        print('wrong')
    
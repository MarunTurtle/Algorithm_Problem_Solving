# 첫째 줄 입력 받기: N과 X
N, X = map(int, input().split())

# 둘째 줄 입력 받기: 수열 A
A = list(map(int, input().split()))

# X보다 작은 수를 찾아 출력하기
result = [str(a) for a in A if a < X]

# 결과를 공백으로 구분하여 출력
print(' '.join(result))

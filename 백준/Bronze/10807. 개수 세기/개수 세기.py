# 첫째 줄 입력: 정수의 개수 N
N = int(input())

# 둘째 줄 입력: N개의 정수
integers = list(map(int, input().split()))

# 셋째 줄 입력: 찾으려는 정수 v
v = int(input())

# 정수 v의 등장 횟수 세기
count_v = integers.count(v)

# 결과 출력
print(count_v)

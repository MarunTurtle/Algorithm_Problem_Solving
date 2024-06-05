# 입력 받기
A = input().strip()
B = input().strip()
C = input().strip()

# 정수 계산
int_result = int(A) + int(B) - int(C)

# 문자열 계산
str_result = int(A + B) - int(C)

# 결과 출력
print(int_result)
print(str_result)
# 입력 처리
N = int(input())  # 과목의 개수
scores = list(map(int, input().split()))  # 점수 리스트

# 최댓값 찾기
M = max(scores)

# 점수 변환 및 합계 계산
new_scores = [(score / M) * 100 for score in scores]
average = sum(new_scores) / N

# 결과 출력
print(average)
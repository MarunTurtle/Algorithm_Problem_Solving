def knapsack(N, K, items):
    # dp 배열 초기화
    dp = [0] * (K + 1)

    # 모든 물건들에 대해서 처리
    for W, V in items:
        # 현재 물건을 넣을지 말지 결정하기 위해 역순으로 처리
        for weight in range(K, W - 1, -1):
            dp[weight] = max(dp[weight], dp[weight - W] + V)

    # 최대 가치 출력
    return dp[K]

# 입력
N, K = map(int, input().split())
items = [tuple(map(int, input().split())) for _ in range(N)]

# 결과 출력
print(knapsack(N, K, items))

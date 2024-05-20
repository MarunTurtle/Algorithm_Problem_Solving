N, K = map(int, input().split())

Coins = [int(input()) for _ in range(N)]

re_Coins = sorted(Coins, reverse=True)

count = 0
for coin in re_Coins:
    count += K // coin
    K %= coin

print(count)


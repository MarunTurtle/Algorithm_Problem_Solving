n, m = map(int, input().split())

baskets = [i for i in range(1, n+1)]

for _ in range(m):
    i, j = map(int, input().split())
    while i < j:
        baskets[i-1], baskets[j-1] = baskets[j-1], baskets[i-1]
        i += 1
        j -= 1

print(' '.join(map(str, baskets)))


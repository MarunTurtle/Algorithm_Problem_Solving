n, x = map(int, input().split())

A = list(map(int, input().split()))

B = [a for a in A if a < x]

print(' '.join(map(str, B)))
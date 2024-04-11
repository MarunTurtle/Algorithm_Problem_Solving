A = list(map(int, input().split()))

print(sum(a**2 for a in A)%10)
def is_prime(n):
    """Check if a number is a prime using trial division."""
    if n <= 1:
        return False
    if n <= 3:
        return True
    if n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

n = int(input())

A = list(map(int, input().split()))

B = [a for a in A if is_prime(a)]

print(len(B))

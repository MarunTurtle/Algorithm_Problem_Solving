t = int(input())

for _ in range(t):
    s, r = input().split()
    R = [rr * int(s) for rr in r]
    print(''.join(R))

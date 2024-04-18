t = int(input())

for _ in range(t):
    r, s = input().split()
    r = int(r)
    p = ''

    for i in s:
        p += i*r
    
    print(p)
def alarm(h, m):  
    if m >= 45:
        m -= 45
        print(h, m, sep=" ")
    elif m < 45:
        m += 15
        if h > 0:
            h -= 1
        else:
            h = 23
        print(h, m, sep=" ")

hour, minute = map(int, input().split())
alarm(hour, minute)
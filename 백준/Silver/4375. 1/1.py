while True:
    try:
        n = int(input())
        x = '1'
        while True:
            try:
                if int(x)%n == 0:
                    print(len(x))
                    break
                else:
                    x += '1'
            except: 
                break
    except:
        break
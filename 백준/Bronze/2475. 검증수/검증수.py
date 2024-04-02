num = list(map(int, input().split()))

def des_num(a):
    b = sum(x**2 for x in a)
    return b % 10

print(des_num(num))
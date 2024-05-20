n = int(input())

def gen(n):
    
    start = max(0, n - len(str(n)) * 9)    
    for i in range(start, n):
        digit_sum = sum(int(char) for char in str(i))
        if i + digit_sum == n:
            return i
    return 0

print(gen(n))
t = int(input())

def p(text, num):
    for char in text:
        print(char * num, end='')

for i in range(t):
    r, s = input().split()
    r = int(r)  # Convert r to integer here
    p(s, r)
    print()

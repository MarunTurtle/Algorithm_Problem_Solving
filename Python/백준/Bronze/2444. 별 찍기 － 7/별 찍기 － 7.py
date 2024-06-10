def draw_diamond(n):
    for i in range(1, 2 * n):
        if i <= n:
            print(" " * (n - i) + "*" * (2 * i - 1))
        else:
            print(" " * (i - n) + "*" * (4 * n - 2 * i - 1))

def main():
    n = int(input())
    draw_diamond(n)

if __name__ == "__main__":
    main()
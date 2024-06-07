def greatest_num(a, b):
    new_a = int(''.join(reversed(a)))
    new_b = int(''.join(reversed(b)))
    return max(new_a, new_b)

def main():
    a, b = map(list, input().split())
    result = greatest_num(a, b)
    print(result)

if __name__ == "__main__":
    main()
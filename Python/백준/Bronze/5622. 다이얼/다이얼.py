def a_to_i(text):
    result = 0
    for a in text:
        int_a = ord(a)
        if 65 <= int_a <= 67:        # 'A', 'B', 'C'
            result += 3
        elif 68 <= int_a <= 70:      # 'D', 'E', 'F'
            result += 4
        elif 71 <= int_a <= 73:      # 'G', 'H', 'I'
            result += 5
        elif 74 <= int_a <= 76:      # 'J', 'K', 'L'
            result += 6
        elif 77 <= int_a <= 79:      # 'M', 'N', 'O'
            result += 7
        elif 80 <= int_a <= 83:      # 'P', 'Q', 'R', 'S'
            result += 8
        elif 84 <= int_a <= 86:      # 'T', 'U', 'V'
            result += 9
        elif 87 <= int_a <= 90:      # 'W', 'X', 'Y', 'Z'
            result += 10
    return result

def main():
    text = str(input())
    print(a_to_i(text))

if __name__ == "__main__":
    main()
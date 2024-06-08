def dial_time(word):
    dial_str = 'ABC DEF GHI JKL MNO PQRS TUV WXYZ'
    dial = {char: idx + 3 for idx, group in enumerate(dial_str.split()) for char in group}
    
    return sum(dial[char] for char in word)

def main():
    text = input().strip()
    print(dial_time(text))

if __name__ == "__main__":
    main()
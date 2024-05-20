T = int(input())

for _ in range(T):
    H, W, N = map(int, input().split())
    floor = (N - 1) % H + 1
    room_number = (N - 1) // H + 1
    print(f"{floor}{room_number:02d}")

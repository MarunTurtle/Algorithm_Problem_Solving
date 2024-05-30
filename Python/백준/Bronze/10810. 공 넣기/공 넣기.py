n, m = map(int, input().split())
baskets = [0 for _ in range(n)]

def insert_balls(baskets, m):
    for _ in range(m):
        start, finish, ball_num = map(int, input().split())
        for i in range(start, finish + 1):
            baskets[i-1] = ball_num

insert_balls(baskets, m)
print(' '.join(map(str, baskets)))
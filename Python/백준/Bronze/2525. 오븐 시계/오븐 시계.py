h, m = map(int, input().split())
p = int(input())

def add_min(h, m, p):
    nm = m + p
    addh = nm // 60
    nm = (m + p) % 60
    nh = (h + addh) % 24
    print(f"{nh} {nm}")

add_min(h, m, p)
org_list = list(map(int, input().split()))
chess_list = [1, 1, 2, 2, 2, 8]

for i, j in enumerate(org_list):
    org_list[i] = chess_list[i] - j

print(' '.join(map(str, org_list)))
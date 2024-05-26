total = int(input())
num_items = int(input())
items = [list(map(int, input().split())) for i in range(num_items)]

sum = 0
for i in range(num_items):
    sum += items[i][0] * items[i][1]

if sum == total:
    print("Yes")
else:
    print("No")
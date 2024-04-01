list = []

for i in range(28):
    a = int(input())
    list.append(a)

for i in range(1, 31):
    if i not in list:
        print(i)
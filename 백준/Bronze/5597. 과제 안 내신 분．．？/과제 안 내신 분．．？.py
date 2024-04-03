A = []
for i in range(28):
    a = int(input())
    A.append(a)

for i in range(1, 31):
    if i not in A:
        print(i)
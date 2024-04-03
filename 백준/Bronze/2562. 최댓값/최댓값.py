numbers = []

for i in range(9):
  a = int(input())
  numbers.append(a)

max_value = max(numbers)
index_max = numbers.index(max_value) + 1

print(max_value, index_max, sep="\n")
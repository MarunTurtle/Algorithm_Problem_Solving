n, x = map(int, input().split())
numbers = input().split()
filtered_numbers = [num for num in numbers if int(num) < x]
answer = ' '.join(filtered_numbers)
print(answer)
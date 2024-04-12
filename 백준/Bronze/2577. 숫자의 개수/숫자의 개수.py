# Input
A = int(input())
B = int(input())
C = int(input())

# Product of A, B, C
product = A * B * C

# Array to count digits from 0 to 9
digit_count = [0] * 10

# Count digits using arithmetic
temp = product
while temp > 0:
    last_digit = temp % 10  # Get the last digit
    digit_count[last_digit] += 1  # Increment the count for this digit
    temp //= 10  # Remove the last digit

# Output the count of each digit
for count in digit_count:
    print(count)

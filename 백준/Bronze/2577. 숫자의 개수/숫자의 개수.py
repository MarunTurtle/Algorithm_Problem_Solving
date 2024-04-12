# Input
A = int(input())
B = int(input())
C = int(input())

# Product of A, B, C
product = A * B * C
P = list(str(product))  # Convert product to string, then to list of its characters

# Count numbers of 0-9
for i in range(10):
    print(P.count(str(i)))  # Convert i to string before counting

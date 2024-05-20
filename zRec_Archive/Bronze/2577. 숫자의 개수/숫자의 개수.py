a = int(input())
b = int(input())
c = int(input())

product = str(a*b*c)

for i in range(10):
    print(product.count(str(i)))
a = list(map(int, input().split()))

def func(x):
  result = sum(i**2 for i in x)
  return result % 10

print(func(a))

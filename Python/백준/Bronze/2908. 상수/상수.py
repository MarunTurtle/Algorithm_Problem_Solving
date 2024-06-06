a, b = map(str, input().split())

new_a = int(''.join(reversed(a)))
new_b = int(''.join(reversed(b)))

print(max(new_a, new_b))
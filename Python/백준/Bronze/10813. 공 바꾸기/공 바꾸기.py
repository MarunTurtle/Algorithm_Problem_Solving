n, m = map(int, input().split())

def switch(n, m):
    baskets = list(range(1, n+1))
    for i in range(m):
        a, b = map(int, input().split())
        new_basket_a = baskets[b-1]
        new_basket_b = baskets[a-1]
        baskets[a-1] = new_basket_a
        baskets[b-1] = new_basket_b
    return baskets

print(' '.join(map(str, switch(n, m))))
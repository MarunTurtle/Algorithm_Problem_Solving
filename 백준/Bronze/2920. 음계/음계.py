notes = list(map(int, input().split()))

if sorted(notes) == notes:
    print('ascending')
elif sorted(notes, reverse=True) == notes:
    print('descending')
else:
    print('mixed')
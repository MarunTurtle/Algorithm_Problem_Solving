s = input().upper()
B = list(set(s))

counts = [s.count(chr) for chr in B]

if counts.count(max(counts)) >= 2:
    print("?")
else:
    print(B[counts.index(max(counts))])
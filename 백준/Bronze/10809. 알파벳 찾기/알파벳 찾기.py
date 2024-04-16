s = input()

A = {chr(97 + i):-1 for i in range (26)}

for j in range(len(s)):
    if A[s[j]] == -1:
        A[s[j]] = j

print(' '.join(map(str, A.values())))

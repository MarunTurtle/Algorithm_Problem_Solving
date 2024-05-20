n = int(input())

for _ in range(n):
    quiz = str(input())
    points = 0
    bonus = 0
    for answer in quiz:
        if answer == "O":
            points += (1 + bonus) 
            bonus += 1
        else:
            bonus = 0
    print(points)

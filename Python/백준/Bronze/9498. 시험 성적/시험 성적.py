score = int(input())
def score_calc(s):
    if s >= 90 and s <= 100:
        print("A")
    elif s >=80:
        print("B")
    elif s >= 70:
        print("C")
    elif s >= 60:
        print("D")
    else:
        print("F")
        
score_calc(score)
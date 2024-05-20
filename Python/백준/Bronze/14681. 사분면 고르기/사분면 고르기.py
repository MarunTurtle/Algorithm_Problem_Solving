x = int(input())
y = int(input())

def quad(x, y):
    if x > 0 and y > 0:
        print("1")    
    elif x < 0 and y > 0:
        print("2")
    elif x < 0 and y < 0:
        print("3")
    elif x > 0 and y < 0:
        print("4")

quad(x, y)
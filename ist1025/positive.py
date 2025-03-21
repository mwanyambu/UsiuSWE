#test for positive number
def positive():
    n = int(input("Enter a number: "))
    if n > 0:
        if n == 0:
            print(n,"is zero")
        print(n,"is a positive number")
    else:
        print(n,"is a negative number")
positive()
def factorial():
    """
    This function calculates the factorial of a number.
    """
    print("welcome to the factorial calculating program")
    
    print("=============================================")

    n = int(input("which factorial do you want to calculate: "))
    if n > 0:
        fact = 1
        for i in range(1, n+1):
            fact = fact * i
        print(fact)
    else:
        print("enter a positive integer")
factorial()

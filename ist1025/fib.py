def fib():
    """
    this function generates the fibonacci sequence
    to demonstrate code reuse and recursion
    """
    
    print("welcome to the fibinacci sequence program")
    print("=========================================")
    n = int(input("how many fibonacci terms do you want to generate? "))
    if n >= 0:
        a, b = 0, 1
        while a < n:
            print(a, end=' ')
            a, b = b, a+b
        print()
    else:
        print("enter a positive integer")
fib()

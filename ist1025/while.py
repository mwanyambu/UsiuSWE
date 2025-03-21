#program to demonstarte while loop by adding natural numbers

n = int(input("enter how many natural numbers you want to add: "))

sum = 0
i = 1

while i <= n:
    sum += i
    print("the sum of the first", i, "natural numbers is: ", sum)
    i += 1
    

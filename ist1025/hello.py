#function accepts name and age from user and greets them
def greet():
    name = input("what is your name? ")
    age = int(input("how old are you: "))

    print(f"hello {name} you are {age} years old")
greet()

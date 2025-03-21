def greet():
    """
    this function greets the user
    """
    
    name = input("What is your name? ") #this line prompts user for their name
    age = int(input("How old are you? ")) #this line prompts user for their age
    print(f"Hello, {name}! You are {age} years old.")
greet() #this line calls the greet function

def salamu(jina):
    """
    function sends salamu
    """

    print("shikamoo", jina, "waendeleaje")
salamu("john")

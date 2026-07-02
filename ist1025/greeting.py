def greet():
    """
    this function greets the user
    """
    
    jina = input("waitwa nani? ") #this line prompts user for their name
    age = int(input("uko umri gani? ")) #this line prompts user for their age
    print(f"Jambo, {jina}! uko na miaka {age}")
greet() #this line calls the greet function

def salamu(jina):
    """
    function sends salamu
    """

    print("shikamoo", jina, "waendeleaje")
salamu("shighadi") #this line calls the salamu function

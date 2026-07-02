def listnums(n):

    list1 = []
    for i in range(n):
        list1.append(i)

    for i  in list1:
        if i % 2 == 0:
            print(f"{i} is even")
        else:
            print(f"{i} is odd")


num = input("Enter a number: ")

listnums(int(num))
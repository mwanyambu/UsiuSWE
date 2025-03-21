lis1 = []
for i in range(10):
    if i % 2 == 0:
        lis1.append(i)
print(lis1)

sum = 0
for i in range(10):
    print("i = ", i)
    sum += i
    if sum == 10:
        break
print(sum)
def sum_elements(list, target):
    target = sum(list)
    for i in list:
        if i + i == target:
            return i.enumerate(i)
    return -1

print(sum_elements([1, 2, 3, 4, 10], 10))  # Output: -1
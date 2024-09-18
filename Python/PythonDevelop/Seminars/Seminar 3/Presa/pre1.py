# Задача №1. Решение в группах
# Дан список чисел. Определите, сколько в нем
# встречается различных чисел.
# Input: [1, 1, 2, 0, -1, 3, 4, 4]
# Output: 6

list1 = [1, 1, 2, 0, -1, 3, 4, 4]
list2 = []
result = 0

for i in list1:
    if i in list2:
        continue
    else:
        list2.append(i)
        result = len(list2)

print(result)        
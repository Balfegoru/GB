# Задача 1 НЕГАФИБОНАЧЧИ по желанию

# Задайте число. Составьте список чисел Фибоначчи, в том числе для отрицательных индексов.

# Пример:

# для k = 9 список будет выглядеть так: [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21] [Негафибоначчи]​

k = 11
list1 = [i for i in range(k)]
print(list1)
for i in range(len(list1)):
    if i >=2 :
        list1[i] = list1[i-1] + list1[i - 2]


list2 = [ i for i in list1[::-1]]
for i in range(len(list2)):
    if i % 2 == 0:
        list2[i] = list2[i] * -1

print(list2)

resultList = list2[:-1] + list1[:]

print(resultList)

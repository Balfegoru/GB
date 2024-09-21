# Задача №2. Решение в группах
# Дана последовательность из N целых чисел и число
# K. Необходимо сдвинуть всю последовательность
# (сдвиг - циклический) на K элементов вправо, K –
# положительное число.
# Input: [1, 2, 3, 4, 5] k = 3
# Output: [4, 5, 1, 2, 3]
# Примечание: Пользователь может вводить значения
# списка или список задан изначально.

list1 = [1, 2, 3, 4, 5]

k = 3
if k > len(list1):
    while k >= len(list1):
        k -= len(list1)
list2 = [None for i in list1]

# print(list2)
print(len(list1))
for i in range(len(list1)):
    print(i+k, end = " ")
    if i+k > len(list1):
        list2[i+k - len(list1)] = list1[i]
    else:
        list2[i+k - len(list1)] = list1[i]

print(list2)


# Задача 5. Пропавшая карточка
# Для настольной игры используются карточки с номерами от 1 до N. Одна
# карточка потерялась. Напишите программу, которая поможет найти потерянную
# карточку, если номера оставшихся известны. Найдите её, зная номера
# оставшихся карточек.
# Введите число карточек — N.
# Затем введите N − 1 номера оставшихся карточек. Они могут быть введены в
# любом порядке.

import random as rand

N = 14
num = rand.randint(1,N)
list1 = [i for i in range(1,N+1)]
list2 = [None if i == num else i for i in range(1,N+1) ]
set1,set2 = set(list1),set(list2)

print(list1)
print(list2)

result = set1 - set2
print(result)
# e = [x if x > 4 else 'less than 4' for x in lst]

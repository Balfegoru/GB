# Задание 1: Видеокарты
# В базе магазина электроники есть список видеокарт компании NVIDIA разных
# поколений. Вместо полных названий хранятся только числа, которые обозначают
# модель и поколение видеокарты. Недавно компания выпустила новую линейку
# видеокарт. Самые старшие поколения разобрали за пару дней.
# Напишите программу, которая удаляет наибольшие элементы из списка видеокарт.
# Пример:
# Количество видеокарт: 5
# Видеокарта 1: 3070
# Видеокарта 2: 2060
# Видеокарта 3: 3090
# Видеокарта 4: 3070
# Видеокарта 5: 3090
# Старый список видеокарт: [ 3070 2060 3090 3070 3090 ]
# Новый список видеокарт: [ 3070 2060 3070 ]

list1 = [3070,2060,3090,3070,3090]
max = list1[0]
for i in list1:
    if i > max:
        max = i
list2 = []
for i in list1:
    if i != max:
        list2.append(i)

print(list2)


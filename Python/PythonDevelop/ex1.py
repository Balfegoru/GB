# Задание 1. Поиск элемента
# Пользователь вводит искомый ключ. Если он хочет, то может ввести
# максимальную глубину — уровень, до которого будет просматриваться
# структура.
# Напишите функцию, которая находит заданный пользователем ключ в словаре
# и выдаёт значение этого ключа на экран. По умолчанию уровень не задан. В
# качестве примера можно использовать такой словарь:

# Пример 1
# Введите искомый ключ: head
# Хотите ввести максимальную глубину? Y/N: n
# Значение ключа: {'title': 'Мой сайт'}
# Пример 2
# Введите искомый ключ: head
# Хотите ввести максимальную глубину? Y/N: y
# Введите максимальную глубину: 1
# Значение ключа: None

# for item in dictionary: # for (k,v) in dictionary.items():
# print('{}: {}'.format(item, dictionary[item]))

# string = input("Введите искомый ключ:")
# string = input("Введите искомый ключ:")

# n = input("Хотите ввести максимальную глубину? Y/N:").strip()

# if n.lower() == 'y':
#     a = int(input("Введите глубину"))
# elif n.lower() == 'n':
#     print("elif")
#     a = 1
# else:
#     print("else")
#     a = 1
    
# num = 0
# asd = None

# while num < a:

#     if string in site:
#         print(f"{site.get(string)}")
#     num+=1

# string = "html"

# string = "html"
# string = "html"
# string = "html"

# if site.get(string) == None:
#     print(site.keys())
#     print(site.get(string))

# print(88.36 * 1.2 +(13.4*103)+(4.8*176)-(5.7 * 36))
# print(1800)

site = {
    'html': {

    'head': {'title': 'Мой сайт'},

    'body': {
    'h2': 'Здесь будет мой заголовок',
    'div': 'Тут, наверное, какой-то блок',
    'p': 'А вот здесь новый абзац'
            }   
        }
}

string = "head"

for i in site.values():
    print(i)
    for v in i.values():
        print(i)
    

